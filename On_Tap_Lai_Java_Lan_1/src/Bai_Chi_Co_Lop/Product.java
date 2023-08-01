package Bai_Chi_Co_Lop;

import java.util.Scanner;

public class Product {

	protected String id;
	
	protected float price;
	
	protected String color;
	
	public Product()
	{
		this.id = "No id";
		this.price = 0;
		this.color = "No color";
	}
	
	public Product(String id, float price, String color)
	{
		this.id = id;
		this.price = price;
		this.color = color;
	}
	
	public String GetId()
	{
		return id;
	}
	
	public float GetPrice()
	{
		return price;
	}
	
	public String GetColor()
	{
		return color;
	}
	
	public void SetId(String id)
	{
		this.id = id;
	}
	
	public void SetPrice(float price)
	{
		this.price = price;
	}
	
	public void SetColor(String color)
	{
		this.color = color;
	}
	
	public void Input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input id:");
		SetId(sc.nextLine());
		System.out.println("Input price:");
		SetPrice(sc.nextFloat());
		sc.nextLine();
		System.out.println("Input color:");
		SetColor(sc.nextLine());
	}
	
	public void Output()
	{
		System.out.println("Id :" + id);
		System.out.println("Price :" + price);
		System.out.println("Color :" + color);
	}
	
	@Override
	public String toString()
	{
		return "Id :" + id + ", Price :" + price + ", Color :" + color;
	}
}
