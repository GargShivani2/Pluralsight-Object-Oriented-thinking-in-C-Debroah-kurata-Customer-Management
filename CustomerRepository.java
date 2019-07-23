import java.util.*;
import java.lang.*;
import java.io.*;


class CustomerRepo
{
	public CustomerRepo()
	{
		addressRepo = new AddressRepo();
	}

	private AddressRepo addressRepo;

	public AddressRepo getAddRepo() {return addressRepo;}
	public void setAddRepo(AddressRepo Repo){ this.addressRepo = Repo;}

	public Customer Retrive(int CustomerID)
	{
		Customer cust = new Customer(CustomerID);


		if(CustomerID ==1)
		{
			cust.firstName = "SHIVANI";
			cust.lastName = "GARG";
			cust.emailAddress = "shivanigarg123iitr@gmail.com";
			cust.AddressList = 
		}
		return  cust;
	}

	public boolean Save( Customer Cust)
	{
		return true;
	}
}

public class Main
{
	public static void main(String[] args) 
	{
		CustomerRepo custRepo = new CustomerRepo();
    	Customer cust = new Customer(1);
    	
    	Customer actual = custRepo.Retrive(1);
		
  		System.out.println(actual.getlastName());
		System.out.println(actual.getfirstName());
    	System.out.println(actual.getemailAddress());
    	//System.out.println(cust1.getCount());
    	//System.outtr.println(cust.getCount());
  }
  