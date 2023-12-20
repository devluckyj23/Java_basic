package chapter04;

public class MethodSample {

	//메서드 오버로딩 : 갯수또는 타입이 달라야 오버로딩이 가능하다
			int getSum (int x, int y) { return x+y;}
			int getSum (int x, int y,int z) { return x+y+z;}
			double getSum (double x, double y) {return (double)(x+y);}
	
	
public static void main(String[] args) {
		
	//바로 출력을 원하면 위 변수 선언 문장에 static을 붙여준다.
	//static 없이 출력
	MethodSample sample = new MethodSample();
	System.out.println(sample.getSum(1, 2));
	System.out.println(sample.getSum(1, 2,3));
	System.out.println(sample.getSum(2.0, 3.0));
		
	}

}
