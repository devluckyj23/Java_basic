package chapter04;

public class Circle {
	//필드 : 속성
	
	public double radius; //멤버변수
	public String name; // 멤버변수
	public static final double PI = 3.14; //멤버변수,상수
	public static String Circle_name = "원형"; //클래스 변수
	//메서드 : 행위
	//생성자 메서드
	public Circle() {} //Default 생성자
	public Circle (String name, double radius) {
		this.name = name;
		this.radius = radius;
	}
	
	//일반메서드
	double getArea() { return PI * radius * radius; }
	static double getArea(double radius) { return PI * radius * radius; }
	//main 메서드
	public static void main(String[] args) {
//		Circle c = new Circle(); 
//		Circle c1 = new Circle("원1",3); // 공간확보& 초기화 
//		System.out.printf("%.2f",c1.getArea());
		
		
		Circle pizza = new Circle("피자",10);
		Circle donut = new Circle("도넛",2);
		
		System.out.println(Circle.Circle_name);
		System.out.println("피자의 크기는 " + pizza.getArea());
		System.out.println("도넛의 크기는 " + donut.getArea());
		System.out.println(Circle.getArea(3.0));
		
		
		
		
		
	}
}