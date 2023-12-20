package chapter02;

import java.util.Random;
import java.util.Scanner;

//user 와 com 이 있다.
//user는 1,2,3 - 가위 바위 보
//com 은 random 하게 컴퓨터가 생성한다.
//1회의 게임을 하고 누가 이겼는지 화면에 출력하라!
//if 도는 switch 중에 결정해서 프로그램 작성




public class Mission10 {

	public static void main(String[] args) {
		// 1) Math.random() 메서드를 활용해서 난수를 생성
		// 1+ Math.random *3(최대값)
		// int com = (int)(Math.random()*3);
				
		// 2) random() 클래스 nextint, nextdouble...
		
		Random rand = new Random();
		int com = 1 + rand.nextInt(3);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3) >> ");
		int user = scan.nextInt();
		
		if( com ==1) System.out.println("컴퓨터 : 가위");
		else if( com ==2) System.out.println("컴퓨터 : 바위" );
		else  System.out.println("컴퓨터 : 보");
		
		
//		if( com == user) {
//			
//			System.out.println(" 비겼습니다. ");
//		}
//		
//		if( user == 1 ) {
//		 if(com == 2) 
//				System.out.println(" 졌습니다.");
//			if(com ==3)
//				System.out.println("이겼습니다.");
//		}
//	
//		if( user == 2 ){
//			if(com == 1) 
//				System.out.println(" 이겼습니다.");
//			if(com == 3)
//				System.out.println("졌습니다.");
//
//		}
//		if( user == 3 ){
//			if(com == 1) 
//				System.out.println(" 졌습니다.");
//			if(com == 2)
//				System.out.println("이겼습니다");
//		
//	}
//(result == 0) ==  !(result)
	 int result = user -com;
	 
	 if(result == 0)  System.out.println("무승부!");
	 else if( result == -1 || result == 2) System.out.println("컴퓨터 승!");
	 else 								   System.out.println("사용자 승!");
	 
	 }
  }