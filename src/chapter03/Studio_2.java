package chapter03;

import java.util.Random;
import java.util.Scanner;

public class Studio_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		 // 0~99���� ������ ���� ����
		boolean state = true;
		
		while(state)
			{
			 int count = 0;
			 r.setSeed(System.currentTimeMillis());
			 int com = r.nextInt(100);
			 int min = 0 ; 
			 int max = 99;
			 
			 System.out.println("���� �����Ͽ����ϴ�. ���� �� ������ ���߾� ������ :D");
			 
			 while(state)
				 {
				 System.out.println(min + "-"+max);
				 count++;
				 int user = scan.nextInt();
				 System.out.println(count + ">>"+user);
				 if(user > com) {
					 	System.out.println("�� ����!!");
				 		max = user; }
					else if(user < com) {
						System.out.println("�� ����!!");
				 			min = user;}
					else break;
				 }
			 
				 System.out.println("�¾ҽ��ϴ�.");
				 System.out.println("�ٽ��Ͻðڽ��ϱ�(y/n)");
				 
				 String text = scan.next();
				 if(text.equals("n"))  { 
					 break;  }
				 }
	}
	}



		
	

