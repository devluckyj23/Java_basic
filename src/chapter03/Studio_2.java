package chapter03;

import java.util.Random;
import java.util.Scanner;

public class Studio_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		 // 0~99까지 임의의 정수 생성
		boolean state = true;
		
		while(state)
			{
			 int count = 0;
			 r.setSeed(System.currentTimeMillis());
			 int com = r.nextInt(100);
			 int min = 0 ; 
			 int max = 99;
			 
			 System.out.println("수를 결정하였습니다. 맞출 수 있으면 맞추어 보세요 :D");
			 
			 while(state)
				 {
				 System.out.println(min + "-"+max);
				 count++;
				 int user = scan.nextInt();
				 System.out.println(count + ">>"+user);
				 if(user > com) {
					 	System.out.println("더 낮게!!");
				 		max = user; }
					else if(user < com) {
						System.out.println("더 높게!!");
				 			min = user;}
					else break;
				 }
			 
				 System.out.println("맞았습니다.");
				 System.out.println("다시하시겠습니까(y/n)");
				 
				 String text = scan.next();
				 if(text.equals("n"))  { 
					 break;  }
				 }
	}
	}



		
	

