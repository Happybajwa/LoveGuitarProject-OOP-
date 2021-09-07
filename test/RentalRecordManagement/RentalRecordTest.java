/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RentalRecordManagement;

import Stockmanagement.Product;
import java.util.ArrayList;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author happy
 */
public class RentalRecordTest {
    
    public RentalRecordTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getReturnDate method, of class RentalRecord.
     */
    @Test
    public void testGetReturnDate() {
        ArrayList<Product> plist = new ArrayList<>();
        Date d1 = new Date();
        Date d2 = new Date();
         RentalRecord r = new RentalRecord(plist, d1, d2);
        assertEquals(d1, r.getRentDate());
     
    }

    /**
     * Test of setReturnDate method, of class RentalRecord.
     */
    @Test
    public void testSetReturnDate() {
        ArrayList<Product> plist = new ArrayList<>();
        Date d1 = new Date();
        Date d2 = new Date();
         RentalRecord r = new RentalRecord(plist, d1, d2);
         r.setReturnDate(d1);
        assertEquals(d1, r.getRentDate());
    }

    /**
     * Test of getProductList method, of class RentalRecord.
     */
    @Test
    public void testGetProductList() {
        ArrayList<Product> plist = new ArrayList<>();
        Date d1 = new Date();
        Date d2 = new Date();
        Product p1 = new Product("101", 10, 10, "White", 10, 10, 10, "Avaialble");
        plist.clear();
        plist.add(p1);
        RentalRecord r = new RentalRecord(plist, d1, d2);
        assertEquals(plist, r.getProductList());
      
    }

    /**
     * Test of getRentDate method, of class RentalRecord.
     */
    @Test
    public void testGetRentDate() {
          ArrayList<Product> plist = new ArrayList<>();
        Date d1 = new Date();
        Date d2 = new Date();
        Product p1 = new Product("101", 10, 10, "White", 10, 10, 10, "Avaialble");
        plist.clear();
        plist.add(p1);
        RentalRecord r = new RentalRecord(plist, d1, d2);
        assertEquals(d1, r.getRentDate());
        
    }

    /**
     * Test of setRentDate method, of class RentalRecord.
     */
    @Test
    public void testSetRentDate() {
        ArrayList<Product> plist = new ArrayList<>();
        Date d1 = new Date();
        Date d2 = new Date();
        Product p1 = new Product("101", 10, 10, "White", 10, 10, 10, "Avaialble");
        plist.clear();
        plist.add(p1);
        RentalRecord r = new RentalRecord(plist, d1, d2);
        r.setRentDate(d2);
        assertEquals(d2, r.getRentDate());
        
       
    }

    /**
     * Test of getReturnDueDate method, of class RentalRecord.
     */
    @Test
    public void testGetReturnDueDate() {
        
        ArrayList<Product> plist = new ArrayList<>();
        Date d1 = new Date();
        Date d2 = new Date();
        Product p1 = new Product("101", 10, 10, "White", 10, 10, 10, "Avaialble");
        plist.clear();
        plist.add(p1);
        RentalRecord r = new RentalRecord(plist, d1, d2);
        assertEquals(d2, r.getReturnDate());
        
    }

    /**
     * Test of setReturnDueDate method, of class RentalRecord.
     */
    @Test
    public void testSetReturnDueDate() {
        ArrayList<Product> plist = new ArrayList<>();
        Date d1 = new Date();
        Date d2 = new Date();
        Product p1 = new Product("101", 10, 10, "White", 10, 10, 10, "Avaialble");
        plist.clear();
        plist.add(p1);
        RentalRecord r = new RentalRecord(plist, d1, d2);
        
        r.setReturnDueDate(d1);
        assertEquals(d1, r.getRentDate());
       
    }
    
}
