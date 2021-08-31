/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RentalRecordManagement;

import Stockmanagement.Product;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author happy
 */
public class RentalRecord {
            private ArrayList<Product> productList;
	    private Date rentDate;
	    private Date returnDate;
	 
	    public RentalRecord(ArrayList<Product> productList,Date rentDate,Date returnDate)  {
	        this.productList = productList;
	        this.rentDate=rentDate;
	        this.returnDate=returnDate;
	        
	    }

	    public ArrayList<Product> getProductList() {
	        return productList;
	    }

	    public Date getRentDate() {
	        return rentDate;
	    }

	    public void setRentDate(Date rentDate) {
	        this.rentDate = rentDate;
	    }

	    public Date getReturnDate() {
	        return returnDate;
	    }

	    public void setReturnDate(Date returnDate) {
	        this.returnDate = returnDate;
	    }

}

