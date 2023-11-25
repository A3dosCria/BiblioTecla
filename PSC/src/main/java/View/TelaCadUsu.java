/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Usuario;
import dao.UsuarioDAO;
import javax.swing.JOptionPane;




/**
 *
 * @author vitor
 */
public class TelaCadUsu extends javax.swing.JFrame {
    
    Usuario usuario = new Usuario();
    UsuarioDAO usuariodao = new UsuarioDAO();
    
    /**
     * Creates new form ADM
     */
    public TelaCadUsu() {
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

        nameUser = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNameUser = new javax.swing.JTextPane();
        ageUser = new javax.swing.JLabel();
        txtAgeUser = new javax.swing.JTextField();
        userSex = new javax.swing.JLabel();
        boxUserSex = new javax.swing.JComboBox<>();
        genBookUm = new javax.swing.JLabel();
        boxGenUm = new javax.swing.JComboBox<>();
        genBookTwo = new javax.swing.JLabel();
        boxGenTwo = new javax.swing.JComboBox<>();
        buttonCadUsu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuários");
        setLocation(new java.awt.Point(465, 200));
        setMinimumSize(new java.awt.Dimension(461, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        nameUser.setBackground(new java.awt.Color(0, 0, 0));
        nameUser.setText("NOME DO USUÁRIO");
        getContentPane().add(nameUser);
        nameUser.setBounds(70, 50, 150, 30);

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(txtNameUser);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 80, 330, 30);

        ageUser.setText("IDADE");
        getContentPane().add(ageUser);
        ageUser.setBounds(70, 140, 60, 16);
        getContentPane().add(txtAgeUser);
        txtAgeUser.setBounds(70, 160, 60, 30);

        userSex.setText("SEXO");
        getContentPane().add(userSex);
        userSex.setBounds(260, 140, 70, 16);

        boxUserSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino", "Outro" }));
        boxUserSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxUserSexActionPerformed(evt);
            }
        });
        getContentPane().add(boxUserSex);
        boxUserSex.setBounds(260, 160, 120, 22);

        genBookUm.setText("GÊNERO LIVRO 1");
        getContentPane().add(genBookUm);
        genBookUm.setBounds(70, 220, 130, 16);

        boxGenUm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Romance", "Ficção", "Técnico" }));
        getContentPane().add(boxGenUm);
        boxGenUm.setBounds(70, 240, 110, 22);

        genBookTwo.setText("GÊNERO LIVRO 2");
        getContentPane().add(genBookTwo);
        genBookTwo.setBounds(260, 220, 130, 16);

        boxGenTwo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Romance", "Ficção", "Técnico" }));
        getContentPane().add(boxGenTwo);
        boxGenTwo.setBounds(260, 240, 110, 22);

        buttonCadUsu.setText("CADASTRAR USUÁRIO");
        buttonCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadUsuActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCadUsu);
        buttonCadUsu.setBounds(140, 290, 170, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxUserSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxUserSexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxUserSexActionPerformed

    private void buttonCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadUsuActionPerformed
        // TODO add your handling code here:
        usuario.setNome(txtNameUser.getText());
        JOptionPane.showMessageDialog(null, "Usuário Cadastrado");
        JOptionPane.showMessageDialog(null, usuario.getNome());

    }//GEN-LAST:event_buttonCadUsuActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadUsu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageUser;
    private javax.swing.JComboBox<String> boxGenTwo;
    private javax.swing.JComboBox<String> boxGenUm;
    private javax.swing.JComboBox<String> boxUserSex;
    private javax.swing.JButton buttonCadUsu;
    private javax.swing.JLabel genBookTwo;
    private javax.swing.JLabel genBookUm;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameUser;
    private javax.swing.JTextField txtAgeUser;
    private javax.swing.JTextPane txtNameUser;
    private javax.swing.JLabel userSex;
    // End of variables declaration//GEN-END:variables
}
