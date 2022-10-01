package modelo;

import conexion.Conector;
import java.sql.ResultSet;
import java.util.ArrayList;

public class VentaDAO implements ConsultarVenta{

    @Override
    public ArrayList<VentaVO> consultarVenta() {
        Conector conector = new Conector();
        ArrayList<VentaVO> informacionVenta = new ArrayList<>();
        try{
            conector.conectar();
            String query = "SELECT "
                    + "f.id_factura, "
                    + "f.numero_factura, "
                    + "f.serie_factura, "
                    + "f.fecha_factura, "
                    + "f.total_factura, "
                    + "f.tipo_pago_factura, "
                    + "f.estado_factura, "
                    + "f.id_cliente_fk "
                    + "FROM factura f";
            ResultSet resultSet = conector.consultaDatos(query);
            while(resultSet.next()){
                VentaVO vvo = new VentaVO();
                vvo.setIdFactura(resultSet.getInt(1));
                vvo.setNumeroFactura(resultSet.getInt(2));
                vvo.setSerieFactura(resultSet.getString(3));
                vvo.setFechaFactura(resultSet.getString(4));
                vvo.setTotalFactura(resultSet.getDouble(5));
                vvo.setTipoPagoFactura(resultSet.getString(6));
                vvo.setEstadoFactura(resultSet.getString(7));
                vvo.setIdClienteFK(resultSet.getInt(8));
                informacionVenta.add(vvo);
            }
            conector.desconectar();
        }catch(Exception e){
            System.err.println("Error[Consultar-Venta]: " + e.getMessage());
            conector.desconectar();
        }
        return informacionVenta;
    }

    @Override
    public boolean actualizarVenta(VentaVO vvo) {
        Conector conector = new Conector();
        try{
            conector.conectar();
            String query = "UPDATE dbkapa.factura f " +
            "SET f.estado_factura = '" + vvo.getEstadoFactura() + "' " +
                    "WHERE f.id_factura = " + vvo.getIdFactura();
            conector.consultasMultiples(query);
        }catch(Exception e){
            System.err.println("Error[Actualizar-Venta]: " + e.getMessage());
            conector.desconectar();
            return false;
        }
        conector.desconectar();
        return true;
    }

    @Override
    public void reporteVenta() {
        System.out.println("Generar reporte");
    }
}