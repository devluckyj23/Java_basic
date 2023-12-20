package chapter03;
//up - down 게임
//사용자 : 1~99 입력
//컴퓨터 : 1~99 까지의 값을 생성
//사용자가 컴퓨터 값을 맞추면 게임 성공!
//사용자 > 컴퓨터 down 시켜!
//사용자 < 컴퓨터 up 시켜!
//trial 7회 -> 성공 : 이겼다!! 실패: 시도 횟수 출력!! 실패했다!!
import java.util.Random;

import java.util.Scanner;

public class Mission03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 Random rand = new Random();
		
		 int count = 0;
		 final int try_number = 7; // 상수
		 boolean state = true; // 상태가 성공임을 가정
		
		 System.out.println("맞춰보셈 ㅋㅋ >> ");
		
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
				System.out.println("down 시켜!");
			else if(user < com)
				System.out.println("up 시켜!");
			else
				break;
		}
		
		
		if(state) System.out.println("굿");
		else System.out.println("실패");
		scan.close();
			
}
	
}
