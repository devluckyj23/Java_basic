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
		System.out.println("plain = " + (cyper^key)); // ����ȭ
		System.out.println("======================");
		System.out.println(10 >>1);
		System.out.println(10 <<1);

		
		System.out.println("======================");
		var v = 30;
		// var �ڵ����� ����Ÿ���� �߷��Ͽ� �־���.
		System.out.println(v);
		
// (boolean) result�� �Է��ϸ� ����� == ���� asign(�Ҵ�) �϶�� ��
// (boolean) ���� x true,flase�� ��� o			
		
	}
}
