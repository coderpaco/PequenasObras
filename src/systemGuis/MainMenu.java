/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package systemGuis;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author diego
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
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

        registerMenu.setMnemonic('f');
        registerMenu.setText("Registros");

        registerModifyCat.setMnemonic('o');
        registerModifyCat.setText("Registrar/Modificar rubro");
        registerModifyCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerModifyCatActionPerformed(evt);
            }
        });
        registerMenu.add(registerModifyCat);

        registerForeman.setMnemonic('s');
        registerForeman.setText("Registrar Capataz");
        registerMenu.add(registerForeman);

        registerOwner.setMnemonic('a');
        registerOwner.setText("Registro de propietario");
        registerMenu.add(registerOwner);

        constructionRegister.setMnemonic('x');
        constructionRegister.setText("Registro de obra");
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
        expensesMenu.add(expenditurePerConstruction);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Pago de gasto (Reintegro de gasto por parte del propietario)");
        expensesMenu.add(copyMenuItem);

        constructionState.setMnemonic('p');
        constructionState.setText("Estado de obra");
        expensesMenu.add(constructionState);

        menuBar.add(expensesMenu);

        importationAndExportationMenu.setMnemonic('h');
        importationAndExportationMenu.setText("Importación y Exportación");

        importDataNewConstruction.setMnemonic('c');
        importDataNewConstruction.setText("Importación de edatos para obra nueva");
        importationAndExportationMenu.add(importDataNewConstruction);

        exportDataNewOwnerForeman.setMnemonic('a');
        exportDataNewOwnerForeman.setText("Exportación de datos de Propietarios y Capataces");
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
        System.exit(0);
    }//GEN-LAST:event_constructionRegisterActionPerformed

    private void registerModifyCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerModifyCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerModifyCatActionPerformed

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
                new MainMenu().setVisible(true);
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
