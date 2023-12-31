/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import dao.DAO;
import static dao.DAO.Autenticate;
import static dao.DAO.tipoUsu;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author RENNAN
 */
public class TelaLogin extends javax.swing.JFrame {
    
    Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
    
    String login;
    /**
     * Creates new form Login
     */
    public TelaLogin() {
        
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

        user = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        LoginPasswordField = new javax.swing.JPasswordField();
        loginFormField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        entrarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(550, 220));
        setMinimumSize(new java.awt.Dimension(1035, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        user.setFont(new java.awt.Font("Serif", 2, 36)); // NOI18N
        user.setForeground(new java.awt.Color(0, 0, 0));
        user.setText("Usuário:");
        getContentPane().add(user);
        user.setBounds(260, 180, 150, 30);

        senha.setFont(new java.awt.Font("Serif", 2, 36)); // NOI18N
        senha.setForeground(new java.awt.Color(0, 0, 0));
        senha.setText("Senha:");
        getContentPane().add(senha);
        senha.setBounds(260, 290, 130, 30);
        getContentPane().add(LoginPasswordField);
        LoginPasswordField.setBounds(260, 320, 490, 40);

        loginFormField.setToolTipText("");
        getContentPane().add(loginFormField);
        loginFormField.setBounds(260, 210, 490, 40);

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BiblioTecla");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 60, 360, 60);

        jLabel3.setFont(new java.awt.Font("Segoe Script", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Seu sistema de gerenciamento de livros");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 100, 300, 30);

        entrarButton.setText("Entrar");
        entrarButton.setBorder(null);
        entrarButton.setBorderPainted(false);
        entrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(entrarButton);
        entrarButton.setBounds(410, 440, 190, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OIG.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1030, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarButtonActionPerformed
        
        login = loginFormField.getText();
        String password = new String(LoginPasswordField.getPassword());
        
        try {
            if(Autenticate(login, password)){
                JOptionPane.showMessageDialog(null, "Login Realizado com sucesso");
                String tipoUsuario = tipoUsu(login, password);
                if (tipoUsuario != null && tipoUsuario.equals("A")) {
                    TelaDeAdmin telausu = new TelaDeAdmin();
                    this.dispose();
                    telausu.setVisible(true);
                }
                else if (tipoUsuario != null && tipoUsuario.equals("C")){
                    TelaDeUsuarios telausu = new TelaDeUsuarios();
                    this.dispose();
                    telausu.setVisible(true);
                }
                else {
                   JOptionPane.showMessageDialog(null, "Tipo de usuario invalido!\ncontate um administrador do sistema.");
                   loginFormField.setText("");
                   LoginPasswordField.setText("");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Dados inválidos ou inexistentes");
                loginFormField.setText("");
                LoginPasswordField.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_entrarButtonActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField LoginPasswordField;
    private javax.swing.JButton entrarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField loginFormField;
    private javax.swing.JLabel senha;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
