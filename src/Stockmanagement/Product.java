/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stockmanagement;

/**
 *
 * @author happy
 */
public class Product {
     private String productSerialNumber;
	    private int yearOfManufacturer;
	    private double rentPerDay;
	    private String colour;
	    private double lenght;
	    private double widgt;
	    private double height;
	    private String status;
            private String type;
		public Product(String productSerialNumber, int yearOfManufacturer, double rentPerDay, String colour,
				double lenght, double widgt, double height, String status, String type) 
		{
			
			this.productSerialNumber = productSerialNumber;
			this.yearOfManufacturer = yearOfManufacturer;
			this.rentPerDay = rentPerDay;
			this.colour = colour;
			this.lenght = lenght;
			this.widgt = widgt;
			this.height = height;
			this.status = status;
                        this.type = type;
		}

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public void setProductSerialNumber(String productSerialNumber) {
                this.productSerialNumber = productSerialNumber;
    }
                
		public int getYearOfManufacturer() {
			return yearOfManufacturer;
		}
		public void setYearOfManufacturer(int yearOfManufacturer) {
			this.yearOfManufacturer = yearOfManufacturer;
		}
		public double getRentPerDay() {
			return rentPerDay;
		}
		public void setRentPerDay(double rentPerDay) {
			this.rentPerDay = rentPerDay;
		}
		public String getColour() {
			return colour;
		}
		public void setColour(String colour) {
			this.colour = colour;
		}
		public double getLenght() {
			return lenght;
		}
		public void setLenght(double lenght) {
			this.lenght = lenght;
		}
		public double getWidgt() {
			return widgt;
		}
		public void setWidgt(double widgt) {
			this.widgt = widgt;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getProductSerialNumber() {
			return productSerialNumber;
		}
    
}
