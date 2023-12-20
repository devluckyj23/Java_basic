package chapter06;

import java.util.Scanner;
import java.util.StringTokenizer;
public class SplitEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringTokenizer st;
		
		while(true) {
			int count=0;
			System.out.println(">>>");
			String msg = scan.nextLine();
			if(msg.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			st = new StringTokenizer(msg," ");
			while(st.hasMoreTokens()) {
				st.nextToken();
				count++;
			}
			System.out.println("어절 개수: " + count);
		}
	}
	
//	String s [] = msg.split(" ");
//	System.out.println("어절 개수: " + s.length);
}
