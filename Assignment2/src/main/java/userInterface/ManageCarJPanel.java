/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import CarManagement.Car;
import CarManagement.CarDirectory;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author SUNREN
 */
public class ManageCarJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCarJPanel
     */
    private JPanel userProcessContainer;
    private CarDirectory carDirectory;
    private Car car;

    ManageCarJPanel(JPanel userProcessContainer, CarDirectory carDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.carDirectory = carDirectory;
        this.car = car;
        populateCarLastUpdate();
        populateTable();
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblCars.getModel();
        dtm.setRowCount(0);
        int no=1;
        for (Car car : carDirectory.getCarList()) {
            Object[] row = new Object[10];
            row[0] = no;
            row[1] = car;//索引1对应car，后面会用到
            row[2] = car.getAvail();
            row[3] = car.getManuYear();
            row[4] = car.getSeat();
            row[5] = car.getSerialNum();
            row[6] = car.getModelNum();
            row[7] = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(car.getUpdate());
            row[8] = car.getCity();
            row[9] = car.getCertificate();
            dtm.addRow(row);
            no++;
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
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCars = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnViewDetails = new javax.swing.JButton();
        btnDeleteCar = new javax.swing.JButton();
        buttonLastUpdate = new javax.swing.JButton();
        txtUpdate = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();
        toggleButtonModelNum = new javax.swing.JToggleButton();
        toggleButtonCityName = new javax.swing.JToggleButton();
        toggleButtonManuYear = new javax.swing.JToggleButton();
        toggleButtonAvailable = new javax.swing.JToggleButton();
        toggleButtonCertificate = new javax.swing.JToggleButton();
        toggleButtonManu = new javax.swing.JToggleButton();
        toggleButtonSerialNum = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        spinnerSeatMin = new javax.swing.JSpinner();
        spinnerSeatMax = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        checkBoxAvailable = new javax.swing.JCheckBox();
        comboBoxManu = new javax.swing.JComboBox<>();
        comboBoxManuYear = new javax.swing.JComboBox<>();
        comboBoxSerialNum = new javax.swing.JComboBox<>();
        comboBoxModelNum = new javax.swing.JComboBox<>();
        comboBoxCityName = new javax.swing.JComboBox<>();
        checkBoxCertificate = new javax.swing.JCheckBox();
        toggleButtonSeat = new javax.swing.JToggleButton();

        setLayout(new java.awt.GridBagLayout());

        tblCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Manufacturer", "Available", "Manufactured Year", "Seat", "Serial Number", "Model Number", "Update", "City", "Certificate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCars.setPreferredSize(new java.awt.Dimension(675, 1000));
        jScrollPane1.setViewportView(tblCars);
        if (tblCars.getColumnModel().getColumnCount() > 0) {
            tblCars.getColumnModel().getColumn(1).setResizable(false);
            tblCars.getColumnModel().getColumn(2).setResizable(false);
            tblCars.getColumnModel().getColumn(3).setResizable(false);
            tblCars.getColumnModel().getColumn(4).setResizable(false);
            tblCars.getColumnModel().getColumn(5).setResizable(false);
            tblCars.getColumnModel().getColumn(6).setResizable(false);
            tblCars.getColumnModel().getColumn(7).setResizable(false);
            tblCars.getColumnModel().getColumn(8).setResizable(false);
            tblCars.getColumnModel().getColumn(9).setResizable(false);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(jScrollPane1, gridBagConstraints);

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(btnBack, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setLayout(new java.awt.GridBagLayout());

        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel2.add(btnViewDetails, gridBagConstraints);

        btnDeleteCar.setText("Delete Car");
        btnDeleteCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel2.add(btnDeleteCar, gridBagConstraints);

        buttonLastUpdate.setText("Last Updated:");
        buttonLastUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLastUpdateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel2.add(buttonLastUpdate, gridBagConstraints);

        txtUpdate.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 144;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel2.add(txtUpdate, gridBagConstraints);

        buttonSearch.setText("Search");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel2.add(buttonSearch, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(jPanel2, gridBagConstraints);

        toggleButtonModelNum.setText("Model Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(toggleButtonModelNum, gridBagConstraints);

        toggleButtonCityName.setText("City Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(toggleButtonCityName, gridBagConstraints);

        toggleButtonManuYear.setText("ManufactureYear");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(toggleButtonManuYear, gridBagConstraints);

        toggleButtonAvailable.setText("Available");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(toggleButtonAvailable, gridBagConstraints);

        toggleButtonCertificate.setText("Certificate");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(toggleButtonCertificate, gridBagConstraints);

        toggleButtonManu.setText("Manufacture");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(toggleButtonManu, gridBagConstraints);

        toggleButtonSerialNum.setText("Serial Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(toggleButtonSerialNum, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Min");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel3.add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel3.add(spinnerSeatMin, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel3.add(spinnerSeatMax, gridBagConstraints);

        jLabel2.setText("Max");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel3.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(jPanel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(checkBoxAvailable, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(comboBoxManu, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(comboBoxManuYear, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(comboBoxSerialNum, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(comboBoxModelNum, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(comboBoxCityName, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(checkBoxCertificate, gridBagConstraints);

        toggleButtonSeat.setText("Seat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jPanel1.add(toggleButtonSeat, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(jPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCars.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from table first to view details.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Car car = (Car) tblCars.getValueAt(selectedRow, 1);//获取索引1的值，索引1对应car
            ViewCarJPanel panel = new ViewCarJPanel(userProcessContainer, car, this.carDirectory);
            userProcessContainer.add("ViewCarJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnDeleteCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCarActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCars.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the car details?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                Car car = (Car) tblCars.getValueAt(selectedRow, 1);//获取索引1的值，索引1对应car
                carDirectory.deleteCar(car);
                populateTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteCarActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void populateCarLastUpdate() {
        //刷新LastUpdate信息
        if (carDirectory.getCarList().isEmpty()) {
            //如果不存在car，那么设置下面的提示信息
            txtUpdate.setText("There is not any car");
        } else {
            try {
                //获取最新的日期
                Date last = new SimpleDateFormat("yyyy-MM-dd").parse("1900-1-1");
                for (Car car : carDirectory.getCarList()) {
                    if (last.before(car.getUpdate())) {
                        last = car.getUpdate();
                    };
                }
                txtUpdate.setText(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(last));
            } catch (ParseException ex) {
                Logger.getLogger(ManageCarJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void buttonLastUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLastUpdateActionPerformed
        populateCarLastUpdate();//更新LastUpdate
        populateTable();//更新表格
        populateComboBoxes();//更新相关候选的下拉框
    }//GEN-LAST:event_buttonLastUpdateActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        ArrayList<Car> carsShow = new ArrayList<>();//创建变量用来存储满足筛选条件的car
        for (Car car : carDirectory.getCarList()) {
            boolean statusAvailable = true;
            boolean statusManu = true;
            boolean statusManuYead = true;
            boolean statusSeat = true;
            boolean statusModelNumber = true;
            boolean statusSerialNumber = true;
            boolean statusCityName = true;
            boolean statusCertificate = true;
            if (toggleButtonAvailable.isSelected()) {//如果toggleButtonAvailable按下，表示需要执行Available的筛选，下面的同理。
                statusAvailable = (car.getAvail() == checkBoxAvailable.isSelected());
            }
            if (toggleButtonManu.isSelected()) {
                statusManu = (car.getManu().equals(comboBoxManu.getSelectedItem()));
            }

            if (toggleButtonManuYear.isSelected()) {
                statusManuYead = (car.getManuYear().equals(comboBoxManuYear.getSelectedItem()));
            }
            if (toggleButtonSeat.isSelected()) {
                statusManuYead = ((car.getSeat() >= ((int) spinnerSeatMin.getValue())) && (car.getSeat() <= ((int) spinnerSeatMax.getValue())));
            }
            if (toggleButtonModelNum.isSelected()) {
                statusModelNumber = (car.getModelNum().equals(comboBoxModelNum.getSelectedItem()));
            }
            if (toggleButtonSerialNum.isSelected()) {
                statusSerialNumber = (car.getSerialNum().equals(comboBoxSerialNum.getSelectedItem()));
            }
            if (toggleButtonCityName.isSelected()) {
                statusCityName = (car.getCity().equals(comboBoxCityName.getSelectedItem()));
            }
            if (toggleButtonCertificate.isSelected()) {
                statusCertificate = (car.getCertificate() == checkBoxCertificate.isSelected());
            }
            if (statusManu && statusAvailable && statusCertificate && statusManuYead
                    && statusSeat && statusModelNumber && statusSerialNumber && statusCityName) {
                //如果条件都满足，那么将car添加到carsShow
                carsShow.add(car);
            }
        }
        //填充表格
        DefaultTableModel dtm = (DefaultTableModel) tblCars.getModel();
        dtm.setRowCount(0);
        int no=1;
        for (Car car : carsShow) {
            Object[] row = new Object[10];
            row[0] = no;
            row[1] = car;//索引1对应car，后面会用到
            row[2] = car.getAvail();
            row[3] = car.getManuYear();
            row[4] = car.getSeat();
            row[5] = car.getSerialNum();
            row[6] = car.getModelNum();
            row[7] = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(car.getUpdate());
            row[8] = car.getCity();
            row[9] = car.getCertificate();
            dtm.addRow(row);
            no++;
        }
    }//GEN-LAST:event_buttonSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteCar;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JButton buttonLastUpdate;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JCheckBox checkBoxAvailable;
    private javax.swing.JCheckBox checkBoxCertificate;
    private javax.swing.JComboBox<String> comboBoxCityName;
    private javax.swing.JComboBox<String> comboBoxManu;
    private javax.swing.JComboBox<String> comboBoxManuYear;
    private javax.swing.JComboBox<String> comboBoxModelNum;
    private javax.swing.JComboBox<String> comboBoxSerialNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spinnerSeatMax;
    private javax.swing.JSpinner spinnerSeatMin;
    private javax.swing.JTable tblCars;
    private javax.swing.JToggleButton toggleButtonAvailable;
    private javax.swing.JToggleButton toggleButtonCertificate;
    private javax.swing.JToggleButton toggleButtonCityName;
    private javax.swing.JToggleButton toggleButtonManu;
    private javax.swing.JToggleButton toggleButtonManuYear;
    private javax.swing.JToggleButton toggleButtonModelNum;
    private javax.swing.JToggleButton toggleButtonSeat;
    private javax.swing.JToggleButton toggleButtonSerialNum;
    private javax.swing.JTextField txtUpdate;
    // End of variables declaration//GEN-END:variables

    private void populateComboBoxes() {
        Vector<String> manus = new Vector<>();//存储当前的所有Manu
        Vector<String> manuYears = new Vector<>();
        Vector<String> modelNums = new Vector<>();
        Vector<String> serialNums = new Vector<>();
        Vector<String> cities = new Vector<>();

        for (Car car : carDirectory.getCarList()) {
            if (!manus.contains(car.getManu())) {//对当前的Manu进行去重后添加
                manus.add(car.getManu());
            }
            if (!manuYears.contains(car.getManuYear())) {
                manuYears.add(car.getManuYear());
            }
            if (!modelNums.contains(car.getModelNum())) {
                modelNums.add(car.getModelNum());
            }
            if (!serialNums.contains(car.getSerialNum())) {
                serialNums.add(car.getSerialNum());
            }
            if (!cities.contains(car.getCity())) {
                cities.add(car.getCity());
            }
        }
        comboBoxManu.setModel(new DefaultComboBoxModel(manus));//设置下拉框的模型
        comboBoxManuYear.setModel(new DefaultComboBoxModel(manuYears));
        comboBoxModelNum.setModel(new DefaultComboBoxModel(modelNums));
        comboBoxSerialNum.setModel(new DefaultComboBoxModel(serialNums));
        comboBoxCityName.setModel(new DefaultComboBoxModel(cities));
    }
}
