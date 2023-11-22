/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TelaLogin;

/**
 *
 * @author RENNAN
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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
        txtUser = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        entrarButton = new javax.swing.JButton();
        imgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(400, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        user.setText("Usuário:");
        getContentPane().add(user);
        user.setBounds(115, 60, 60, 16);

        senha.setText("Senha:");
        getContentPane().add(senha);
        senha.setBounds(115, 132, 60, 16);
        getContentPane().add(txtUser);
        txtUser.setBounds(115, 88, 169, 22);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(115, 160, 169, 22);

        entrarButton.setText("Entrar");
        getContentPane().add(entrarButton);
        entrarButton.setBounds(212, 200, 72, 23);

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1698186741616.png"))); // NOI18N
        getContentPane().add(imgFundo);
        imgFundo.setBounds(-280, -50, 720, 450);

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrarButton;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JLabel senha;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
