package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.table.DefaultTableModel;
import modelo.ClienteDAO;
import modelo.ClienteVO;
import modelo.VentaDAO;
import modelo.VentaVO;
import vista.FrmVentas;

public class ControladorVenta implements ActionListener, WindowListener, MouseListener{
    FrmVentas vVentas = new FrmVentas();
    VentaVO vvo = new VentaVO();
    VentaDAO vdao = new VentaDAO();
    ClienteVO cvo = new ClienteVO();
    ClienteDAO cdao = new ClienteDAO();

    public ControladorVenta(FrmVentas vVentas) {
        this.vVentas = vVentas;
        this.vVentas.addWindowListener(this);
        this.vVentas.tblVentas.addMouseListener(this);
        this.vVentas.lblReportesVentas.addMouseListener(this);
        this.vVentas.lblSalirVentas.addMouseListener(this);
        this.vVentas.btnAceptarVentas.addActionListener(this);
    }

    private void mostrarVentas(){
        DefaultTableModel modeloTablaVentas = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        modeloTablaVentas.setColumnCount(0);
        modeloTablaVentas.addColumn("ID");
        modeloTablaVentas.addColumn("Número");
        modeloTablaVentas.addColumn("Serie");
        modeloTablaVentas.addColumn("Fecha");
        modeloTablaVentas.addColumn("Total");
        modeloTablaVentas.addColumn("Tipo pago");
        modeloTablaVentas.addColumn("Estado");
        modeloTablaVentas.addColumn("ID Cliente");
        for(VentaVO vvo : vdao.consultarVenta()){
            modeloTablaVentas.addRow(new Object[]{vvo.getIdFactura(),
            vvo.getNumeroFactura(), vvo.getSerieFactura(),
            vvo.getFechaFactura(), vvo.getTotalFactura(),
            vvo.getTipoPagoFactura(), vvo.getEstadoFactura(),
            vvo.getIdClienteFK()});
        }
        this.vVentas.tblVentas.setModel(modeloTablaVentas);
        this.vVentas.tblVentas.getTableHeader().setReorderingAllowed(false);
        this.vVentas.tblVentas.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        this.vVentas.tblVentas.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        this.vVentas.tblVentas.getColumnModel().getColumn(0).setMaxWidth(0);
        this.vVentas.tblVentas.getColumnModel().getColumn(0).setMinWidth(0);
        this.vVentas.tblVentas.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);
        this.vVentas.tblVentas.getTableHeader().getColumnModel().getColumn(5).setMinWidth(0);
        this.vVentas.tblVentas.getColumnModel().getColumn(5).setMaxWidth(0);
        this.vVentas.tblVentas.getColumnModel().getColumn(5).setMinWidth(0);
        this.vVentas.tblVentas.getTableHeader().getColumnModel().getColumn(7).setMaxWidth(0);
        this.vVentas.tblVentas.getTableHeader().getColumnModel().getColumn(7).setMinWidth(0);
        this.vVentas.tblVentas.getColumnModel().getColumn(7).setMaxWidth(0);
        this.vVentas.tblVentas.getColumnModel().getColumn(7).setMinWidth(0);
    }
    
    private void llenarCamposVenta() {
        int numero = 0;
        while (numero < 8) {
            switch (numero) {
                case 0:
                    this.vVentas.txtIdVentas.setText(String.valueOf(this.vVentas.tblVentas.getValueAt(this.vVentas.tblVentas.getSelectedRow(), numero)));
                    break;
                case 1:
                    this.vVentas.txtNumeroVentas.setText(String.valueOf(this.vVentas.tblVentas.getValueAt(this.vVentas.tblVentas.getSelectedRow(), numero)));
                    break;
                case 2:
                    this.vVentas.txtSerieVentas.setText(String.valueOf(this.vVentas.tblVentas.getValueAt(this.vVentas.tblVentas.getSelectedRow(), numero)));
                    break;
                case 3:
                    this.vVentas.txtFechaVentas.setText(String.valueOf(this.vVentas.tblVentas.getValueAt(this.vVentas.tblVentas.getSelectedRow(), numero)));
                    break;
                case 4:
                    this.vVentas.txtTotalVentas.setText(String.valueOf(this.vVentas.tblVentas.getValueAt(this.vVentas.tblVentas.getSelectedRow(), numero)));
                    break;
                case 5:
                    break;
                case 6:
                    this.vVentas.cmbEstadoVentas.setSelectedItem(String.valueOf(this.vVentas.tblVentas.getValueAt(this.vVentas.tblVentas.getSelectedRow(), numero)));
                    break;
                case 7:
                    llenarCamposCliente(numero);
                    break;
            }
            numero++;
        }
    }
    
    private void llenarCamposCliente(int numero){
        for(ClienteVO cvo : cdao.consultarCliente()){
            if(String.valueOf(cvo.getIdCliente()).equals(String.valueOf(this.vVentas.tblVentas.getValueAt(this.vVentas.tblVentas.getSelectedRow(), numero)))){
                this.vVentas.txtNombreClienteVentas.setText(cvo.getNombreCliente());
                this.vVentas.txtApellidoClienteVentas.setText(cvo.getApellidoCliente());
                this.vVentas.txtNitClienteVentas.setText(cvo.getNitCliente());
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == this.vVentas.btnAceptarVentas){
            System.out.println("Actualizar");
        }
    }

    @Override
    public void windowOpened(WindowEvent we) {
        mostrarVentas();
    }

    @Override
    public void windowClosing(WindowEvent we) {
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
        mostrarVentas();
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
        if(me.getSource() == this.vVentas.tblVentas){
            if(me.getClickCount() == 2){
                llenarCamposVenta();
            }
        }
        if (me.getSource() == this.vVentas.lblReportesVentas) {
            System.out.println("Generar reporte");
        }
        if (me.getSource() == this.vVentas.lblSalirVentas) {
            this.vVentas.dispose();
        }
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
}