package kapa;

import conexion.Conector;
import controlador.ControladorLogin;
import controlador.ControladorMenu;
import controlador.ControladorVenta;
import modelo.UsuarioDAO;
import modelo.UsuarioVO;
import modelo.VentaDAO;
import modelo.VentaVO;
import vista.FrmLogin;
import vista.FrmMenu;
import vista.FrmVentas;

public class Kapa {

    public static void main(String[] args) {
        /**
         * Vistas
         */
        FrmLogin vLogin = new FrmLogin();
        FrmMenu vMenu = new FrmMenu();
        FrmVentas vVentas = new FrmVentas();
        /**
         * Modelos
         */
        UsuarioVO uvo = new UsuarioVO();
        UsuarioDAO udao = new UsuarioDAO();
        VentaVO vvo = new VentaVO();
        VentaDAO vdao = new VentaDAO();
        //480,640
        /**
         * Controladores
         */
        ControladorLogin cLogin = new ControladorLogin(vLogin, vMenu);
        ControladorMenu cMenu = new ControladorMenu(vLogin, vMenu, vVentas);
        ControladorVenta cVenta = new ControladorVenta(vVentas);
        /**
         * Configuración vista inicial
         */
        vLogin.setVisible(true);
        vLogin.setLocationRelativeTo(null);
        vLogin.setResizable(false);
        vLogin.setSize(480,660);
        
        /*Prueba de conexión
        Conector conector = new Conector();
        conector.conectar();
        */
    }
}