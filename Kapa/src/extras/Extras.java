package extras;

import conexion.Conector;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class Extras {
    
    //*METODO GUARDAR IMAGEN
    
   // public boolean guardarImagen(String ruta,String nombre){
//	String insert = "insert into Imagenes(imagen,nombre) values(?,?)";
//	FileInputStream fis = null;
//	PreparedStatement ps = null;
//	try {
//		Conector.conectar().setAutoCommit(false);
//		File file = new File(ruta);
//		fis = new FileInputStream(file);
//		ps = Conector.prepareStatement(insert);
//		ps.setBinaryStream(1,fis,(int)file.length());
//		ps.setString(2, nombre);
//		ps.executeUpdate();
//		Conector.commit();
//		return true;
//	} catch (Exception ex) {
//		Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
//	}finally{
//		try {
//			ps.close();
//			fis.close();
//		} catch (Exception ex) {
//			Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
//		}
//	}        
//	return false;
//}
   
  
}
