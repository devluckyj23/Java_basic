package chapter02;

import java.util.Scanner;

public class Mission4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 입력(10~99) >>");
		int 정수 = scan.nextInt();
		int 십의자리 = 정수/ 10;
		int 일의자리 = 정수%10;
		
		System.out.println();
		//어떤 문법이 필요할까?
		// 조건연산자 활용
	/*String msg 
	= (십의자리 == 일의자리)?"YES! 십의 자리와 일의 자리가 같습니다.":"NO!같지않습니다.";
	System.out.println(msg);*/
		
//		 조건식if 활용
//		if 이후의 조건이 길다면(한줄이상) {}를 입력하여 서술한다.
		String msg;
		if(십의자리 == 일의자리)
			msg = "YES! 십의 자리와 일의 자리가 같습니다.";
		else
			msg = "NO!같지않습니다.";
		System.out.println(msg);
	}

}
