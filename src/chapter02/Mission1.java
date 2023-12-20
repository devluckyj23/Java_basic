package chapter02;

public class Mission1 {
	
	public static void main(String[] args) {
		boolean result;
		result = true;
		System.out.println(result);
		System.out.println("=====================");
		
		int a = (int) 3.5;
		
		int plain =10;
		int key = 8;
		int cyper = plain ^ key;
		System.out.println("cyper = " + cyper);
		System.out.println("plain = " + (cyper^key)); // 복구화
		System.out.println("======================");
		System.out.println(10 >>1);
		System.out.println(10 <<1);

		
		System.out.println("======================");
		var v = 30;
		// var 자동으로 변수타입을 추론하여 주어짐.
		System.out.println(v);
		
// (boolean) result만 입력하면 노란줄 == 값을 asign(할당) 하라는 말
// (boolean) 숫자 x true,flase만 사용 o			
		
	}
}
