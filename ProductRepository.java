import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ProductRepo
{
	public Product Retrive(int ProductID)
	{
		Product Prod = new Product(ProductID);


		if(ProductID == 100)
		{
			Prod.ProductName = "Apple";
			Prod.ProductType = "Fruit";
			Prod.CurrentPrice = 200;

		}
		return  Prod;
	}

	public boolean Save(Product Prod)
	{
		return true;
	}
}
public class Main
{
	public static void main(String[] args) 
	{
		ProductRepo ProdRepo = new ProductRepo();
		
		Product product1 = new Product(100);
		//product1.setProductName("Apple");
		//product1.setProductType("Fruit");
		//product1.setProductID(1);
		//product1.setCurrentPrice(100);
		
		
		Product actual = ProdRepo.Retrive(100);
	
		System.out.println(actual.getProductName());
		System.out.println(actual.getProductType());
		System.out.println(actual.getCurrentPrice());
	}
}