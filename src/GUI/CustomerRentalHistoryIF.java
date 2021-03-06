/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Data.DataStore;
import EmployeeAndCustomerManagement.Customer;
import RentalRecordManagement.RentalRecord;
import Stockmanagement.Product;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author happy
 */
public class CustomerRentalHistoryIF extends javax.swing.JInternalFrame {

    /**
     * Creates new form CustomerRentalHistory
     */
    public CustomerRentalHistoryIF() {
        initComponents();
        Customer customer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customerRentalLable = new javax.swing.JLabel();
        customerHistoryIdLable = new javax.swing.JLabel();
        customerRentalIdTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerHistoryTable = new javax.swing.JTable();
        searchButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        customerIdErrorLable = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1250, 950));

        customerRentalLable.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        customerRentalLable.setText("Customer Rental History");

        customerHistoryIdLable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        customerHistoryIdLable.setText("Enter Customer ID:");

        customerRentalIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerRentalIdTextFieldActionPerformed(evt);
            }
        });
        customerRentalIdTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customerRentalIdTextFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );

        customerHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Serial No.", "Year of Manuf.", "Colour", "Rent Per day", "Date Rented", "Return Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customerHistoryTable);
        if (customerHistoryTable.getColumnModel().getColumnCount() > 0) {
            customerHistoryTable.getColumnModel().getColumn(0).setResizable(false);
            customerHistoryTable.getColumnModel().getColumn(1).setResizable(false);
            customerHistoryTable.getColumnModel().getColumn(2).setResizable(false);
            customerHistoryTable.getColumnModel().getColumn(3).setResizable(false);
            customerHistoryTable.getColumnModel().getColumn(4).setResizable(false);
            customerHistoryTable.getColumnModel().getColumn(5).setResizable(false);
        }

        searchButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        searchButton.setText("Search Customer");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clearButton.setText("Clear table");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        customerIdErrorLable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        customerIdErrorLable.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1107, 1107, 1107)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(customerHistoryIdLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(customerIdErrorLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(46, 46, 46)
                        .addComponent(customerRentalLable)
                        .addGap(517, 517, 517))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(customerRentalIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerRentalLable)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(customerIdErrorLable, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerHistoryIdLable)
                    .addComponent(customerRentalIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(clearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        Customer customer = null;
        String customerId = customerRentalIdTextField.getText();
        
        try{
        customer = DataStore.SearchCustomerById(customerId.trim());
       
         }catch(Exception ex)
            {
            if(ex instanceof NumberFormatException)
            JOptionPane.showMessageDialog(this,ex.getMessage());
            } 
        if(customer == null)
        {
            JOptionPane.showMessageDialog(this,"Customer Not Found in Record");
        }else
                {
                                    DefaultTableModel model = (DefaultTableModel)customerHistoryTable.getModel();
                                    model.setRowCount(0);
                                    Object[] rowData = new Object[6];
                                    ArrayList<RentalRecord> rentalRecords = customer.getRentalRecords();
                                    if(customerId.equals(customer.getCustomerId()))
                                    {
                                        for(RentalRecord r:rentalRecords)
                                        {
                                            for(Product p:r.getProductList())
                                            {
                                               SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                                                String rentDate = dateFormat.format(r.getRentDate());
                                                String returnDate = dateFormat.format(r.getReturnDate());
                                                rowData[0]=p.getProductSerialNumber();
                                                rowData[1]=p.getYearOfManufacturer();
                                                rowData[2]=p.getColour();
                                                rowData[3]=p.getRentPerDay();
                                                rowData[4]=rentDate;
                                                rowData[5]=returnDate; 
                                                
                                                model.addRow(rowData);  
                                            }
                                        }
                                               
                                                
                                     } 
                }  
          
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)customerHistoryTable.getModel();
        model.setRowCount(0);
   
    }//GEN-LAST:event_clearButtonActionPerformed

    private void customerRentalIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerRentalIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerRentalIdTextFieldActionPerformed

    private void customerRentalIdTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerRentalIdTextFieldKeyPressed
        // TODO add your handling code here:
         customerIdErrorLable.setText("");
        char c = evt.getKeyChar();
        String value = "";
        value = c+"";
        if(Character.isAlphabetic(c) || Character.isDigit(c) || Character.isISOControl(c) || Character.isLetter(c) || Character.isWhitespace(c) || value.equals("@") || value.equals("."))
        {
            customerRentalIdTextField.setEditable(true);
        }else
        {
            customerIdErrorLable.setText("Only Dot, @, Alphabets and Digits are Allowed");
            customerRentalIdTextField.setEditable(false);
        }
    
    }//GEN-LAST:event_customerRentalIdTextFieldKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel customerHistoryIdLable;
    private javax.swing.JTable customerHistoryTable;
    private javax.swing.JLabel customerIdErrorLable;
    private javax.swing.JTextField customerRentalIdTextField;
    private javax.swing.JLabel customerRentalLable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
