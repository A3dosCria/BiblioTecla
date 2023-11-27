/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.CadastroAlt;

import Model.Livro;
import View.ListaLivros;
import dao.DAO;
import static dao.DAO.lerLivro;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class TelaAltLivro extends javax.swing.JFrame {

    static String id;
    Livro livro = new Livro();
    Livro livroLido = new Livro();
    /**
     * Creates new form Usuario
     */
    
    
    public TelaAltLivro(String id) throws SQLException {
        this.id = id;
        livroLido = lerLivro(id);
        initComponents();
        
        txtAutor.setText(livroLido.getAutor());
        txtTitleBook.setText(livroLido.getTitulo());
        txtGenBook.setText(livroLido.getTipo());
        boxNoteBook.setSelectedIndex(livroLido.getNota());

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgFundo = new javax.swing.JLabel();
        titleBook = new javax.swing.JLabel();
        txtTitleBook = new javax.swing.JTextField();
        autorBook = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        titleCad = new javax.swing.JLabel();
        genBook = new javax.swing.JLabel();
        txtGenBook = new javax.swing.JTextField();
        noteBook = new javax.swing.JLabel();
        boxNoteBook = new javax.swing.JComboBox<>();
        CadLivro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Livros");
        setMinimumSize(new java.awt.Dimension(1035, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        titleBook.setForeground(new java.awt.Color(0, 0, 0));
        titleBook.setText("TÍTULO");
        getContentPane().add(titleBook);
        titleBook.setBounds(480, 140, 80, 16);

        txtTitleBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitleBookActionPerformed(evt);
            }
        });
        getContentPane().add(txtTitleBook);
        txtTitleBook.setBounds(340, 160, 330, 22);

        autorBook.setForeground(new java.awt.Color(0, 0, 0));
        autorBook.setText("AUTOR ");
        getContentPane().add(autorBook);
        autorBook.setBounds(480, 210, 100, 16);

        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });
        getContentPane().add(txtAutor);
        txtAutor.setBounds(340, 230, 330, 22);

        titleCad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titleCad.setForeground(new java.awt.Color(0, 0, 0));
        titleCad.setText("ALTERAÇÃO DE LIVROS");
        getContentPane().add(titleCad);
        titleCad.setBounds(410, 80, 202, 25);

        genBook.setForeground(new java.awt.Color(0, 0, 0));
        genBook.setText("GÊNERO");
        getContentPane().add(genBook);
        genBook.setBounds(480, 290, 110, 16);

        txtGenBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenBookActionPerformed(evt);
            }
        });
        getContentPane().add(txtGenBook);
        txtGenBook.setBounds(340, 310, 330, 22);

        noteBook.setForeground(new java.awt.Color(0, 0, 0));
        noteBook.setText("NOTA DE 0 A 10");
        getContentPane().add(noteBook);
        noteBook.setBounds(460, 360, 110, 16);

        boxNoteBook.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        boxNoteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNoteBookActionPerformed(evt);
            }
        });
        getContentPane().add(boxNoteBook);
        boxNoteBook.setBounds(470, 380, 80, 22);

        CadLivro.setText("ALTERAR LIVRO");
        CadLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadLivroActionPerformed(evt);
            }
        });
        getContentPane().add(CadLivro);
        CadLivro.setBounds(420, 420, 169, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rayni\\Documents\\NetBeansProjects\\Projeto A3\\BiblioTecla\\PSC\\src\\main\\java\\Lib\\OIG.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1030, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTitleBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitleBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitleBookActionPerformed

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorActionPerformed

    private void boxNoteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNoteBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxNoteBookActionPerformed

    private void CadLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadLivroActionPerformed
        try {
            // TODO add your handling code here:
            
            livro.setTitulo(txtTitleBook.getText());
            livro.setAutor(txtAutor.getText());
            livro.setTipo(txtGenBook.getText());
            livro.setNota(Integer.parseInt(boxNoteBook.getSelectedItem().toString()));
            DAO.altLivro(livro, id);
            JOptionPane.showMessageDialog(null, "O livro foi Alterado!");
            ListaLivros listaLivros = new ListaLivros();
            this.dispose();
            listaLivros.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaAltLivro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CadLivroActionPerformed

    private void txtGenBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenBookActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAltLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAltLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAltLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAltLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaAltLivro(id).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaAltLivro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadLivro;
    private javax.swing.JLabel autorBook;
    private javax.swing.JComboBox<String> boxNoteBook;
    private javax.swing.JLabel genBook;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel noteBook;
    private javax.swing.JLabel titleBook;
    private javax.swing.JLabel titleCad;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtGenBook;
    private javax.swing.JTextField txtTitleBook;
    // End of variables declaration//GEN-END:variables
}
