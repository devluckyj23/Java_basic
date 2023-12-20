package miniproject;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop{
	//���θ� ���α׷��� ���� ����
	
	//��� ����� ���� �迭
	User[] users = new User[2];
	
	//��ϵ� ��ǰ ���� �迭
	Product[] products = new Product[4];

	//��ǰ ������ �߰��� �� �ִ� ��ٱ���
	 ArrayList<Product> cart = new ArrayList<Product>();
	
	 Scanner scan = new Scanner(System.in);
	 
	//*todo : �߰������� �ʿ��� ����
	//---------------------------------------------//
	 String title; 	// ���θ� �̸�
	 int sel_user; 	//���õ� ����� �ε���
	 
	
	
	//setTitle 		:���θ� ����ޱ�
	//---------------------------------------------//
	@Override
	public  void setTitle(String title) {this.title = title;}
	
	
	//genUser 		:����� ������ ����ϱ�
	//---------------------------------------------//
	@Override	
	public  void genUser() {
		User user = new User("ȫ�浿", PayType.CARD);
		users[0] = user;
		user = new User("������",PayType.CASH);
		users[1] = user;
		
	}
	
	
	
	//genProduct 	:��ǰ������ ����ϱ�
	//---------------------------------------------//
	@Override	
	public  void genProduct() {
	
	CellPhone cell = new CellPhone("������20",1500000,"LGU+");
	products[0] =cell;
	
	cell = new CellPhone("���þ�����14",1000000,"LGU+");
	products[1] =cell;
	
	SmartTV tv = new SmartTV("�Ｚ3d SmartTV",3000000,"4K");
	products[2] =tv;
	
	tv = new SmartTV("LG SmartTV", 2000000,"FullHD");
	products[3] =tv;
}
	//start 		:���θ��� ��ü����� ���� �ó����� �ֱ�
	//---------------------------------------------//
	@Override
	public  void start() {
		System.out.println(title + ": ���� ȭ�� - ���� ���� >>");
		System.out.println("=".repeat(30));
		//1. ����� ���� ���
		//2.
		
		int index =0;
		for(User u : users) {
			System.out.print("[" + index++ + "]");
			System.out.println(u.toString());
		}
		System.out.println("[x] ���� "); 
		System.out.println("���� : ");
		
		String select = scan.next(); // ���� : h,c, ��ǰ index
		switch(select) {
		case "x" : System.exit(0); break; //����ȭ������ >>
		default :
			//1. select ���� int ������ �ٲٰ�
			sel_user = Integer.parseInt(select);
			productList();
		}
	
	}
	
	//productList  	:��ǰ���� ����ϱ�
	//---------------------------------------------//
	public void productList() {
		System.out.println(title + ": ��ǰ ��� - ��ǰ ���� >>");
		System.out.println("=".repeat(30));
		int index =0;
		for(Product p : products) {
			System.out.print("[" + index++ + "]");
			p.printDefault();
			System.out.println();
		}
		System.out.println("[h] ����ȭ��"); //start �޼ҵ�
		System.out.println("[c] üũ�ƿ�"); // checkOut �޼ҵ�
		System.out.println("���� : ");
		
		String select = scan.next(); // ���� : h,c, ��ǰ index
		
		switch(select) {
		case "h" : start(); break; //����ȭ������ >>
		case "c" : checkOut(); break; // üũ�ƿ����� >>
		default :
			//1: select ���� int ������ �ٲٰ�
//			int psel = Integer.parseInt(select);
//			//2: int�� �ٲ� select ���� �ε����� ���� product ������
//			cart.add(products[psel]);
			//3: cart�� add��Ų��.
			cart.add(products[Integer.parseInt(select)]);
			productList();
		}
	}
	
	//checkOut 		:üũ�ƿ� �� �����ϱ�
	//---------------------------------------------//
	public void checkOut() {
		System.out.println(title + ": üũ�ƿ� >>>");
		System.out.println("=".repeat(30));
		int sum =0; 	//��ٱ��� ���� �հ�
		int index =0;
		for(Product p : cart) {
			System.out.print("[" + index++ + "]");
			System.out.println(p.toString());
			System.out.println();
			sum += p.getPrice();
		}
		//���� ��� ���
		System.out.println("=".repeat(30));
		System.out.println("����ڸ� :" + users[sel_user].getName());
		System.out.println("������� :" + users[sel_user].getPaytype());
		System.out.println("=".repeat(30));
		// �հ� ���
		System.out.println("���ݾ� :" + sum + "�� �Դϴ�.");
		System.out.println("[p] ����, [q] ���� �Ϸ�");
		System.out.println("���� : ");
		
		// ���� �޴��� ���� ����
		
		String select = scan.next();
		
		switch(select) {
		case "p" : productList(); 
				   break; //��ǰ���ȭ������ >>
				   
		case "q" : System.out.println("���θ� ���α׷��� ����˴ϴ�."); // ����
				   System.exit(0); 
				   break;
				   
		default :
				checkOut();
		}
	
		
	}
	//���α׷��� �ó������� ���� �ʱ�ȭ�ϰ�, �����Ѵ�.
	//��ü����� ���� �ʾƵ� run �޼ҵ忡�� ������� ��밡��.
	void run() {
		setTitle("�����Ǵ� ���θ�");
		genUser();
		genProduct();
		start();
		
	}
	
	
	//main�� static�̶�� ����� �����ϰ�, ��� �޼ҵ带 static���� ��ȯ��Ű�ų� run �޼ҵ带 ����� ��ü�� ����� run�޼ҵ带 ���
	public static void main(String args[]) {
	
		MyShop shop = new MyShop();
		shop.run();
	}
	
}
