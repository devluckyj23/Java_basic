package miniproject;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop{
	//쇼핑몰 프로그램을 위한 빌드
	
	//등록 사용자 정보 배열
	User[] users = new User[2];
	
	//등록된 상품 정보 배열
	Product[] products = new Product[4];

	//상품 정보를 추가할 수 있는 장바구니
	 ArrayList<Product> cart = new ArrayList<Product>();
	
	 Scanner scan = new Scanner(System.in);
	 
	//*todo : 추가적으로 필요할 빌드
	//---------------------------------------------//
	 String title; 	// 쇼핑몰 이름
	 int sel_user; 	//선택된 사용자 인덱스
	 
	
	
	//setTitle 		:쇼핑몰 제목달기
	//---------------------------------------------//
	@Override
	public  void setTitle(String title) {this.title = title;}
	
	
	//genUser 		:사용자 정보를 등록하기
	//---------------------------------------------//
	@Override	
	public  void genUser() {
		User user = new User("홍길동", PayType.CARD);
		users[0] = user;
		user = new User("정웅기",PayType.CASH);
		users[1] = user;
		
	}
	
	
	
	//genProduct 	:상품정보를 등록하기
	//---------------------------------------------//
	@Override	
	public  void genProduct() {
	
	CellPhone cell = new CellPhone("갤럭시20",1500000,"LGU+");
	products[0] =cell;
	
	cell = new CellPhone("애플아이폰14",1000000,"LGU+");
	products[1] =cell;
	
	SmartTV tv = new SmartTV("삼성3d SmartTV",3000000,"4K");
	products[2] =tv;
	
	tv = new SmartTV("LG SmartTV", 2000000,"FullHD");
	products[3] =tv;
}
	//start 		:쇼핑몰의 전체기능을 위한 시나리오 넣기
	//---------------------------------------------//
	@Override
	public  void start() {
		System.out.println(title + ": 메인 화면 - 계정 선택 >>");
		System.out.println("=".repeat(30));
		//1. 사용자 정보 출력
		//2.
		
		int index =0;
		for(User u : users) {
			System.out.print("[" + index++ + "]");
			System.out.println(u.toString());
		}
		System.out.println("[x] 종료 "); 
		System.out.println("선택 : ");
		
		String select = scan.next(); // 선택 : h,c, 상품 index
		switch(select) {
		case "x" : System.exit(0); break; //메인화면으로 >>
		default :
			//1. select 값을 int 형으로 바꾸고
			sel_user = Integer.parseInt(select);
			productList();
		}
	
	}
	
	//productList  	:상품정보 출력하기
	//---------------------------------------------//
	public void productList() {
		System.out.println(title + ": 상품 목록 - 상품 선택 >>");
		System.out.println("=".repeat(30));
		int index =0;
		for(Product p : products) {
			System.out.print("[" + index++ + "]");
			p.printDefault();
			System.out.println();
		}
		System.out.println("[h] 메인화면"); //start 메소드
		System.out.println("[c] 체크아웃"); // checkOut 메소드
		System.out.println("선택 : ");
		
		String select = scan.next(); // 선택 : h,c, 상품 index
		
		switch(select) {
		case "h" : start(); break; //메인화면으로 >>
		case "c" : checkOut(); break; // 체크아웃으로 >>
		default :
			//1: select 값을 int 형으로 바꾸고
//			int psel = Integer.parseInt(select);
//			//2: int로 바뀐 select 값의 인덱스에 대한 product 정보를
//			cart.add(products[psel]);
			//3: cart에 add시킨다.
			cart.add(products[Integer.parseInt(select)]);
			productList();
		}
	}
	
	//checkOut 		:체크아웃 후 결제하기
	//---------------------------------------------//
	public void checkOut() {
		System.out.println(title + ": 체크아웃 >>>");
		System.out.println("=".repeat(30));
		int sum =0; 	//장바구니 가격 합계
		int index =0;
		for(Product p : cart) {
			System.out.print("[" + index++ + "]");
			System.out.println(p.toString());
			System.out.println();
			sum += p.getPrice();
		}
		//결제 방법 출력
		System.out.println("=".repeat(30));
		System.out.println("사용자명 :" + users[sel_user].getName());
		System.out.println("결제방법 :" + users[sel_user].getPaytype());
		System.out.println("=".repeat(30));
		// 합계 출력
		System.out.println("계산금액 :" + sum + "원 입니다.");
		System.out.println("[p] 이전, [q] 결제 완료");
		System.out.println("선택 : ");
		
		// 선택 메뉴에 따른 실행
		
		String select = scan.next();
		
		switch(select) {
		case "p" : productList(); 
				   break; //상품목록화면으로 >>
				   
		case "q" : System.out.println("쇼핑몰 프로그램이 종료됩니다."); // 종료
				   System.exit(0); 
				   break;
				   
		default :
				checkOut();
		}
	
		
	}
	//프로그램의 시나리오에 따라 초기화하고, 시작한다.
	//객체사용을 하지 않아도 run 메소드에서 제약없이 사용가능.
	void run() {
		setTitle("레서판다 쇼핑몰");
		genUser();
		genProduct();
		start();
		
	}
	
	
	//main이 static이라는 사실을 인지하고, 모든 메소드를 static으로 변환시키거나 run 메소드를 만들어 객체를 만들어 run메소드를 사용
	public static void main(String args[]) {
	
		MyShop shop = new MyShop();
		shop.run();
	}
	
}
