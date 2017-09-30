/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.semillero.colegioquipux.presentacion.registrousuario;


import co.edu.semillero.colegioquipux.datos.LoginDatos_prototipo;
import co.edu.semillero.colegioquipux.dtos.UsuarioDTO;
import co.edu.semillero.colegioquipux.presentacion.autentificacion.LoginPresentacion;
import co.edu.semillero.colegioquipux.validacion.LoginRegistroValidacion;
import javax.swing.JOptionPane;
/**
 *
 * @author VALERIA
 */
public class LoginRegistrousuario extends javax.swing.JFrame {
    LoginDatos_prototipo ListaUsuario = new LoginDatos_prototipo();
    UsuarioDTO UsuarioActual = new UsuarioDTO();
    public LoginRegistrousuario (LoginDatos_prototipo LUsuario){
        initComponents();
    this.ListaUsuario = LUsuario;
    }
    /**
     * Creates new form LoginRegistrousuario
     */
    public LoginRegistrousuario() {
        initComponents();
    }
    private void initComponentes(){
        NombresJlabel= new javax.swing.JLabel ();
        ApellidosJlabel= new javax.swing.JLabel ();
        UsuarioJlabel= new javax.swing.JLabel ();
        ClaveJlabel= new javax.swing.JLabel ();

        NOMBRES= new javax.swing.JTextField ();
        APELLIDOS= new javax.swing.JTextField ();
        USUARIO= new javax.swing.JTextField ();
        CLAVE= new javax.swing.JPasswordField ();
        ENVIAR= new javax.swing.JButton ();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NOMBRES = new javax.swing.JTextField();
        RegistroJlabel = new javax.swing.JLabel();
        NombresJlabel = new javax.swing.JLabel();
        ApellidosJlabel = new javax.swing.JLabel();
        APELLIDOS = new javax.swing.JTextField();
        USUARIO = new javax.swing.JTextField();
        UsuarioJlabel = new javax.swing.JLabel();
        ClaveJlabel = new javax.swing.JLabel();
        CLAVE = new javax.swing.JPasswordField();
        ENVIAR = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        NOMBRES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMBRES(evt);
            }
        });

        RegistroJlabel.setFont(new java.awt.Font("Apple Braille", 3, 18)); // NOI18N
        RegistroJlabel.setText("REGISTRO");
        RegistroJlabel.setToolTipText("");

        NombresJlabel.setText("NOMBRES");

        ApellidosJlabel.setText("APELLIDOS");

        APELLIDOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APELLIDOS(evt);
            }
        });

        USUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USUARIO(evt);
            }
        });

        UsuarioJlabel.setText("USUARIO");

        ClaveJlabel.setText("CONTRASEÑA");

        CLAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLAVE(evt);
            }
        });

        ENVIAR.setBackground(new java.awt.Color(255, 255, 255));
        ENVIAR.setText("ENVIAR");
        ENVIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUARDAR_REGISTRO(evt);
            }
        });

        jButton1.setText("INICIAR SESION");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(ENVIAR)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ApellidosJlabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NombresJlabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UsuarioJlabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ClaveJlabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegistroJlabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(USUARIO, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                .addComponent(NOMBRES)
                                .addComponent(APELLIDOS)
                                .addComponent(CLAVE)))
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegistroJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NOMBRES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombresJlabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(APELLIDOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApellidosJlabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsuarioJlabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CLAVE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClaveJlabel))
                .addGap(18, 18, 18)
                .addComponent(ENVIAR)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NOMBRES(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMBRES
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMBRES

    private void APELLIDOS(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APELLIDOS
        // TODO add your handling code here:
    }//GEN-LAST:event_APELLIDOS

    private void USUARIO(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USUARIO
        // TODO add your handling code here:
    }//GEN-LAST:event_USUARIO

    private void GUARDAR_REGISTRO(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUARDAR_REGISTRO
        // TODO add your handling code here:
    LoginRegistroValidacion validarRegistro = new LoginRegistroValidacion();
     UsuarioActual = new UsuarioDTO ();
    UsuarioActual.setUsuario(USUARIO.getText());
    UsuarioActual.setClave(CLAVE.getText());
    UsuarioActual.setNombres(NOMBRES.getText());
    UsuarioActual.setApellidos(APELLIDOS.getText());
     if(validarRegistro.Registro(UsuarioActual)){
    ListaUsuario.IncluirUsuario(UsuarioActual);
    ListaUsuario.imprimir();
    
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "No ingreso datos");
        }
     
     
    }//GEN-LAST:event_GUARDAR_REGISTRO

    private void CLAVE(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLAVE
        // TODO add your handling code here:
    }//GEN-LAST:event_CLAVE

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LoginPresentacion loginPresentacion = new LoginPresentacion();
     loginPresentacion.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginRegistrousuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginRegistrousuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginRegistrousuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginRegistrousuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginRegistrousuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField APELLIDOS;
    private javax.swing.JLabel ApellidosJlabel;
    private javax.swing.JPasswordField CLAVE;
    private javax.swing.JLabel ClaveJlabel;
    public javax.swing.JButton ENVIAR;
    private javax.swing.JTextField NOMBRES;
    private javax.swing.JLabel NombresJlabel;
    private javax.swing.JLabel RegistroJlabel;
    private javax.swing.JTextField USUARIO;
    private javax.swing.JLabel UsuarioJlabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
