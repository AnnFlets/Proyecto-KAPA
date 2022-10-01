package modelo;

import conexion.Conector;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DetalleFacturaDAO implements ConsultarDetalleFactura{

    @Override
    public ArrayList<DetalleFacturaVO> consultarDetalleFactura() {
        Conector conector = new Conector();
        ArrayList<DetalleFacturaVO> informacionDetalle = new ArrayList<>();
        try{
            conector.conectar();
            String query = "SELECT "
                    + "d.id_detalle_factura, "
                    + "d.cantidad_detalle_factura, "
                    + "d.subtotal_detalle_factura, "
                    + "d.id_factura_fk, "
                    + "d.id_producto_fk "
                    + "FROM detalle_factura d";
            ResultSet resultSet = conector.consultaDatos(query);
            while(resultSet.next()){
                DetalleFacturaVO dfvo = new DetalleFacturaVO();
                dfvo.setIdDetalleFactura(resultSet.getInt(1));
                dfvo.setCantidadDetalleFactura(resultSet.getInt(2));
                dfvo.setSubtotalDetalleFactura(resultSet.getDouble(3));
                dfvo.setIdFacturaFK(resultSet.getInt(4));
                dfvo.setIdProductoFK(resultSet.getInt(5));
                informacionDetalle.add(dfvo);
            }
            conector.desconectar();
        }catch(Exception e){
            System.err.println("Error[Consultar-Detalle-Factura]: " + e.getMessage());
            conector.desconectar();
        }
        return informacionDetalle;
    }
}