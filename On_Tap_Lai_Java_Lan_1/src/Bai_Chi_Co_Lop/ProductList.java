package Bai_Chi_Co_Lop;

import java.util.ArrayList;
import java.util.List;

public class ProductList {

	private List<Product> ds;
	
	public ProductList()
	{
		ds = new ArrayList<>();
	}
	
	public void Add(Product p)
	{
		ds.add(p);
	}
	
	public void Remove(Product p)
	{
		ds.remove(p);
	}
	
	public void Display()
	{
		for(Product p : ds)
		{
			p.Output();
		}
	}
}
