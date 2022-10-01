package modelo;

import conexion.Conector;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UsuarioDAO implements ConsultarUsuario{

    @Override
    public ArrayList<UsuarioVO> consultarUsuario() {
        Conector conector = new Conector();
        ArrayList<UsuarioVO> informacionUsuario = new ArrayList<>();
        try{
            conector.conectar();
            String query = "SELECT "
                    + "a.id_usuario, "
                    + "a.nombre_usuario, "
                    + "a.contrasenia_usuario "
                    + "FROM administrador a";
            ResultSet resultSet = conector.consultaDatos(query);
            while(resultSet.next()){
                UsuarioVO uvo = new UsuarioVO();
                uvo.setIdUsuario(resultSet.getInt(1));
                uvo.setNombreUsuario(resultSet.getString(2));
                uvo.setContraseniaUsuario(resultSet.getString(3));
                informacionUsuario.add(uvo);
            }
            conector.desconectar();
        }catch(Exception e){
            System.err.println("Error[Consultar-Usuario]: " + e.getMessage());
            conector.desconectar();
        }
        return informacionUsuario;
    }
}