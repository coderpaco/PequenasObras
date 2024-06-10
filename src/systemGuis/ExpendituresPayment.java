package systemGuis;

import domain.*;
import java.util.*;

public class ExpendituresPayment extends javax.swing.JFrame {

    private ConstructionsManagementSystem system1;
    
    public ExpendituresPayment(ConstructionsManagementSystem system) {
        system1 = system;
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

        constructionListLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        constructionList = new javax.swing.JList<>();
        notPayedExpendituresLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        notPayedExpendituresList = new javax.swing.JList<>();
        payButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pago de Gastos");
        setResizable(false);
        getContentPane().setLayout(null);

        constructionListLabel.setText("Obras");
        getContentPane().add(constructionListLabel);
        constructionListLabel.setBounds(20, 20, 50, 16);

        constructionList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(constructionList);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 40, 120, 146);

        notPayedExpendituresLabel.setText("Gastos Impagos");
        getContentPane().add(notPayedExpendituresLabel);
        notPayedExpendituresLabel.setBounds(170, 20, 110, 16);

        notPayedExpendituresList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(notPayedExpendituresList);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(170, 40, 120, 146);

        payButton.setText("Pagar");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });
        getContentPane().add(payButton);
        payButton.setBounds(170, 200, 72, 23);

        setBounds(0, 0, 414, 307);
    }// </editor-fold>//GEN-END:initComponents

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ExpendituresPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExpendituresPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExpendituresPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExpendituresPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExpendituresPayment(system1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> constructionList;
    private javax.swing.JLabel constructionListLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel notPayedExpendituresLabel;
    private javax.swing.JList<String> notPayedExpendituresList;
    private javax.swing.JButton payButton;
    // End of variables declaration//GEN-END:variables
}
