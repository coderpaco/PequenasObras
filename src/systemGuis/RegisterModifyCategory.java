/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package systemGuis;

/**
 *
 * @author diego
 */
public class RegisterModifyCategory extends javax.swing.JFrame {

    /**
     * Creates new form RegisterModifyCategory
     */
    public RegisterModifyCategory() {
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

        nameLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionInput = new javax.swing.JTextArea();
        addCategory = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        ModifyDescription = new javax.swing.JButton();
        confirmModify = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        nameLabel.setText("Nombre:");
        getContentPane().add(nameLabel);
        nameLabel.setBounds(20, 70, 50, 16);

        descriptionLabel.setText("Descripción:");
        getContentPane().add(descriptionLabel);
        descriptionLabel.setBounds(20, 130, 70, 16);

        nameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInputActionPerformed(evt);
            }
        });
        getContentPane().add(nameInput);
        nameInput.setBounds(20, 90, 100, 22);

        descriptionInput.setColumns(20);
        descriptionInput.setRows(5);
        jScrollPane1.setViewportView(descriptionInput);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 150, 150, 70);

        addCategory.setText("Agregar");
        addCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(addCategory);
        addCategory.setBounds(20, 240, 80, 23);

        jLabel1.setText("Registrar/Modificar Rubro");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 210, 40);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(200, 90, 180, 130);

        ModifyDescription.setText("Modificar");
        getContentPane().add(ModifyDescription);
        ModifyDescription.setBounds(200, 240, 90, 23);

        confirmModify.setText("Confirmar");
        getContentPane().add(confirmModify);
        confirmModify.setBounds(300, 240, 84, 23);

        jLabel2.setText("Rubro:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 70, 70, 16);

        setBounds(0, 0, 414, 307);
    }// </editor-fold>//GEN-END:initComponents

    private void nameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameInputActionPerformed

    private void addCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCategoryActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterModifyCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterModifyCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterModifyCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterModifyCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterModifyCategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ModifyDescription;
    private javax.swing.JButton addCategory;
    private javax.swing.JButton confirmModify;
    private javax.swing.JTextArea descriptionInput;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables
}
