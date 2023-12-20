package chapter03;

import java.util.Scanner;

public class Mission10 {

	public static void main(String[] args) {
		int count=0; //입력한 정수의 개수
		int sum=0; //정수의 합
		double average = 0.0;
		Scanner scan = new Scanner(System.in);		
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		int n =0;
		do{ 
		 
			sum += n;
			count++;
			n = scan.nextInt(); 
		}
		 while(n != -1);
		count = count -1;
		if(count > 0) {
		
			System.out.println("정수의 개수 : " + count + "개 ");
			average = (double)sum/count;
			System.out.printf("평균은: %.2f" , average );
		}
		else {
			System.out.println("입력된 수가 없습니다.");
		}
		scan.close();

	}

}
