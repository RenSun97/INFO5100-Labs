/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.Restaurant.Order;
import Business.Restaurant.OrderItem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alex Zhu
 */
public class ViewShoppingCart extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount account;
    Restaurant res;
    Order cart;
    /**
     * Creates new form CustomerManagementScreen
     */
    public ViewShoppingCart(JPanel userProcessContainer,EcoSystem ecosystem,String cusName,String resName,Order cart) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.account=this.ecosystem.getUserAccountDirectory().searchUserAccount(cusName);
        this.res=this.ecosystem.getRestaurantDirectory().searchRestaurantByName(resName);
        this.cart=cart;
        
        if(res!=null)
            this.populate();
        else
            JOptionPane.showMessageDialog(null, "System error occurred! Please log out!");
        //this.lblTitle.setText(lblTitle.getText()+resName);
        
        
    }
    public void populate()
    {
        double totalPrice=0;
        DefaultTableModel dtm = (DefaultTableModel) tabMenu.getModel();
        dtm.setRowCount(0);
        for (OrderItem i:this.cart.getItems()) {          
                Object row[] = new Object[3];
                row[0] = i;
                row[1] = i.getDishAndPrice().getPrice();
                row[2] = i.getNum();
                totalPrice+=i.getDishAndPrice().getPrice()*i.getNum();
                dtm.addRow(row);
            }
        this.lblPrice.setText("Total price: "+totalPrice);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabMenu = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        btnOrder = new javax.swing.JButton();
        lblPrice = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        btnBack.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnBack.setText("back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tabMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMenuMouseClicked(evt);
            }
        });
        tabMenu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tabMenuKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tabMenu);

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setText("Shopping Cart ");

        btnOrder.setText("Confirm order");
        btnOrder.setToolTipText("");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        lblPrice.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblPrice.setText("Total price: ");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPrice)
                                .addGap(85, 85, 85))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(lblTitle)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnBack)
                .addGap(27, 27, 27)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOrder)
                .addContainerGap(106, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         CardLayout layout=(CardLayout)this.userProcessContainer.getLayout();
        this.userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tabMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMenuMouseClicked
        // TODO add your handling code here:
        double totalPrice=0;
        for(int i=0;i<tabMenu.getRowCount();i++)
        {
            int count=0;
            try
            {
                count=(Integer)tabMenu.getValueAt(i, 2);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Invalid number format!");
                return;
            }
            if(this.cart.getItems().get(i).getNum()!=count)
            this.cart.getItems().get(i).setNum(count);
            totalPrice+=this.cart.getItems().get(i).getDishAndPrice().getPrice()*this.cart.getItems().get(i).getNum();
        }
        this.lblPrice.setText("Total price: "+totalPrice);
    }//GEN-LAST:event_tabMenuMouseClicked

    private void tabMenuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabMenuKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_tabMenuKeyTyped

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        this.cart.setStatus("Submitted");
        this.res.addOrder(this.cart);
        
        //Display order detail and delivery info
        JOptionPane.showMessageDialog(null, "Confirm Successfully");
        
        ViewOrders view=new ViewOrders(this.userProcessContainer,this.ecosystem,this.res.getRestaurantName(),this.account.getUsername());
        this.userProcessContainer.remove(this);
        this.userProcessContainer.add("ViewOrders",view);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.show(this.userProcessContainer, "ViewOrders");
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tabMenu.getSelectedRow();

        if (selectedRow >= 0) {
            OrderItem item = (OrderItem) tabMenu.getValueAt(selectedRow,0);
            if(this.cart.getItems().contains(item))
            {
                this.cart.getItems().remove(item);
                JOptionPane.showMessageDialog(null, "Item deleted.");
                this.populate();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Item not exist");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnOrder;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tabMenu;
    // End of variables declaration//GEN-END:variables
}
