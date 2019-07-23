import java.util.*;
import java.lang.*;
import java.io.*;


class AddressRepo
{
	public Address Retrive(int AddressID)
	{
		Address add = new Address(AddressID);

		if (AddressID == 200)
		{
			add.AddressType = 1;
			add.Streetline1 = "gali Street";
			add.City = "BARMER";
			add.State = "RAJASTHAN";
			add.Country = "INDIA";
			add.PostalCode = "344001"
		}
		return add;
	}

	//Retrive by customer Id
	//retrive using List


	public boolean Save(Address addr)
	{
		return true;
	}
		
}