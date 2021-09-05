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
        System.out.println("getProducts");
        ArrayList<Product> expResult = null;
        ArrayList<Product> result = DataStore.getProducts();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCustomers method, of class DataStore.
     */
    @Test
    public void testGetCustomers() {
        System.out.println("getCustomers");
        DataStore instance = new DataStore();
        ArrayList<Customer> expResult = null;
        ArrayList<Customer> result = instance.getCustomers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployees method, of class DataStore.
     */
    @Test
    public void testGetEmployees() {
        System.out.println("getEmployees");
        DataStore instance = new DataStore();
        ArrayList<Employee> expResult = null;
        ArrayList<Employee> result = instance.getEmployees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProduct method, of class DataStore.
     */
    @Test
    public void testSetProduct() {
        System.out.println("setProduct");
        Product P = null;
        DataStore instance = new DataStore();
        instance.setProduct(P);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setcustomers method, of class DataStore.
     */
    @Test
    public void testSetcustomers() {
        System.out.println("setcustomers");
        Customer C = null;
        DataStore.setcustomers(C);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkCustomerExists method, of class DataStore.
     */
    @Test
    public void testCheckCustomerExists() {
        System.out.println("checkCustomerExists");
        Customer C = null;
        boolean expResult = false;
        boolean result = DataStore.checkCustomerExists(C);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmployees method, of class DataStore.
     */
    @Test
    public void testSetEmployees() {
        System.out.println("setEmployees");
        Employee E = null;
        DataStore instance = new DataStore();
        instance.setEmployees(E);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SearchCustomerById method, of class DataStore.
     */
    @Test
    public void testSearchCustomerById() {
        System.out.println("SearchCustomerById");
        String id = "";
        Customer expResult = null;
        Customer result = DataStore.SearchCustomerById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SearchProductbyProductId method, of class DataStore.
     */
    @Test
    public void testSearchProductbyProductId() {
        System.out.println("SearchProductbyProductId");
        String serialNumber = "";
        String status = "";
        Product expResult = null;
        Product result = DataStore.SearchProductbyProductId(serialNumber, status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProductStatus method, of class DataStore.
     */
    @Test
    public void testSetProductStatus() {
        System.out.println("setProductStatus");
        Product P = null;
        String status = "";
        DataStore.setProductStatus(P, status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchProductByDate method, of class DataStore.
     */
    @Test
    public void testSearchProductByDate() {
        System.out.println("searchProductByDate");
        Date fromDate = null;
        Date toDate = null;
        ArrayList<RentalRecord> expResult = null;
        ArrayList<RentalRecord> result = DataStore.searchProductByDate(fromDate, toDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProductTempList method, of class DataStore.
     */
    @Test
    public void testAddProductTempList() {
        System.out.println("addProductTempList");
        Product p = null;
        DataStore.addProductTempList(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTempProductList method, of class DataStore.
     */
    @Test
    public void testGetTempProductList() {
        System.out.println("getTempProductList");
        ArrayList<Product> expResult = null;
        ArrayList<Product> result = DataStore.getTempProductList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
