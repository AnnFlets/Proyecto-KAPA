/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Ana
 */
public class FrmVentas extends javax.swing.JFrame {

    /**
     * Creates new form FrmVentas
     */
    public FrmVentas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jopMensajeVentas = new javax.swing.JOptionPane();
        jPanel2 = new javax.swing.JPanel();
        lblSalirVentas = new javax.swing.JLabel();
        lblReportesVentas = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtNumeroVentas = new javax.swing.JTextField();
        cmbEstadoVentas = new javax.swing.JComboBox<>();
        txtIdVentas = new javax.swing.JTextField();
        btnAceptarVentas = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSerieVentas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFechaVentas = new javax.swing.JTextField();
        txtTotalVentas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombreClienteVentas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtApellidoClienteVentas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNitClienteVentas = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVentas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDetalleVentas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrador de Ventas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSalirVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        jPanel2.add(lblSalirVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        lblReportesVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte.png"))); // NOI18N
        jPanel2.add(lblReportesVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 70, 580));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNumeroVentas.setEditable(false);
        txtNumeroVentas.setBackground(new java.awt.Color(204, 204, 204));
        txtNumeroVentas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNumeroVentas.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(txtNumeroVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 190, 30));

        cmbEstadoVentas.setBackground(new java.awt.Color(255, 255, 255));
        cmbEstadoVentas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cmbEstadoVentas.setForeground(new java.awt.Color(51, 51, 51));
        cmbEstadoVentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Confirmado" }));
        jPanel1.add(cmbEstadoVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 190, 30));

        txtIdVentas.setEditable(false);
        txtIdVentas.setBackground(new java.awt.Color(169, 234, 255));
        txtIdVentas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtIdVentas.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(txtIdVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 190, 30));

        btnAceptarVentas.setBackground(new java.awt.Color(49, 99, 123));
        btnAceptarVentas.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnAceptarVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarVentas.setText("ACTUALIZAR");
        btnAceptarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarVentasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptarVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 160, 130, 60));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 55)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DATOS DE VENTA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 470, 60));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Número");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Serie");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        txtSerieVentas.setEditable(false);
        txtSerieVentas.setBackground(new java.awt.Color(204, 204, 204));
        txtSerieVentas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtSerieVentas.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(txtSerieVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 190, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, -1, -1));

        txtFechaVentas.setEditable(false);
        txtFechaVentas.setBackground(new java.awt.Color(204, 204, 204));
        txtFechaVentas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtFechaVentas.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(txtFechaVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 190, 30));

        txtTotalVentas.setEditable(false);
        txtTotalVentas.setBackground(new java.awt.Color(204, 204, 204));
        txtTotalVentas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtTotalVentas.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(txtTotalVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 190, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre del cliente");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        txtNombreClienteVentas.setEditable(false);
        txtNombreClienteVentas.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreClienteVentas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNombreClienteVentas.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(txtNombreClienteVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 190, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Apellido del cliente");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        txtApellidoClienteVentas.setEditable(false);
        txtApellidoClienteVentas.setBackground(new java.awt.Color(204, 204, 204));
        txtApellidoClienteVentas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtApellidoClienteVentas.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(txtApellidoClienteVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 190, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Estado");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, -1, -1));

        txtNitClienteVentas.setEditable(false);
        txtNitClienteVentas.setBackground(new java.awt.Color(204, 204, 204));
        txtNitClienteVentas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNitClienteVentas.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(txtNitClienteVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 190, 30));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("NIT del cliente");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fecha");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoLogin.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 270));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 270));

        tblVentas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblVentas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 940, 250));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(73, 73, 73));
        jLabel2.setText("DETALLES DE LA FACTURA");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        tblDetalleVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDetalleVentas.setEnabled(false);
        jScrollPane2.setViewportView(tblDetalleVentas);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 940, 190));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(73, 73, 73));
        jLabel3.setText("De doble clic sobre la venta para seleccionarla.");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 1000, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarVentasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptarVentas;
    public javax.swing.JComboBox<String> cmbEstadoVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JOptionPane jopMensajeVentas;
    public javax.swing.JLabel lblReportesVentas;
    public javax.swing.JLabel lblSalirVentas;
    public javax.swing.JTable tblDetalleVentas;
    public javax.swing.JTable tblVentas;
    public javax.swing.JTextField txtApellidoClienteVentas;
    public javax.swing.JTextField txtFechaVentas;
    public javax.swing.JTextField txtIdVentas;
    public javax.swing.JTextField txtNitClienteVentas;
    public javax.swing.JTextField txtNombreClienteVentas;
    public javax.swing.JTextField txtNumeroVentas;
    public javax.swing.JTextField txtSerieVentas;
    public javax.swing.JTextField txtTotalVentas;
    // End of variables declaration//GEN-END:variables
}
