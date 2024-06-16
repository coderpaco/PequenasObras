package systemGuis;

import domain.*;

/*
    Davit Dostourian Erbe 281665 & Diego Pereira Puig - 329028
*/

public class MainMenu extends javax.swing.JFrame {
    
    private static ConstructionsManagementSystem system1;

    public MainMenu(ConstructionsManagementSystem system) {
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

        menuBar = new javax.swing.JMenuBar();
        registerMenu = new javax.swing.JMenu();
        registerModifyCat = new javax.swing.JMenuItem();
        registerForeman = new javax.swing.JMenuItem();
        registerOwner = new javax.swing.JMenuItem();
        constructionRegister = new javax.swing.JMenuItem();
        expensesMenu = new javax.swing.JMenu();
        expenditurePerConstruction = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        constructionState = new javax.swing.JMenuItem();
        importationAndExportationMenu = new javax.swing.JMenu();
        importDataNewConstruction = new javax.swing.JMenuItem();
        exportDataNewOwnerForeman = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        registerMenu.setMnemonic('f');
        registerMenu.setText("Registros");

        registerModifyCat.setMnemonic('o');
        registerModifyCat.setText("Registrar/Modificar rubro");
        registerModifyCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerModifyCatMouseClicked(evt);
            }
        });
        registerModifyCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerModifyCatActionPerformed(evt);
            }
        });
        registerMenu.add(registerModifyCat);

        registerForeman.setMnemonic('s');
        registerForeman.setText("Registrar Capataz");
        registerForeman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerForemanMouseClicked(evt);
            }
        });
        registerForeman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerForemanActionPerformed(evt);
            }
        });
        registerMenu.add(registerForeman);

        registerOwner.setMnemonic('a');
        registerOwner.setText("Registro de propietario");
        registerOwner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerOwnerMouseClicked(evt);
            }
        });
        registerOwner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerOwnerActionPerformed(evt);
            }
        });
        registerMenu.add(registerOwner);

        constructionRegister.setMnemonic('x');
        constructionRegister.setText("Registro de obra");
        constructionRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                constructionRegisterMouseClicked(evt);
            }
        });
        constructionRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                constructionRegisterActionPerformed(evt);
            }
        });
        registerMenu.add(constructionRegister);

        menuBar.add(registerMenu);

        expensesMenu.setMnemonic('e');
        expensesMenu.setText("Gastos");

        expenditurePerConstruction.setMnemonic('t');
        expenditurePerConstruction.setText("Registro de gasto para obra");
        expenditurePerConstruction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expenditurePerConstructionMouseClicked(evt);
            }
        });
        expenditurePerConstruction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expenditurePerConstructionActionPerformed(evt);
            }
        });
        expensesMenu.add(expenditurePerConstruction);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Pago de gasto (Reintegro de gasto por parte del propietario)");
        copyMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                copyMenuItemMouseClicked(evt);
            }
        });
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        expensesMenu.add(copyMenuItem);

        constructionState.setMnemonic('p');
        constructionState.setText("Estado de obra");
        constructionState.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                constructionStateMouseClicked(evt);
            }
        });
        constructionState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                constructionStateActionPerformed(evt);
            }
        });
        expensesMenu.add(constructionState);

        menuBar.add(expensesMenu);

        importationAndExportationMenu.setMnemonic('h');
        importationAndExportationMenu.setText("Importación y Exportación");

        importDataNewConstruction.setMnemonic('c');
        importDataNewConstruction.setText("Importación de datos para obra nueva");
        importDataNewConstruction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importDataNewConstructionMouseClicked(evt);
            }
        });
        importDataNewConstruction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importDataNewConstructionActionPerformed(evt);
            }
        });
        importationAndExportationMenu.add(importDataNewConstruction);

        exportDataNewOwnerForeman.setMnemonic('a');
        exportDataNewOwnerForeman.setText("Exportación de datos de Propietarios y Capataces");
        exportDataNewOwnerForeman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportDataNewOwnerForemanActionPerformed(evt);
            }
        });
        importationAndExportationMenu.add(exportDataNewOwnerForeman);

        menuBar.add(importationAndExportationMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void constructionRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_constructionRegisterActionPerformed
        RegisterConstructionSite v = new RegisterConstructionSite(system1);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_constructionRegisterActionPerformed

    private void registerModifyCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerModifyCatActionPerformed
        RegisterModifyCategory v = new RegisterModifyCategory(system1);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_registerModifyCatActionPerformed

    private void registerForemanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerForemanActionPerformed
        RegisterForeman v = new RegisterForeman(system1);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_registerForemanActionPerformed

    private void registerOwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerOwnerActionPerformed
        RegisterOwner v = new RegisterOwner(system1);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_registerOwnerActionPerformed

    private void registerModifyCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerModifyCatMouseClicked
        RegisterModifyCategory v = new RegisterModifyCategory(system1);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_registerModifyCatMouseClicked

    private void registerOwnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerOwnerMouseClicked
        RegisterOwner v = new RegisterOwner(system1);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_registerOwnerMouseClicked

    private void constructionRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_constructionRegisterMouseClicked
        RegisterConstructionSite v = new RegisterConstructionSite(system1);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_constructionRegisterMouseClicked

    private void registerForemanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerForemanMouseClicked
        RegisterForeman v = new RegisterForeman(system1);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_registerForemanMouseClicked

    private void expenditurePerConstructionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expenditurePerConstructionMouseClicked
        RegisterExpendituresForConstruction v = new RegisterExpendituresForConstruction(system1);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
        //
    }//GEN-LAST:event_expenditurePerConstructionMouseClicked

    private void expenditurePerConstructionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expenditurePerConstructionActionPerformed
        RegisterExpendituresForConstruction v = new RegisterExpendituresForConstruction(system1);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_expenditurePerConstructionActionPerformed

    private void copyMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_copyMenuItemMouseClicked
        ExpendituresPayment v = new ExpendituresPayment(system1);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_copyMenuItemMouseClicked

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        ExpendituresPayment v = new ExpendituresPayment(system1);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void importDataNewConstructionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importDataNewConstructionActionPerformed
        ImportData v = new ImportData(system1);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_importDataNewConstructionActionPerformed

    private void importDataNewConstructionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importDataNewConstructionMouseClicked
        ImportData v = new ImportData(system1);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_importDataNewConstructionMouseClicked

    private void exportDataNewOwnerForemanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportDataNewOwnerForemanActionPerformed
        ExportData v = new ExportData(system1);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_exportDataNewOwnerForemanActionPerformed

    private void constructionStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_constructionStateActionPerformed
        ConstructionState v = new ConstructionState(system1);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_constructionStateActionPerformed

    private void constructionStateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_constructionStateMouseClicked
        ConstructionState v = new ConstructionState(system1);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }//GEN-LAST:event_constructionStateMouseClicked

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu(system1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem constructionRegister;
    private javax.swing.JMenuItem constructionState;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem expenditurePerConstruction;
    private javax.swing.JMenu expensesMenu;
    private javax.swing.JMenuItem exportDataNewOwnerForeman;
    private javax.swing.JMenuItem importDataNewConstruction;
    private javax.swing.JMenu importationAndExportationMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem registerForeman;
    private javax.swing.JMenu registerMenu;
    private javax.swing.JMenuItem registerModifyCat;
    private javax.swing.JMenuItem registerOwner;
    // End of variables declaration//GEN-END:variables

}
