package chapter02;

import java.util.Scanner;

public class Mission2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//Scanner 사용하기 위해서는 import선언 필요
//자동 import : ctrl +shift + o
//한줄 복사 : ctrl + alt +방향키
		System.out.print("입력할 내용을 적어주세요 >>");
		String msg = scan.next();
		System.out.println("msg = " + msg);
		
		
		
		System.out.print("입력할 정수를 적어주세요 >>");
		int num = scan.nextInt();
		System.out.println("num = " + num);
		
		
	
	}

}
