package controlador;

import extras.Extras;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ProveedorDAO;
import modelo.ProveedorVO;
import vista.FrmProveedor;

public class ControladorProveedor implements ActionListener, WindowListener, MouseListener {

    FrmProveedor vProveedor = new FrmProveedor();
    ProveedorVO prvo = new ProveedorVO();
    ProveedorDAO prdao = new ProveedorDAO();
    Extras extras = new Extras();
    DefaultTableModel modeloTablaProveedor;
    boolean banderaReporte = false;

    /**
     * Controlador con parámetro
     *
     * @param vProveedor -> Representa la vista del administrador de proveedores
     */
    public ControladorProveedor(FrmProveedor vProveedor) {
        this.vProveedor = vProveedor;
        this.vProveedor.addWindowListener(this);
        this.vProveedor.btnCrear.addActionListener(this);
        this.vProveedor.btnActualizar.addActionListener(this);
        this.vProveedor.btnEliminar.addActionListener(this);
        this.vProveedor.btnReporte.addActionListener(this);
        this.vProveedor.btnSalir.addActionListener(this);
        this.vProveedor.tblProveedores.addMouseListener(this);
    }

    private void mostrarProveedores() {
        modeloTablaProveedor = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        modeloTablaProveedor.setColumnCount(0);
        modeloTablaProveedor.addColumn("ID");
        modeloTablaProveedor.addColumn("Nombre");
        modeloTablaProveedor.addColumn("Teléfono");
        for (ProveedorVO prvo : prdao.consultarProveedor()) {
            modeloTablaProveedor.addRow(new Object[]{prvo.getIdProveedor(),
                prvo.getNombreProveedor(), prvo.getTelefonoProveedor()});
        }
        this.vProveedor.tblProveedores.setModel(modeloTablaProveedor);
        this.vProveedor.tblProveedores.getTableHeader().setReorderingAllowed(false);
        this.vProveedor.tblProveedores.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        this.vProveedor.tblProveedores.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        this.vProveedor.tblProveedores.getColumnModel().getColumn(0).setMaxWidth(0);
        this.vProveedor.tblProveedores.getColumnModel().getColumn(0).setMinWidth(0);
    }

    private void llenarCamposProveedor() {
        int numero = 0;
        while (numero < 3) {
            switch (numero) {
                case 0:
                    this.vProveedor.txtIdProveedor.setText(String.valueOf(this.vProveedor.tblProveedores.getValueAt(this.vProveedor.tblProveedores.getSelectedRow(), numero)));
                    break;
                case 1:
                    this.vProveedor.txtNombreProveedor.setText(String.valueOf(this.vProveedor.tblProveedores.getValueAt(this.vProveedor.tblProveedores.getSelectedRow(), numero)));
                    break;
                case 2:
                    this.vProveedor.txtTelefonoProveedor.setText(String.valueOf(this.vProveedor.tblProveedores.getValueAt(this.vProveedor.tblProveedores.getSelectedRow(), numero)));
                    break;
            }
            numero++;
        }
    }

    private boolean verificarProveedorDuplicado(int opcion) {
        boolean banderaProveedor = true;
        int contador = 0;
        for (ProveedorVO proveedor : prdao.consultarProveedor()) {
            if (opcion == 1) {
                if (proveedor.getNombreProveedor().equals(this.vProveedor.txtNombreProveedor.getText())
                        || proveedor.getTelefonoProveedor().equals(this.vProveedor.txtTelefonoProveedor.getText())) {
                    banderaProveedor = false;
                    this.vProveedor.jopMensajeProveedor.showMessageDialog(null, "Ya existe un proveedor con el mismo nombre y/o teléfono.",
                            "Advertencia", JOptionPane.WARNING_MESSAGE);
                    break;
                }
            } else {
                if (proveedor.getNombreProveedor().equals(this.vProveedor.txtNombreProveedor.getText())
                        || proveedor.getTelefonoProveedor().equals(this.vProveedor.txtTelefonoProveedor.getText())) {
                    System.out.println(this.vProveedor.tblProveedores.getSelectedRow());
                    System.out.println(contador);
                    if (contador != this.vProveedor.tblProveedores.getSelectedRow()) {
                        banderaProveedor = false;
                        this.vProveedor.jopMensajeProveedor.showMessageDialog(null, "Ya existe un proveedor con el mismo nombre y/o teléfono.",
                                "Advertencia", JOptionPane.WARNING_MESSAGE);
                        limpiarCampos();
                        break;
                    }
                    contador++;
                }
            }
        }
        return banderaProveedor;
    }

    private void registrarProveedor() {
        if (!this.vProveedor.txtNombreProveedor.getText().isEmpty()
                && !this.vProveedor.txtTelefonoProveedor.getText().isEmpty()) {
            if (verificarProveedorDuplicado(1)) {
                this.prvo.setNombreProveedor(this.vProveedor.txtNombreProveedor.getText());
                this.prvo.setTelefonoProveedor(this.vProveedor.txtTelefonoProveedor.getText());
                if (prdao.insertarProveedor(prvo) == true) {
                    limpiarCampos();
                    this.vProveedor.jopMensajeProveedor.showMessageDialog(null, "Proveedor registrado correctamente.",
                            "Información", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    this.vProveedor.jopMensajeProveedor.showMessageDialog(null, "Error, datos no registrados.",
                            "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else {
            this.vProveedor.jopMensajeProveedor.showMessageDialog(null, "No ha ingresado ningún nombre y/o teléfono.",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void modificarProveedor() {
        if (!this.vProveedor.txtIdProveedor.getText().isEmpty()
                && !this.vProveedor.txtNombreProveedor.getText().isEmpty()
                && !this.vProveedor.txtTelefonoProveedor.getText().isEmpty()) {
            if (verificarProveedorDuplicado(2)) {
                this.prvo.setIdProveedor(Integer.parseInt(this.vProveedor.txtIdProveedor.getText()));
                this.prvo.setNombreProveedor(this.vProveedor.txtNombreProveedor.getText());
                this.prvo.setTelefonoProveedor(this.vProveedor.txtTelefonoProveedor.getText());
                if (prdao.actualizarProveedor(prvo) == true) {
                    limpiarCampos();
                    this.vProveedor.jopMensajeProveedor.showMessageDialog(null, "Proveedor actualizado correctamente.",
                            "Información", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    this.vProveedor.jopMensajeProveedor.showMessageDialog(null, "Error, no se pudo actualizar el proveedor.",
                            "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else {
            this.vProveedor.jopMensajeProveedor.showMessageDialog(null, "No ha seleccionado ningún proveedor.",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void eliminarProveedor() {
        if (!this.vProveedor.txtIdProveedor.getText().isEmpty()) {
            this.prvo.setIdProveedor(Integer.parseInt(this.vProveedor.txtIdProveedor.getText()));
            if (prdao.eliminarProveedor(prvo) == true) {
                limpiarCampos();
                this.vProveedor.jopMensajeProveedor.showMessageDialog(null, "Proveedor eliminado correctamente.",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                this.vProveedor.jopMensajeProveedor.showMessageDialog(null, "Error, no se pudo eliminar el proveedor.",
                        "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            this.vProveedor.jopMensajeProveedor.showMessageDialog(null, "No ha seleccionado ningún proveedor.",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void reporteProveedores() {
        prdao.reporteProveedor();
        prdao.jasperViewer.setDefaultCloseOperation(this.vProveedor.DISPOSE_ON_CLOSE);
        prdao.jasperViewer.setVisible(true);
        banderaReporte = true;
    }

    private void limpiarCampos() {
        this.vProveedor.txtIdProveedor.setText("");
        this.vProveedor.txtNombreProveedor.setText("");
        this.vProveedor.txtTelefonoProveedor.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.vProveedor.btnCrear) {
            registrarProveedor();
        }
        if (ae.getSource() == this.vProveedor.btnActualizar) {
            modificarProveedor();
        }
        if (ae.getSource() == this.vProveedor.btnEliminar) {
            eliminarProveedor();
        }
        if (ae.getSource() == this.vProveedor.btnReporte) {
            reporteProveedores();
        }
        if (ae.getSource() == this.vProveedor.btnSalir) {
            this.vProveedor.dispose();
            if (!this.vProveedor.txtIdProveedor.getText().isEmpty()) {
                limpiarCampos();
            }
            if (banderaReporte) {
                prdao.jasperViewer.setVisible(false);
            }
        }
    }

    @Override
    public void windowOpened(WindowEvent we) {
        mostrarProveedores();
    }

    @Override
    public void windowClosing(WindowEvent we) {
    }

    @Override
    public void windowClosed(WindowEvent we) {
        if (!this.vProveedor.txtIdProveedor.getText().isEmpty()) {
            limpiarCampos();
        }
        if (banderaReporte) {
            prdao.jasperViewer.setVisible(false);
        }
    }

    @Override
    public void windowIconified(WindowEvent we) {
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
    }

    @Override
    public void windowActivated(WindowEvent we) {
        mostrarProveedores();
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
        if (me.getSource() == this.vProveedor.tblProveedores) {
            if (me.getClickCount() == 2) {
                llenarCamposProveedor();
            }
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
