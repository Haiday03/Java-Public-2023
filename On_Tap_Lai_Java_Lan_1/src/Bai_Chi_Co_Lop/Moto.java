package Bai_Chi_Co_Lop;

import java.util.Scanner;

public class Moto extends Product{

	String name;
	
	int age;

	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Moto(String id, float price, String color, String name, int age) {
		super(id, price, color);
		this.name = name;
		this.age = age;
		// TODO Auto-generated constructor stub
	}

	public Moto(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Moto [name=" + name + ", age=" + age + "]";
	}

	@Override
	public void Input()
	{
		super.Input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input name:");
		setName(sc.nextLine());
		System.out.println("Input age:");
		setAge(sc.nextInt());
	}
	@Override
	public void Output()
	{
		System.out.println("<===================XUAT================>");
		super.Output();
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
	}
	

	
}
