package systemGuis;

import domain.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class ExpendituresPayment extends javax.swing.JFrame implements Observer {

    private ConstructionsManagementSystem system1;
    private DefaultListModel<String> ConstructionSiteListModel;
    private DefaultListModel<String> unpaidModel;
    private DefaultListModel<String> paidModel;
    private List<ConstructionSite> constructionSites;
    private ConstructionSite selectedSite;
    
    
    public ExpendituresPayment(ConstructionsManagementSystem system) {
        system1 = system;
        initComponents();
        system1.addObserver(this);
        ConstructionSiteListModel = new DefaultListModel<>();
        unpaidModel = new DefaultListModel<>();
        paidModel = new DefaultListModel<>();
        loadConstructionSites();

        // Add a ListSelectionListener to constructionList
        constructionList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedIndex = constructionList.getSelectedIndex();
                    if (selectedIndex != -1) {
                        selectedSite = constructionSites.get(selectedIndex);
                        loadExpenditures(selectedSite);
                    }
                }
            }
        });
    }
    
  
    private void loadConstructionSites() {
        ConstructionSiteListModel.clear();
        constructionSites = system1.obtainConstructionSites();
        for (ConstructionSite site : constructionSites) {
            ConstructionSiteListModel.addElement(site.getAddress());
        }
        constructionList.setModel(ConstructionSiteListModel);
    }

   private void loadExpenditures(ConstructionSite site) {
    unpaidModel.clear();
    paidModel.clear();

    // Get unpaid expenditures for the selected construction site
    List<Expenditures> unpaidExpenditures = site.getUnpaidExpenditures();
    
    // Populate notPayedExpendituresList with the descriptions and amounts of unpaid expenditures
    for (Expenditures expenditure : unpaidExpenditures) {
        unpaidModel.addElement(expenditure.getDescription() + " - " + expenditure.getAmount());
    }

    // Populate paidModel with paid expenditures
    for (Expenditures expenditure : site.getPaidExpenditures()) {
        paidModel.addElement(expenditure.getDescription() + " - " + expenditure.getAmount());
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

        constructionListLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        constructionList = new javax.swing.JList<>();
        notPayedExpendituresLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        notPayedExpendituresList = new javax.swing.JList<>();
        payButton = new javax.swing.JButton();
        PaidExpendituresLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        PaidExpendituresList = new javax.swing.JList<>();

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
        payButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payButtonMouseClicked(evt);
            }
        });
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });
        getContentPane().add(payButton);
        payButton.setBounds(170, 200, 72, 23);

        PaidExpendituresLabel.setText("Gastos Pagos");
        getContentPane().add(PaidExpendituresLabel);
        PaidExpendituresLabel.setBounds(320, 20, 100, 16);

        PaidExpendituresList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(PaidExpendituresList);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(320, 40, 110, 146);

        setBounds(0, 0, 465, 307);
    }// </editor-fold>//GEN-END:initComponents

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payButtonActionPerformed

    private void payButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payButtonMouseClicked
             int selectedIndex = notPayedExpendituresList.getSelectedIndex();
        if (selectedIndex != -1) {
            String selectedExpenditure = unpaidModel.getElementAt(selectedIndex);
            ConstructionSite selectedSite = system1.obtainConstructionSites().get(constructionList.getSelectedIndex());

            for (Expenditures expenditure : selectedSite.getUnpaidExpenditures()) {
                if ((expenditure.getDescription() + " - " + expenditure.getAmount()).equals(selectedExpenditure)) {
                    system1.registerPaymentExpenditure(selectedSite, expenditure);
                    break;
                }
            }
            loadExpenditures(selectedSite);
        }
    }//GEN-LAST:event_payButtonMouseClicked

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
                ConstructionsManagementSystem system1 = new ConstructionsManagementSystem();
                new ExpendituresPayment(system1).setVisible(true);
            }
        });
    }
private void constructionListValueChanged(javax.swing.event.ListSelectionEvent evt) {
    int selectedIndex = constructionList.getSelectedIndex();
    if (selectedIndex != -1) {
        selectedSite = constructionSites.get(selectedIndex);
        loadExpenditures(selectedSite);
    }
}

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PaidExpendituresLabel;
    private javax.swing.JList<String> PaidExpendituresList;
    private javax.swing.JList<String> constructionList;
    private javax.swing.JLabel constructionListLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel notPayedExpendituresLabel;
    private javax.swing.JList<String> notPayedExpendituresList;
    private javax.swing.JButton payButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
