package chapter03;

import java.util.Random;
import java.util.Scanner;

//user 와 com 이 있다.
//user는 1,2,3 - 가위 바위 보
//com 은 random 하게 컴퓨터가 생성한다.
//1회의 게임을 하고 누가 이겼는지 화면에 출력하라!
//if 도는 switch 중에 결정해서 프로그램 작성




public class Mission02 {

	public static void main(String[] args) {
		// 1) Math.random() 메서드를 활용해서 난수를 생성
		// 1+ Math.random *3(최대값)
		// int com = (int)(Math.random()*3);
				
		// 2) random() 클래스 nextint, nextdouble...
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int count = 0;
		final int try_number = 10; // 상수
		boolean state = true; // 상태가 성공임을 가정
		
		
		while(true) {
			count ++;
			
			if(count > try_number) break;
			 state = false;
			
			 rand.setSeed(System.currentTimeMillis());
			 System.out.println(System.currentTimeMillis());
			 int com = 1 + rand.nextInt(3);
			
	
			System.out.println("가위(1), 바위(2), 보(3) >> ");
			int user = scan.nextInt();
			
			if( com ==1) System.out.println("컴퓨터 : 가위");
			else if( com ==2) System.out.println("컴퓨터 : 바위" );
			else  System.out.println("컴퓨터 : 보");
			
	
			 int result = user -com;
			 
			 if(result == 0)  System.out.println("무승부!");
			 else if( result == -1 || result == 2) System.out.println("컴퓨터 승!");
			 else {			
				 System.out.println("사용자 승!");
			 }
			
			 break;
			 }				
		
			scan.close();
					System.out.println("====================================");
				if(state) System.out.println("당신의 승리");
				else System.out.println("시도횟수 증가!!");
	} 
	
	
  }