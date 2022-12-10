package view;

import controller.CtrRegistrar;
import model.Mdl_Users;

/*
Creado por:
Jhonny Castaño
Jhon Gonzalez
Nicolas Gutierrez
Juan Varela
Santiago Nieto
*/

public class VwRegistrar extends javax.swing.JFrame {

    public VwRegistrar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        cbxTipoUsuario = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        pwdClave = new javax.swing.JPasswordField();
        pwdConfirmarClave = new javax.swing.JPasswordField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(55, 60, 70));
        jLabel2.setText("Registrar");

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(55, 60, 70));
        jLabel3.setText("Nombres");

        txtNombres.setFont(new java.awt.Font("Corbel", 0, 15)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(55, 60, 70));
        txtNombres.setBorder(null);
        txtNombres.setPreferredSize(new java.awt.Dimension(300, 30));

        jSeparator1.setForeground(new java.awt.Color(55, 60, 70));

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(55, 60, 70));
        jLabel4.setText("Apellidos");

        txtApellidos.setFont(new java.awt.Font("Corbel", 0, 15)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(55, 60, 70));
        txtApellidos.setBorder(null);
        txtApellidos.setPreferredSize(new java.awt.Dimension(300, 30));

        jSeparator2.setForeground(new java.awt.Color(55, 60, 70));

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(55, 60, 70));
        jLabel5.setText("Tipo de usuario");

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(55, 60, 70));
        jLabel6.setText("Nombre de usuario");

        txtNombreUsuario.setFont(new java.awt.Font("Corbel", 0, 15)); // NOI18N
        txtNombreUsuario.setForeground(new java.awt.Color(55, 60, 70));
        txtNombreUsuario.setBorder(null);
        txtNombreUsuario.setPreferredSize(new java.awt.Dimension(300, 30));

        jSeparator4.setForeground(new java.awt.Color(55, 60, 70));

        cbxTipoUsuario.setFont(new java.awt.Font("Corbel", 0, 15)); // NOI18N
        cbxTipoUsuario.setForeground(new java.awt.Color(55, 60, 70));
        cbxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija un tipo", "Privado", "Público" }));
        cbxTipoUsuario.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(55, 60, 70));
        jLabel7.setText("Clave");

        jSeparator5.setForeground(new java.awt.Color(55, 60, 70));

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(55, 60, 70));
        jLabel8.setText("Confirmar Clave");

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/buttons/registrar.jpg"))); // NOI18N
        btnRegistrar.setBorder(null);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pwdClave.setBorder(null);

        pwdConfirmarClave.setBorder(null);

        jSeparator7.setForeground(new java.awt.Color(55, 60, 70));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(150, 150, 150))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel3)
                    .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addComponent(pwdClave, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addComponent(txtNombreUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwdConfirmarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pwdClave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pwdConfirmarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 400, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/backgrounds/registrar.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VwRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VwRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VwRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VwRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Mdl_Users modelo = new Mdl_Users();
                VwRegistrar vista = new VwRegistrar();
                CtrRegistrar controlador = new CtrRegistrar(vista, modelo);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrar;
    public javax.swing.JComboBox<String> cbxTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    public javax.swing.JPasswordField pwdClave;
    public javax.swing.JPasswordField pwdConfirmarClave;
    public javax.swing.JTextField txtApellidos;
    public javax.swing.JTextField txtNombreUsuario;
    public javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
