import java.util.*;
import java.lang.*;
import java.io.*;


class Order
{
	
	public String OrderDate;
	public int OrderID;
	

	public Order()
	{

	}
	public Order (int OrderID)
	{
		this.OrderID = OrderID;
	}

	public boolean Validate()
	{
		if(OrderDate==null)
			return false;
		else
			return true;
	}
	
	/*

	public int Display(int OrderID)
	{
		return OrderID;
	}

	public boolean Save()
	{
		return true;
	}
	*/
}