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
import java.util.regex.Pattern;

/**
 *
 * @author happy
 */
//just a comment
public class DataStore {
    private static ArrayList<Product> products = new ArrayList<>();
    private static ArrayList<Customer> customers = new ArrayList<>();
    private static ArrayList<Employee> employees = new ArrayList<>();
   
    


    //ArrayList getters
    
    public static ArrayList<Product> getProducts(){    return products;}
    public static ArrayList<Customer> getCustomers(){return customers;}
    public ArrayList<Employee> getEmployees(){return employees;}
    
    //ArrayList setters
    
    public static void setProducts(Product P){products.add(P);}
    public static void setCustomers(Customer C){customers.add(C);}
  
    
    //Checking if customer is already  exists in list
    public static boolean checkCustomerExists(Customer C)
        {
            boolean customerfound = false;
            for(Customer c: customers)
            {
                if(c.getCustomerId().equals(C.getCustomerId()))
                {
                    customerfound = true;
                    break;
                }
            }
            return customerfound; 
        }
    
    
    public static boolean checkProductExists(Product product)
    {
        boolean found = false;
        for(Product p : products)
        {
            if(product.getProductSerialNumber().equals(p.getProductSerialNumber()))
            {
                found = true;
                break;
            }
        }return found;
    }
    
    
    public void setEmployees(Employee E)
        {
            
            employees.add(E);
        }
    //Search Customer Function
    
    /*Searching Customer by ID function, 
      Functions need an String type ID to chechk in 
      system is customer not foundit will return null value*/
    public static Customer SearchCustomerById(String id) throws Exception
    {   
        Customer found=null;
        if(Pattern.matches("[A-Za-z0-9@.]+", id))
        {
        for(Customer c:customers)
            {
                if(id.equals(c.getCustomerId()))
                {
                found = c;
                break;
                }
            } 
        }return found;
    }
    
    //Search Product by Product ID and Product Status Function
    public static Product SearchProductbyProductId(String serialNumber, String status) throws Exception
    {
        Product foundProduct = null;
        if(Pattern.matches("[A-Za-z0-9]+", serialNumber))
        {
            
            for(Product p:products)
                {
                 if(serialNumber.equals(p.getProductSerialNumber()) && status.equals(p.getStatus()))
                    {
                    foundProduct=p;
                    break;
                    }
                } 
        }
          else
              {
                throw new Exception("Only Alphabets and Digits are Allowed");
              }
        return foundProduct;
       
    }
    
    //Setting the product status
   public static void setProductStatus(Product P,String status)
    {
     
     for(Product p: products)
        {
         if(P.getProductSerialNumber().equals(p.getProductSerialNumber()))
                {
                    p.setStatus(status);
                    break;
                }
        }
        
    }
   
   /*   Search Product by Date Function
        We are converting Date to Long 
        So that we can search product between two dates
   */
   public static ArrayList<RentalRecord> searchProductByDate(Date fromDate, Date toDate)
   { 
       long fromDateLong =fromDate.getTime();
       long toDateLong = toDate.getTime();
       ArrayList<RentalRecord> rentalList = new ArrayList<>();      
      for(Customer c : customers)
      {
        ArrayList<RentalRecord> rentalRecordList = c.getRentalRecords();
        for(RentalRecord r:rentalRecordList)
        {
                  
              Date rentDate = r.getRentDate();
              long rentDateLong = rentDate.getTime();
            if(fromDateLong <= rentDateLong && toDateLong >= rentDateLong) 
            {
              rentalList.add(r);
            }
        }
      }return rentalList;
   }  
}
