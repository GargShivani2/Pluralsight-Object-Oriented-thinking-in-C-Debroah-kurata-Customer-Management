import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Address
{
	public int AddressID;
	public int AddressType;
	public String City;
	public String Country;
	public String PostalCode;
	public String StreetLine1;
	public String StreetLine2;

	public Address()
	{

	}

	public Address(int AddressID)
	{
		this.AddressID =  AddressID;
	}

	//Setter and Getter

	public int getAddressID() {return AddressID;}

	public int getAddressType() {return AddressType;}
	public void setAddressType(int Atype) { this.AddressType=Atype;}

	public String getCity (){return City;}
	public void setCity(String CityName) { this.City = CityName;}

	public String getCountry (){return Country;}
	public void setCountry(String CountryName) { this.Country = CountryName;}

	public String getPostalCode (){return PostalCode;}
	public void setPostalCode(String ZipCode) { this.PostalCode = ZipCode;}

	public String getStreet1 (){return StreetLine1;}
	public void setStreet1(String Street1) { this.StreetLine1 = Street1;}

	public int getAddressID() {return AddressID;}


	// Methods

	public boolean Validate()
	{
		if(PostalCode==null) return false;
		else return true;
	}
}