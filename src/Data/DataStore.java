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

/**
 *
 * @author happy
 */
//just a comment
public class DataStore {
    private static ArrayList<Product> products= new ArrayList<>();
    private static ArrayList<Customer> customers= new ArrayList<>();
    private static ArrayList<Employee> employees= new ArrayList<>();
    private static ArrayList<Product> productTempList = new ArrayList();
    
    //ArrayList getters
    
    public static ArrayList<Product> getProducts()
        {
            return products;
        }
    public ArrayList<Customer> getCustomers()
        {
            return customers;
        }
    public ArrayList<Employee> getEmployees()
        {
            return employees;
        }
    //ArrayList setters
    
    public void setProduct(Product P)
        {
            products.add(P);
        }
    public static void setcustomers(Customer C)
        {
            customers.add(C);
        }
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
    public void setEmployees(Employee E)
        {
            
            employees.add(E);
        }
    //Search Customer Function
    public static Customer SearchCustomerById(String id)
    {   
        Customer found=null;
       for(Customer c:customers)
       {
         if(id.equals(c.getCustomerId()))
       {
         found = c;
         break;
       }
       }
       return found;
    }
    
    public static Product SearchProductbyProductId(String serialNumber, String status)

    {
    Product foundProduct = null;
    for(Product p:products)
        {
            if(serialNumber.equals(p.getProductSerialNumber()) && p.getStatus().equals(status))
                {
                     foundProduct=p;
                        break;
                }
        } return foundProduct;
    }
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
   public static void addProductTempList(Product p)
   {
       productTempList.add(p);
   }
   public static ArrayList<Product> getTempProductList()
   {
       return productTempList;
   }
}
