/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Customer
{
	public String lastName;
	public String firstName;
	public String fullName;
	public String emailAddress;
	public static int count;
	public int CustomerID;

	//Composition relation between Customer and Address
	public List<Address> AddressList = new ArrayList<Address>(); 
	
	//Construstor Overloading
	public Customer() : this.(0)
	{
		
	}
	
	public Customer(int CustomerID)
	{
		this.CustomerID = CustomerID;
		AddressList = new List<Address>();
	}
	
	// getter and setter
	public String getlastName(){return lastName;}
	public void setlastName(String lastName){this.lastName = lastName;}

	public String getfirstName(){return firstName;}
	public void setfirstName(String firstName){this.firstName = firstName;}
	
	public String getemailAddress(){return emailAddress;}
	public void setemailAddress(String newEmail){this.emailAddress = newEmail;}
	
	public static int getCount(){return count;}
	public static void setCount(int val){count = val;}
	
	public int getCustomerID(){return CustomerID;}

	public List<Address> getAddressList() { return AddressList;}
	public void setAddressList(int position, Address address1) {this.AddressList[position] = address1;}
 
	public String getfullName()
	{
		if(firstName==null && lastName== null)
			return null;
		else if(firstName!=null && lastName!= null)
			return firstName + " "+ lastName;
		else if (firstName == null)
			return lastName;
		else
			return firstName;
	}
	
	
	
	// Methods
	public boolean Validate()
	{
		if(firstName == null || firstName == " " ||emailAddress == null || emailAddress == " ") return false;
		else return true;
	}
	
			
}

public class Main
{
	public static void main(String[] args) {
		
    	Customer cust = new Customer();
    	Customer cust1 = new Customer();
   
    	cust.setlastName("GARG");
    	//cust.setfirstName("SHIVANI");
		cust.setemailAddress("shivanigarg123iitr@gmail.com");
		
  		//System.out.println(cust.Validate());
		
    	System.out.println(cust.getfirstName());
    	//System.out.println(cust.getfullName());
    	//System.out.println(cust1.getCount());
    	//System.outtr.println(cust.getCount());
  }
  
}