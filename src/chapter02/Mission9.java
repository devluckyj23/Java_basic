package chapter02;

import java.util.Scanner;

// switch 문 활용
// 사용자로부터 month 를 정수로 입력받아서
//month의 days 를 출력해주세요
//month : 2 -28일, 4,6,9,11

public class Mission9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("월(1~12) >>");
		int month = scan.nextInt();
		int days = 0; 
		switch(month) {
		case 2 : 
			days = 28;
			break;
			
		case 4 : case 6 : case 9 : case 11 : 
			days = 30;
			break;
			
		default :
			days = 31;
			break;
		}
		System.out.println(month + "월은 "+ days + "입니다.");
	}

}
