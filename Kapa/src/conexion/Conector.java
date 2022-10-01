package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conector {
    //Declaración de variables para la conexión
    private String driver = "com.mysql.jdbc.Driver";
    private String host = "grupo-kapa-2022.mysql.database.azure.com";
    private String user = "kapaad2022@grupo-kapa-2022.mysql.database.azure.com";
    private String pass = "kapa2022$$";
    private String db = "dbkapa";
    private String cadena;
    
    //Declaración de objetos para la conexion
    public Connection connection;
    Statement statement;
    
    //Declaración de métodos para la conexión con la bd
    public void conectar(){
        //Ruta de conexión
        this.cadena = "jdbc:mysql://" + this.host + "/" + this.db;
        try{
            Class.forName(this.driver).newInstance();
            this.connection = DriverManager.getConnection(this.cadena, this.user, this.pass);
        }catch(Exception e){
            System.err.println("Error[Conectar]: " + e.getMessage());
        }
    }
    
    public void desconectar(){
        try{
            this.connection.close();
        }catch(Exception e){
            System.err.println("Error[Desconectar]: " + e.getMessage());
        }
    }
    
    //Metodo para realizar las consultas INSERT, UPDATE, DELETE
    public int consultasMultiples(String query){
        int resultado = 0;
        try{
            this.conectar();
            this.statement = this.connection.createStatement();
            resultado = this.statement.executeUpdate(query);
        }catch(Exception e){
            System.err.println("Error[Consultas-Múltiples]: " + e.getMessage());
            return 0;
        }
        return resultado;
    }
    
    //Método para realizar consultas SELECT
    public ResultSet consultaDatos(String consulta){
        try{
            this.conectar();
            ResultSet resultado = null;
            this.statement = this.connection.createStatement();
            resultado = this.statement.executeQuery(consulta);
            return resultado;
        }catch(Exception e){
            System.err.println("Error[Consulta-Datos]: " + e.getMessage());
        }
        return null;
    }
}