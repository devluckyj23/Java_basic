package chapter03;

public class Mission15 {

	public static void main(String[] args) {
		try { 
			System.out.println(3/0);
		}
		catch(ArithmeticException e){
			System.out.println("0으로는 나눌수 없습니다.");
			
//			e.printStackTrace(); 
			// 원래 저장되어있던 오류 메시지가 자동으로 뜬다.
		}

	}

}
