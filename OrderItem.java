import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class OrderItem
{
	public String OrderName;
	public double PurchasePrice;
	public int Quantity;
	public int OrderID;
	public int ProductID;

	//Order has customer and shipping address
	//defining composion berween order customer and address
	public int CustomerID;
	public int ShippingAddressID;

	

	public OrderItem()
	{

	}
	public OrderItem (int OrderID)
	{
		this.OrderID = OrderID;
	}

	public String getOrderName() {return OrderName;}
	public void setOrderName(String Pname) { this.OrderName=Pname;}

	public int getPurchsePrice() {return PurchasePrice;}
	public void setPurchasePrice(int Price) { this.PurchasePrice= Price;}

	public int getQuantity() {return Quantity;}
	public void setQuantity(int Count){ this.Quantity = Count;}

	public int getProductId() {return ProductID;}
	public void setProductID(int ProductID){ this.ProductID = ProductID;}

	public int getOrderId() {return OrderID;}

	public int getCustomerId() {return CustomerID;}
	public void setCustomerId(int CustomerID){ this.CustomerID = CustomerID;}

	public int getShippingAddressId() {return ShippingAddressID;}
	public void setShippingAddressID(int ShippingAddressID){ this.ShippingAddressID = ShippingAddressID;}


	public boolean Validate()
	{
		if(OrderName == null || Quantity <= 0 || ProductID <= 0|| PurchasePric == 0.0)
			return false;
		else
			return true;
	}
	
	

	public int Display(int OrderID)
	{
		return OrderID;
	}

	public boolean Save()
	{
		return true;
	}

}

public class Main
{
	public static void main(String[] args) 
	{
		OrderItem order1 = new OrderItem(001);
		order1.setOrderName("Apple");
		order1.setOrderType("Fruit");
		//product1.setProductID(1);
		order1.setPurchasePrice(100);


		System.out.println(product1.ProductID);
	}
}