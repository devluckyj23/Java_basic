package chapter03;
//up - down ����
//����� : 1~99 �Է�
//��ǻ�� : 1~99 ������ ���� ����
//����ڰ� ��ǻ�� ���� ���߸� ���� ����!
//����� > ��ǻ�� down ����!
//����� < ��ǻ�� up ����!
//trial 7ȸ -> ���� : �̰��!! ����: �õ� Ƚ�� ���!! �����ߴ�!!
import java.util.Random;

import java.util.Scanner;

public class Mission03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 Random rand = new Random();
		
		 int count = 0;
		 final int try_number = 7; // ���
		 boolean state = true; // ���°� �������� ����
		
		 System.out.println("���纸�� ���� >> ");
		
		 rand.setSeed(System.currentTimeMillis());
		 System.out.println(System.currentTimeMillis());
		 
		 int com = 1 + rand.nextInt(99);
		
		
		while(true) {
			count ++;
		
			if(count > try_number) { 
			 state = false;
			break;}
		
			int user = scan.nextInt();
			
			
			if(user > com) 
				System.out.println("down ����!");
			else if(user < com)
				System.out.println("up ����!");
			else
				break;
		}
		
		
		if(state) System.out.println("��");
		else System.out.println("����");
		scan.close();
			
}
	
}
