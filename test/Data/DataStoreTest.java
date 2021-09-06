/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import EmployeeAndCustomerManagement.Customer;
import EmployeeAndCustomerManagement.Employee;
import RentalRecordManagement.RentalRecord;
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
public class DataStoreTest {
    
    public DataStoreTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getProducts method, of class DataStore.
     */
    @Test
    public void testGetProducts() {
        ArrayList<Product> p = new ArrayList<>();
        ArrayList<Product> dataStoreList = DataStore.getProducts();
        
        Product p1 = new Product("101", 10, 10, "White", 10, 10, 10, "Avaialble");
        DataStore d = new DataStore();
        dataStoreList.clear();
        d.setProduct(p1);
        p.add(p1);
        assertEquals(p, DataStore.getProducts());
    }
  @Test
    public void testGetProductsCountZero() {
        ArrayList<Product> p = new ArrayList<>();
        ArrayList<Product> dataStoreList = DataStore.getProducts();
        
        Product p1 = new Product("101", 10, 10, "White", 10, 10, 10, "Avaialble");
        DataStore d = new DataStore();
        
        dataStoreList.clear();
  
        assertEquals(dataStoreList.size(), DataStore.getProducts().size());
    }
    /**
     * Test of getCustomers method, of class DataStore.
     */
    @Test
    public void testGetCustomers() {
         ArrayList<Customer> c = new ArrayList<>();
        DataStore d = new DataStore();
        Customer c1 = new Customer("Harry","18","AKL","gfjdgjh", "gdh4124");
        c.add(c1);
        DataStore.setCustomers(c1);
        assertEquals(c, DataStore.getCustomers());
    }

    /**
     * Test of getEmployees method, of class DataStore.
     */

    /**
     * Test of setProduct method, of class DataStore.
     */
    @Test
    public void testSetProduct() {
        DataStore d = new DataStore();
        
         ArrayList<Product> datastorelist = DataStore.getProducts();
        ArrayList<Product> plist = new ArrayList<>();
        Product P1 = new Product("101", 2010, 10, "White", 10, 20, 20, "Rented");
              
        plist.add(P1);    
        datastorelist.clear();
        
        d.setProduct(P1);
        assertEquals(plist,DataStore.getProducts());
    }

    /**
     * 
     */
    @Test
    public void testSetCustomers() {
          DataStore d = new DataStore();
        ArrayList<Customer> c = DataStore.getCustomers();
        ArrayList<Customer> c1 = new ArrayList<>();
        Customer c2 = new Customer("Garry","18","AKL","gfjdgjh", "gdh4124");
        c1.add(c2);
        c.clear();
        DataStore.setCustomers(c2);
        assertEquals(c1, DataStore.getCustomers());
    }

    /**
     * Test of checkCustomerExists method, of class DataStore.
     */
    @Test
    public void testCheckCustomerExists() {
        Customer c1 = new Customer("Garry","18","AKL","111", "gdh4124");
        ArrayList<Customer> customer = DataStore.getCustomers();
        customer.clear();
        DataStore.setCustomers(c1);
        for(Customer c : DataStore.getCustomers())
        {
            assertEquals(c1, c);
        }
  
    }

    @Test
    public void testSearchCustomerByValidId() {
        Customer c1 = new Customer("Garry","18","AKL","111", "gdh4124");
        Customer c2 = new Customer("Garry","18","AKL","121", "gdh4124");
        
        ArrayList<Customer> list = DataStore.getCustomers();
        list.clear();
        DataStore.setCustomers(c1);
        assertEquals(c1, DataStore.SearchCustomerById("111"));
    }

      @Test
    public void testSearchCustomerByInvalidId() {
        Customer c1 = new Customer("Garry","18","AKL","111", "gdh4124");
        ArrayList<Customer> list = DataStore.getCustomers();
        list.clear();
        DataStore.setCustomers(c1);
        assertEquals(null, DataStore.SearchCustomerById("121"));
    }
    /**
     * Test of SearchProductbyProductId method, of class DataStore.
     */
    @Test
    public void testSearchProductbyProductId() {
        Product p1 = new Product("103", 10, 10, "White", 10, 10, 10, "Available");
        ArrayList<Product> plist = DataStore.getProducts();
        plist.clear();
        plist.add(p1);
        assertEquals(p1.getProductSerialNumber(), DataStore.SearchProductbyProductId("103", "Available").getProductSerialNumber());
    }
    
     @Test
    public void testSearchProductbyInvalidProductId() {
        Product p1 = new Product("103", 10, 10, "White", 10, 10, 10, "Available");
        ArrayList<Product> plist = DataStore.getProducts();
        plist.clear();
        plist.add(p1);
        assertEquals(null, DataStore.SearchProductbyProductId("105", "Available"));
    }

    /**
     * Test of setProductStatus method, of class DataStore.
     */
    @Test
    public void testSetProductStatus() {
        Product p1 = new Product("103", 10, 10, "White", 10, 10, 10, "Available");
        DataStore d = new DataStore();
        ArrayList<Product> plist = DataStore.getProducts();
        plist.clear();
        plist.add(p1);
        DataStore.setProductStatus(p1, "Rented");
        assertEquals("Rented", p1.getStatus());
      
    }
    

    /**
     * Test of searchProductByDate method, of class DataStore.
     */
    @Test
    public void testSearchProductByDate() {
     ArrayList<RentalRecord> r = new ArrayList<>();
     Date d1 = new Date();
     Date d2 = new Date();
     DataStore.searchProductByDate(d1, d2);
     assertEquals(r, DataStore.searchProductByDate(d1, d2));
    }

    /**
     * Test of addProductTempList method, of class DataStore.
     */
//    @Test
//    public void testAddProductTempList() {
//    
//    }
//
//    /**
//     * Test of getTempProductList method, of class DataStore.
//     */
//    @Test
//    public void testGetTempProductList() {
//  
//    }
    
}
