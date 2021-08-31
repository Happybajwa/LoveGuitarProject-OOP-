/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeAndCustomerManagement;

import RentalRecordManagement.RentalRecord;
import java.util.ArrayList;

/**
 *
 * @author happy
 */
public class Customer {
    private ArrayList<RentalRecord> rentalRecords = new ArrayList<>();
    private String name;
    private String dateOfBirth;
    private String address;
    private String personId;
    private String phone;
 
	public Customer( String name, String dateOfBirth, String address,
			String personId, String phone) {

		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.personId = personId;
                this.phone=phone;
	
	}

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
	public ArrayList<RentalRecord> getRentalRecords() {
		return rentalRecords;
	}
	public void setRentalRecord(RentalRecord R)
        {
            rentalRecords.add(R);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCustomerId() {
		return personId;
	}

 

}
