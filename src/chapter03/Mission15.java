package chapter03;

public class Mission15 {

	public static void main(String[] args) {
		try { 
			System.out.println(3/0);
		}
		catch(ArithmeticException e){
			System.out.println("0���δ� ������ �����ϴ�.");
			
//			e.printStackTrace(); 
			// ���� ����Ǿ��ִ� ���� �޽����� �ڵ����� ���.
		}

	}

}
