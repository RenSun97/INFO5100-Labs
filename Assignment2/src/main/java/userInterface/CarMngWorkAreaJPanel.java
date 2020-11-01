/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import CarManagement.CarDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author SUNREN
 */
public class CarMngWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private CarDirectory carDirectory;
    /**
     * Creates new form AccountMngWorkAreaJPanel
     */
    

    CarMngWorkAreaJPanel(JPanel userProcessContainer, CarDirectory carDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.carDirectory = carDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateCar = new javax.swing.JButton();
        btnManageCar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 600));

        btnCreateCar.setText("Create Car");
        btnCreateCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCarActionPerformed(evt);
            }
        });

        btnManageCar.setText("Manage Car");
        btnManageCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreateCar, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(btnManageCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(540, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCreateCar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManageCar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(461, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCarActionPerformed
        // TODO add your handling code here:
        CreateCarJPanel panel = new CreateCarJPanel(userProcessContainer,carDirectory);
        userProcessContainer.add("CreateCarJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateCarActionPerformed

    private void btnManageCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCarActionPerformed
        // TODO add your handling code here:
        ManageCarJPanel panel = new ManageCarJPanel(userProcessContainer,carDirectory);
        userProcessContainer.add("ManageCarJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageCarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateCar;
    private javax.swing.JButton btnManageCar;
    // End of variables declaration//GEN-END:variables
}