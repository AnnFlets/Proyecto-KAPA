package modelo;

import conexion.Conector;
import extras.Extras;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClienteDAO implements ConsultarCliente{
    
    ErrorVO evo = new ErrorVO();
    ErrorDAO edao = new ErrorDAO();
    Extras extras = new Extras();

    @Override
    public boolean insertarCliente(ClienteVO cvo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ClienteVO> consultarCliente() {
        Conector conector = new Conector();
        ArrayList<ClienteVO> informacionCliente = new ArrayList<>();
        try{
            conector.conectar();
            String query = "SELECT "
                    + "c.id_cliente, "
                    + "c.usuario_cliente, "
                    + "c.contrasenia_cliente, "
                    + "c.nombre_cliente, "
                    + "c.apellido_cliente, "
                    + "c.nit_cliente, "
                    + "c.direccion_cliente, "
                    + "c.telefono_cliente, "
                    + "c.correo_cliente "
                    + "FROM cliente c";
            ResultSet resultSet = conector.consultaDatos(query);
            while(resultSet.next()){
                ClienteVO cvo = new ClienteVO();
                cvo.setIdCliente(resultSet.getInt(1));
                cvo.setUsuarioCliente(resultSet.getString(2));
                cvo.setContraseniaCliente(resultSet.getString(3));
                cvo.setNombreCliente(resultSet.getString(4));
                cvo.setApellidoCliente(resultSet.getString(5));
                cvo.setNitCliente(resultSet.getString(6));
                cvo.setDireccionCliente(resultSet.getString(7));
                cvo.setTelefonoCliente(resultSet.getString(8));
                cvo.setCorreoCliente(resultSet.getString(9));
                informacionCliente.add(cvo);
            }
            conector.desconectar();
        }catch(Exception e){
            evo.setDescripcionError("[Consultar-Cliente]: " + e.getMessage());
            evo.setFechaError(extras.devolverFechaActual());
            edao.insertarError(evo);
            conector.desconectar();
        }
        return informacionCliente;
    }

    @Override
    public boolean actualizarCliente(ClienteVO cvo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarCliente(ClienteVO cvo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reporteCliente() {
        
    }
}