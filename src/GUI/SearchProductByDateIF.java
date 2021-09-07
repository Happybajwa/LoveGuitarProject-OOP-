/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Data.DataStore;
import RentalRecordManagement.RentalRecord;
import Stockmanagement.Product;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author happy
 */
public class SearchProductByDateIF extends javax.swing.JInternalFrame {
Product product = null;


    /**
     * Creates new form SearchProductByDateIF
     */
    public SearchProductByDateIF() {
        initComponents();
        tablePanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        showProductRecordButton = new javax.swing.JButton();
        FromLable = new javax.swing.JLabel();
        dateoptionLable = new javax.swing.JLabel();
        ProductHistoryLable = new javax.swing.JLabel();
        tablePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        productListTable = new javax.swing.JTable();
        clearTable = new javax.swing.JButton();
        firstDatePicker = new org.jdesktop.swingx.JXDatePicker();
        secondDatePicker = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 204, 255)), "LoveGuitarRecords", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(1250, 950));

        showProductRecordButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showProductRecordButton.setText("Show Record");
        showProductRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showProductRecordButtonActionPerformed(evt);
            }
        });

        FromLable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FromLable.setText("From");

        dateoptionLable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dateoptionLable.setText("Please Choose two date's to show record from");

        ProductHistoryLable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ProductHistoryLable.setText("Products Being Rented");

        tablePanel.setBackground(new java.awt.Color(204, 204, 204));

        productListTable.setBackground(new java.awt.Color(204, 204, 204));
        productListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial Number", "Year", "Rent Per Day", "Rent Date", "Retrun Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productListTable.setPreferredSize(new java.awt.Dimension(870, 874));
        jScrollPane2.setViewportView(productListTable);
        if (productListTable.getColumnModel().getColumnCount() > 0) {
            productListTable.getColumnModel().getColumn(0).setResizable(false);
            productListTable.getColumnModel().getColumn(1).setResizable(false);
            productListTable.getColumnModel().getColumn(2).setResizable(false);
            productListTable.getColumnModel().getColumn(3).setResizable(false);
            productListTable.getColumnModel().getColumn(4).setResizable(false);
        }

        clearTable.setText("Clear table");
        clearTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(clearTable)))
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearTable))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("to");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProductHistoryLable)
                            .addComponent(dateoptionLable)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FromLable)
                                .addGap(12, 12, 12)
                                .addComponent(firstDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(secondDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(showProductRecordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 325, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProductHistoryLable)
                .addGap(18, 18, 18)
                .addComponent(dateoptionLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FromLable)
                    .addComponent(jLabel1)
                    .addComponent(secondDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showProductRecordButton))
                .addGap(18, 18, 18)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showProductRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showProductRecordButtonActionPerformed
        // TODO add your handling code here:
        if(firstDatePicker.getDate()==null && secondDatePicker.getDate()==null)
        {
            JOptionPane.showMessageDialog(this, "Please Select Valid Dates to Search Product From");
            firstDatePicker.setDate(null);
            secondDatePicker.setDate(null);
            
                    
            
        }else if(firstDatePicker.getDate() == null &  secondDatePicker.getDate()!=null || firstDatePicker.getDate() != null &  secondDatePicker.getDate()==null)
        {
            JOptionPane.showMessageDialog(this, "Please Select Both Dates to Search Product From");
            firstDatePicker.setDate(null);
            secondDatePicker.setDate(null);
        }else
        {
        Date firstDate = firstDatePicker.getDate();
        Date secondDate = secondDatePicker.getDate();
        long firstDateLong = firstDate.getTime();
        long secondDateLong = secondDate.getTime();
        
        if (firstDateLong > secondDateLong)
            {
             JOptionPane.showMessageDialog(this, "Please Check the Date\nNote: TO Date can not be before FROM Date");   
             firstDatePicker.setDate(null);
             secondDatePicker.setDate(null);
            }else
                {
                     ArrayList<RentalRecord> rentalRecordList = DataStore.searchProductByDate(firstDate, secondDate);  
                     if(rentalRecordList.isEmpty())
                            {
                                JOptionPane.showMessageDialog(this, "Sorry No Record Found");
                                firstDatePicker.setDate(null);
                                secondDatePicker.setDate(null);
                                
                            }else
                                {
                                    DefaultTableModel model = (DefaultTableModel)productListTable.getModel();
                                    model.setRowCount(0);
                                    Object[] rowData = new Object[5];
                                    for(RentalRecord r:rentalRecordList)
                                        {
                                            ArrayList<Product> productList =  r.getProductList();
                                            for(Product p:productList)
                                            {
                                                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                                                String rentDate = dateFormat.format(r.getRentDate());
                                                String returnDate = dateFormat.format(r.getReturnDate());
                                                rowData[0]=p.getProductSerialNumber();
                                                rowData[1]=p.getYearOfManufacturer();
                                                rowData[2]=p.getRentPerDay();
                                                rowData[3]=rentDate;
                                                rowData[4]=returnDate; 
                                                model.addRow(rowData);
                                                tablePanel.setVisible(true);
                                            }       
                                        }                  
                                }
                }
        }
    }//GEN-LAST:event_showProductRecordButtonActionPerformed

    private void clearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearTableActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)productListTable.getModel();
        model.setRowCount(0);
        firstDatePicker.setDate(null);
        secondDatePicker.setDate(null);
    }//GEN-LAST:event_clearTableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FromLable;
    private javax.swing.JLabel ProductHistoryLable;
    private javax.swing.JButton clearTable;
    private javax.swing.JLabel dateoptionLable;
    private org.jdesktop.swingx.JXDatePicker firstDatePicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable productListTable;
    private org.jdesktop.swingx.JXDatePicker secondDatePicker;
    private javax.swing.JButton showProductRecordButton;
    private javax.swing.JPanel tablePanel;
    // End of variables declaration//GEN-END:variables
}
