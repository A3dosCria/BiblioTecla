/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author vitor
 */
public class ListaLivros extends javax.swing.JFrame {

    /**
     * Creates new form ListaLivros
     */
    public ListaLivros() {
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

        scrollList = new javax.swing.JScrollPane();
        bookList = new javax.swing.JList<>();
        addBookButton = new javax.swing.JButton();
        labelList = new javax.swing.JLabel();
        imgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BiblioTecla");
        setMinimumSize(new java.awt.Dimension(540, 420));
        getContentPane().setLayout(null);

        bookList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollList.setViewportView(bookList);

        getContentPane().add(scrollList);
        scrollList.setBounds(44, 120, 437, 192);

        addBookButton.setText("Adicionar Livro");
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addBookButton);
        addBookButton.setBounds(350, 330, 130, 23);

        labelList.setText("Gerencie Seus Livros:");
        labelList.setName(""); // NOI18N
        getContentPane().add(labelList);
        labelList.setBounds(50, 96, 170, 20);

        imgFundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgFundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\RENNAN\\OneDrive\\Documentos\\NetBeansProjects\\BiblioTecla\\PSC\\src\\main\\java\\Lib\\OIG (1).png")); // NOI18N
        getContentPane().add(imgFundo);
        imgFundo.setBounds(-140, -350, 830, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBookButtonActionPerformed

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
                new ListaLivros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookButton;
    private javax.swing.JList<String> bookList;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JLabel labelList;
    private javax.swing.JScrollPane scrollList;
    // End of variables declaration//GEN-END:variables
}
