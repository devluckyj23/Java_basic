package chapter02;

import java.util.Scanner;

public class Mission5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("금액을 입력하시오>>");
		
		int money = scan.nextInt();
		 
		System.out.println("오만원권 "+money/50000+"매");
        money%=50000;
        System.out.println("만원권 "+money/10000+"매");
        money%=10000;
        System.out.println("오천원권 "+money/5000+"매");
        money%=5000;
        System.out.println("천원권 "+money/1000+"매");
        money%=10000;
        System.out.println("오백원 "+money/500+"개");
        money%=500;
        System.out.println("백원 "+money/100+"개");
        money%=100;
        System.out.println("오십원 "+money/50+"개");
        money%=50;
        System.out.println("십원 "+money/10+"개");
        money%=10;
        System.out.println("일원 "+money+"개");

        scan.close();
		
		
	}

}
