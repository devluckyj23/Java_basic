package chapter02;

import java.util.Scanner;

public class Mission4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� �Է�(10~99) >>");
		int ���� = scan.nextInt();
		int �����ڸ� = ����/ 10;
		int �����ڸ� = ����%10;
		
		System.out.println();
		//� ������ �ʿ��ұ�?
		// ���ǿ����� Ȱ��
	/*String msg 
	= (�����ڸ� == �����ڸ�)?"YES! ���� �ڸ��� ���� �ڸ��� �����ϴ�.":"NO!�����ʽ��ϴ�.";
	System.out.println(msg);*/
		
//		 ���ǽ�if Ȱ��
//		if ������ ������ ��ٸ�(�����̻�) {}�� �Է��Ͽ� �����Ѵ�.
		String msg;
		if(�����ڸ� == �����ڸ�)
			msg = "YES! ���� �ڸ��� ���� �ڸ��� �����ϴ�.";
		else
			msg = "NO!�����ʽ��ϴ�.";
		System.out.println(msg);
	}

}
