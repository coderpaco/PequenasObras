/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package systemGuis;

/**
 *
 * @author diego
 */
public class RegisterExpendituresForConstruction extends javax.swing.JFrame {

    /**
     * Creates new form RegisterExpendituresForConstruction
     */
    public RegisterExpendituresForConstruction() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        CategoriesListLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        AmmountLabel = new javax.swing.JLabel();
        MonthLabel = new javax.swing.JLabel();
        ChangeLabel = new javax.swing.JLabel();
        DescriptionLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        inputDescription = new javax.swing.JTextArea();
        MonthInput = new javax.swing.JSpinner();
        inputYear = new javax.swing.JSpinner();
        InputAmmount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Obras");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(23, 28, 50, 16);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 110, 146);

        CategoriesListLabel.setText("Rubros");
        getContentPane().add(CategoriesListLabel);
        CategoriesListLabel.setBounds(160, 30, 50, 16);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(160, 50, 110, 146);

        AmmountLabel.setText("Monto:");
        getContentPane().add(AmmountLabel);
        AmmountLabel.setBounds(290, 30, 50, 16);

        MonthLabel.setText("Mes:");
        getContentPane().add(MonthLabel);
        MonthLabel.setBounds(290, 80, 25, 16);

        ChangeLabel.setText("Año:");
        getContentPane().add(ChangeLabel);
        ChangeLabel.setBounds(360, 80, 25, 16);

        DescriptionLabel.setText("Descripcion:");
        getContentPane().add(DescriptionLabel);
        DescriptionLabel.setBounds(290, 130, 70, 16);

        inputDescription.setColumns(20);
        inputDescription.setRows(5);
        jScrollPane3.setViewportView(inputDescription);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(290, 150, 210, 120);
        getContentPane().add(MonthInput);
        MonthInput.setBounds(290, 100, 50, 22);
        getContentPane().add(inputYear);
        inputYear.setBounds(360, 100, 60, 22);

        InputAmmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputAmmountActionPerformed(evt);
            }
        });
        getContentPane().add(InputAmmount);
        InputAmmount.setBounds(290, 50, 71, 22);

        setBounds(0, 0, 534, 307);
    }// </editor-fold>//GEN-END:initComponents

    private void InputAmmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputAmmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputAmmountActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterExpendituresForConstruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterExpendituresForConstruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterExpendituresForConstruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterExpendituresForConstruction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterExpendituresForConstruction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AmmountLabel;
    private javax.swing.JLabel CategoriesListLabel;
    private javax.swing.JLabel ChangeLabel;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JTextField InputAmmount;
    private javax.swing.JSpinner MonthInput;
    private javax.swing.JLabel MonthLabel;
    private javax.swing.JTextArea inputDescription;
    private javax.swing.JSpinner inputYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
