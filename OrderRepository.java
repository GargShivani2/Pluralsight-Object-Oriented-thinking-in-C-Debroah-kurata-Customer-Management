import java.util.*;
import java.lang.*;
import java.io.*;

Class OrderRepo
{
	public OrderRepo Retrive(int OrderID)
	{
		Order Odr = new Order(OrderID);


		if(OrderID == 1200)
		{
			Odr.OrderDate = "16-07-2019";
		}
		return Odr;
	}

	public boolean Save(Order Odr)
	{
		return true;
	}
}

public class Main
{
	public static void main(String[] args) 
	{
		OrderRepo OdrRepo = new OrderRepo();
		
		Order order1 = new Order(1200);
		//product1.setProductName("Apple");
		//product1.setProductType("Fruit");
		//product1.setProductID(1);
		//product1.setCurrentPrice(100);
		
		
		Order actual = OdrRepo.Retrive(1200);
	
		System.out.println(actual.getOrderDate());
		//System.out.println(actual.getProductType());
		//System.out.println(actual.getCurrentPrice());
	}
}