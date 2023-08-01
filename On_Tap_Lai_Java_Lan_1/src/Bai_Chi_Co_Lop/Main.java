package Bai_Chi_Co_Lop;

public class Main {

	public static void main(String[] args) {
		//	System.out.println("Ninh Van Hai day kkk" + ( 1  + 1));
		Moto m1 = new Moto();
		m1.Input();
		m1.Output();
		Moto m2 = new Moto();
		m2.Input();
		ProductList list1 = new ProductList();
		
		list1.Add(m1);
		list1.Add(m2);
		list1.Display();
	}
}
