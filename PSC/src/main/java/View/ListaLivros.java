/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import View.CadastroAlt.TelaCadLivro;
import Model.Livro;
import View.CadastroAlt.TelaAltLivro;
import dao.DAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static dao.DAO.lerLivroTable;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class ListaLivros extends javax.swing.JFrame {

    /**
     * Creates new form ListaLivros
     */
    public ListaLivros() throws SQLException {
        initComponents();
        readTable();
        
    }
    
    public void readTable() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) tabelaLivros.getModel();
        
        for(Livro l: lerLivroTable()){
            modelo.addRow(new Object[]{
                l.getId(),
                l.getTitulo(),
                l.getAutor(),                
                l.getNota(),
                l.getTipo(),
        });
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        altLivroButton = new javax.swing.JButton();
        labelList = new javax.swing.JLabel();
        remLivroButton = new javax.swing.JButton();
        addLivroButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLivros = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BiblioTecla");
        setMinimumSize(new java.awt.Dimension(1035, 600));
        getContentPane().setLayout(null);

        altLivroButton.setText("Alterar Livro");
        altLivroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altLivroButtonActionPerformed(evt);
            }
        });
        getContentPane().add(altLivroButton);
        altLivroButton.setBounds(550, 170, 430, 23);

        labelList.setForeground(new java.awt.Color(0, 0, 0));
        labelList.setText("Gerencie Seus Livros:");
        labelList.setName(""); // NOI18N
        getContentPane().add(labelList);
        labelList.setBounds(50, 96, 170, 20);

        remLivroButton.setText("Excluir Livro");
        remLivroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remLivroButtonActionPerformed(evt);
            }
        });
        getContentPane().add(remLivroButton);
        remLivroButton.setBounds(550, 210, 430, 23);

        addLivroButton.setText("Adicionar Livro");
        addLivroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLivroButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addLivroButton);
        addLivroButton.setBounds(550, 130, 430, 23);

        tabelaLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Autor", "Nota", "Genero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaLivros.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaLivros);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 130, 452, 330);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OIG.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1030, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altLivroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altLivroButtonActionPerformed
        try {
            // TODO add your handling code here:
            if(tabelaLivros.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(null, "Escolha um livro na tabela");
            }
            else{
                String id = tabelaLivros.getValueAt(tabelaLivros.getSelectedRow(), 0).toString();
                TelaAltLivro telacad = new TelaAltLivro(id);
                this.dispose();
                telacad.setVisible(true);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ListaLivros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_altLivroButtonActionPerformed

    private void addLivroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLivroButtonActionPerformed
        // TODO add your handling code here:
        TelaCadLivro telacad = new TelaCadLivro();
        this.dispose();
        telacad.setVisible(true);
        
    }//GEN-LAST:event_addLivroButtonActionPerformed

    private void remLivroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remLivroButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tabelaLivros.getModel();
        DAO.removeLivro(tabelaLivros.getValueAt(tabelaLivros.getSelectedRow(), 0).toString());
        modelo.removeRow(tabelaLivros.getSelectedRow());
        

    }//GEN-LAST:event_remLivroButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ListaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ListaLivros().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ListaLivros.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addLivroButton;
    private javax.swing.JButton altLivroButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelList;
    private javax.swing.JButton remLivroButton;
    private javax.swing.JTable tabelaLivros;
    // End of variables declaration//GEN-END:variables
}
