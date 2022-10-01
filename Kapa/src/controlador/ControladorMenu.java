package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import vista.FrmLogin;
import vista.FrmMenu;
import vista.FrmVentas;

public class ControladorMenu implements ActionListener, WindowListener{
    FrmLogin vLogin = new FrmLogin();
    FrmMenu vMenu = new FrmMenu();
    FrmVentas vVentas = new FrmVentas();

    /**
     * Constructor con parámetro
     * @param vMenu -> Representa la vista o JFrame del menú de administrador
     * @param vVentas -> Representa la vista o JFrame del administrador de ventas
     */
    public ControladorMenu(FrmLogin vLogin, FrmMenu vMenu, FrmVentas vVentas) {
        this.vLogin = vLogin;
        this.vMenu = vMenu;
        this.vVentas = vVentas;
        this.vMenu.addWindowListener(this);
        this.vMenu.btnIrProductos.addActionListener(this);
        this.vMenu.btnIrProveedores.addActionListener(this);
        this.vMenu.btnIrClientes.addActionListener(this);
        this.vMenu.btnIrVentas.addActionListener(this);
    }
    
    private void abrirVentas(){
        this.vVentas.setVisible(true);
        this.vVentas.setLocationRelativeTo(null);
        this.vVentas.setResizable(false);
        this.vVentas.setSize(1090,790);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == this.vMenu.btnIrProductos){
            
        }
        if(ae.getSource() == this.vMenu.btnIrProveedores){
            
        }
        if(ae.getSource() == this.vMenu.btnIrClientes){
            
        }
        if(ae.getSource() == this.vMenu.btnIrVentas){
            abrirVentas();
        }
    }

    @Override
    public void windowOpened(WindowEvent we) {
    }

    @Override
    public void windowClosing(WindowEvent we) {
        this.vVentas.dispose();
        this.vLogin.setVisible(true);
    }

    @Override
    public void windowClosed(WindowEvent we) {
    }

    @Override
    public void windowIconified(WindowEvent we) {
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
    }

    @Override
    public void windowActivated(WindowEvent we) {
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
    }
}