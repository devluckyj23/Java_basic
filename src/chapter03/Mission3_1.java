package chapter03;

import java.util.Random;
import java.util.Scanner;

public class Mission3_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 Random rand = new Random();
		 
		 //1. ��ǻ�� ���� �����Ѵ�.
		 rand.setSeed(System.currentTimeMillis());
		 System.out.println(System.currentTimeMillis());
		 int com = 1 + rand.nextInt(99);
		 final int try_number = 7;// final == ��� ����
		 int count = 0;
		 boolean state = true; // ���� ���� ( �����̶�� ����)
		 
		 //3. �ݺ��� �Ѵ� (try_number Ƚ������, �����Ҷ�����)
		 while(true) {
			 count++;
			 if(count < try_number) {
				 state = false;
				 break;
			 }
			 //2. ������ �Ѵ�. 
			 System.out.println("������Է�(1~99)>>");
			 int user = scan.nextInt(); // 1~99
			 
			 if (user >com) System.out.println("user �� down ����!");
			 else if (user < com) System.out.println("user�� up����!");
			 
			 else break;
			 
		 }
			 if(state) System.out.println(" ���߼̽��ϴ�!!");
			 else  System.out.println(" ���߼̽��ϴ�!! �õ�Ƚ���� " + (count-1));
			 
			 
	}

}
