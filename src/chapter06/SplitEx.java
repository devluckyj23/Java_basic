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
			if(msg.equals("�׸�")) {
				System.out.println("�����մϴ�...");
				break;
			}
			st = new StringTokenizer(msg," ");
			while(st.hasMoreTokens()) {
				st.nextToken();
				count++;
			}
			System.out.println("���� ����: " + count);
		}
	}
	
//	String s [] = msg.split(" ");
//	System.out.println("���� ����: " + s.length);
}
