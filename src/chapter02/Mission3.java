package chapter02;

import java.util.Scanner;

public class Mission3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("원화를 입력하세요>>");
		int won = scan.nextInt();
		System.out.println(won + "원은 $" + (double)won/1100 + "입니다.");
		
		scan.close();
	}

}
