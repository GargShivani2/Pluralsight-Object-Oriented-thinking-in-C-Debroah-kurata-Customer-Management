import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Product
{
	public String ProductName;
	public int CurrentPrice;
	public int ProductID;
	public String ProductType;
	public int ProductCount;

	public Product()
	{

	}
	public Product (int ProductID)
	{
		this.ProductID = ProductID;
	}

	public String getProductName() {return ProductName;}
	public void setProductName(String Pname) { this.ProductName=Pname;}

	public String getProductType() {return ProductType;}
	public void setProductType(String Ptype) { this.ProductType=Ptype;}

	public int getCurrentPrice (){return CurrentPrice;}
	public void setCurrentPrice(int Price) { this.CurrentPrice = Price;}

	public int getProductID() {return ProductID;}


	public boolean Validate()
	{
		if(ProductName == null || ProductType == null || ProductID == 0||CurrentPrice==0)
			return false;
		else
			return true;
	}
	
	

	public int Display(int ProductID)
	{
		return ProductID;
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
		Product product1 = new Product(33);
		product1.setProductName("Apple");
		product1.setProductType("Fruit");
		//product1.setProductID(1);
		product1.setCurrentPrice(100);


		System.out.println(product1.ProductID);
	}
}