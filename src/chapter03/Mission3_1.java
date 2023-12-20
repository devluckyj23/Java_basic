package chapter03;

import java.util.Random;
import java.util.Scanner;

public class Mission3_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 Random rand = new Random();
		 
		 //1. 컴퓨터 값을 생성한다.
		 rand.setSeed(System.currentTimeMillis());
		 System.out.println(System.currentTimeMillis());
		 int com = 1 + rand.nextInt(99);
		 final int try_number = 7;// final == 상수 선언
		 int count = 0;
		 boolean state = true; // 상태 변수 ( 성공이라고 가정)
		 
		 //3. 반복을 한다 (try_number 횟수까지, 성공할때까지)
		 while(true) {
			 count++;
			 if(count < try_number) {
				 state = false;
				 break;
			 }
			 //2. 게임을 한다. 
			 System.out.println("사용자입력(1~99)>>");
			 int user = scan.nextInt(); // 1~99
			 
			 if (user >com) System.out.println("user 값 down 시켜!");
			 else if (user < com) System.out.println("user값 up시켜!");
			 
			 else break;
			 
		 }
			 if(state) System.out.println(" 맞추셨습니다!!");
			 else  System.out.println(" 맞추셨습니다!! 시도횟수는 " + (count-1));
			 
			 
	}

}
