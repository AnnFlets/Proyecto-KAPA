package kapa;

import controlador.ControladorLogin;
import controlador.ControladorMenu;
import controlador.ControladorVenta;
import modelo.ClienteDAO;
import modelo.ClienteVO;
import modelo.DetalleFacturaDAO;
import modelo.DetalleFacturaVO;
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
        ClienteVO cvo = new ClienteVO();
        ClienteDAO cdao = new ClienteDAO();
        VentaVO vvo = new VentaVO();
        VentaDAO vdao = new VentaDAO();
        DetalleFacturaVO dfvo = new DetalleFacturaVO();
        DetalleFacturaDAO dfdao = new DetalleFacturaDAO();
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
    }
}