/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Pablo_Fuentes
 */
public class FrmProducto extends javax.swing.JFrame {

    /**
     * Creates new form frm_01producto
     */
    public FrmProducto() {
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

        jop_mensajes = new javax.swing.JOptionPane();
        jfile_imagenes = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_idproducto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txt_marca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_presentacion = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txt_categoria = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txt_precioucompra = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txt_preciouventa = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txt_existencias = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_imagen = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_imagen1 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        btn_salir = new javax.swing.JButton();
        btn_crear = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_reporte = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnImagenAgregar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jfile_imagenes.setCurrentDirectory(new java.io.File("C:\\"));

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            setTitle("Administrador de Productos");
            setBackground(new java.awt.Color(187, 128, 201));
            setName("frm_01producto"); // NOI18N
            setResizable(false);
            setSize(new java.awt.Dimension(1100, 600));
            getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setText("INGRESO DE PRODUCTO");
            getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, -1));

            jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText("ID");
            getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 40, -1));

            txt_idproducto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            txt_idproducto.setText("ID");
            txt_idproducto.setName("txt_idproducto"); // NOI18N
            getContentPane().add(txt_idproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 40, -1));

            jSeparator1.setForeground(new java.awt.Color(204, 153, 255));
            jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
            getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 10, 350));

            jSeparator2.setForeground(new java.awt.Color(204, 153, 255));
            jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
            getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, 65));

            jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(255, 255, 255));
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setText("Descripción");
            getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 289, -1));

            txt_descripcion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            txt_descripcion.setText("Desc.");
            txt_descripcion.setName("txt_descripcion"); // NOI18N
            getContentPane().add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 289, -1));

            jSeparator3.setForeground(new java.awt.Color(204, 153, 255));
            jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
            getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 10, 65));

            jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel4.setText("Marca");
            getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 150, -1));

            txt_marca.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            txt_marca.setText("Marca");
            txt_marca.setName("txt_descripcion"); // NOI18N
            getContentPane().add(txt_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 150, -1));

            jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel5.setText("Presentación");
            getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 190, -1));

            txt_presentacion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            txt_presentacion.setText("Present.");
            txt_presentacion.setName("txt_descripcion"); // NOI18N
            getContentPane().add(txt_presentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 190, -1));

            jSeparator6.setForeground(new java.awt.Color(204, 153, 255));
            jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
            getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 10, 50));

            jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel6.setText("Categoría");
            getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 150, -1));

            txt_categoria.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            txt_categoria.setText("Cate.");
            txt_categoria.setName("txt_descripcion"); // NOI18N
            getContentPane().add(txt_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 150, -1));

            jSeparator7.setForeground(new java.awt.Color(204, 153, 255));
            jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
            getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 10, 0, 140));

            jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel7.setText("Precio U. Compra");
            getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 110, 140, -1));

            txt_precioucompra.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            txt_precioucompra.setText("Precio U. Compra");
            txt_precioucompra.setName("txt_descripcion"); // NOI18N
            getContentPane().add(txt_precioucompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 130, 140, -1));

            jSeparator8.setForeground(new java.awt.Color(204, 153, 255));
            jSeparator8.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
            getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 1010, 20));

            jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            jLabel8.setForeground(new java.awt.Color(255, 255, 255));
            jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel8.setText("Precio U. Venta");
            getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 134, -1));

            txt_preciouventa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            txt_preciouventa.setText("Precio U. Compra");
            txt_preciouventa.setName("txt_descripcion"); // NOI18N
            getContentPane().add(txt_preciouventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

            jSeparator9.setForeground(new java.awt.Color(204, 153, 255));
            jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
            getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 11, 50));

            jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            jLabel9.setForeground(new java.awt.Color(255, 255, 255));
            jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel9.setText("Existencias");
            getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 90, -1));

            txt_existencias.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            txt_existencias.setText("Existencias");
            txt_existencias.setName("txt_descripcion"); // NOI18N
            getContentPane().add(txt_existencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 90, -1));

            jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel10.setText("Imagen del Producto");
            getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, 180, 90));

            txt_imagen.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            txt_imagen.setText("Imagen del roducto");
            txt_imagen.setName("txt_descripcion"); // NOI18N
            getContentPane().add(txt_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 210, 30));

            jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel11.setText("Nombre Proveedor");
            getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 150, -1));

            txt_imagen1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            txt_imagen1.setText("Nombre proveedor");
            txt_imagen1.setName("txt_descripcion"); // NOI18N
            getContentPane().add(txt_imagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 150, -1));

            jSeparator12.setForeground(new java.awt.Color(204, 153, 255));
            jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
            getContentPane().add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 10, 140));

            btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_java_4salir.png"))); // NOI18N
            btn_salir.setToolTipText("Regresar al menú principal");
            getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 40, 30));

            btn_crear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_java_1crear.png"))); // NOI18N
            btn_crear.setToolTipText("Crear (debe tener los campos llenos)");
            getContentPane().add(btn_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 40, 30));

            btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_java_2actulizar.png"))); // NOI18N
            btn_actualizar.setToolTipText("Actualizar (debe tener algún registro seleccionado)");
            getContentPane().add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 40, 30));

            btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_java_3eliminar.png"))); // NOI18N
            btn_eliminar.setToolTipText("Eliminar (debe tener algún registro seleccionado)");
            getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 40, 30));

            btn_reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_java_5reporte.png"))); // NOI18N
            btn_reporte.setToolTipText("Crear un reporte (Con los registros mostrados)");
            getContentPane().add(btn_reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 40, 30));

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
            ));
            jScrollPane1.setViewportView(jTable1);

            getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 990, 340));

            btnImagenAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_java_1crear.png"))); // NOI18N
            btnImagenAgregar.setToolTipText("Agregar Imagen");
            getContentPane().add(btnImagenAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 40, 30));

            jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoLogin.png"))); // NOI18N
            getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1050, 160));

            jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoLogin.png"))); // NOI18N
            getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 156, 40, 350));

            pack();
        }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImagenAgregar;
    public javax.swing.JButton btn_actualizar;
    public javax.swing.JButton btn_crear;
    public javax.swing.JButton btn_eliminar;
    public javax.swing.JButton btn_reporte;
    public javax.swing.JButton btn_salir;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JFileChooser jfile_imagenes;
    private javax.swing.JOptionPane jop_mensajes;
    public javax.swing.JTextField txt_categoria;
    public javax.swing.JTextField txt_descripcion;
    public javax.swing.JTextField txt_existencias;
    public javax.swing.JTextField txt_idproducto;
    public javax.swing.JTextField txt_imagen;
    public javax.swing.JTextField txt_imagen1;
    public javax.swing.JTextField txt_marca;
    public javax.swing.JTextField txt_precioucompra;
    public javax.swing.JTextField txt_preciouventa;
    public javax.swing.JTextField txt_presentacion;
    // End of variables declaration//GEN-END:variables
}
