package chapter08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class WordSearchEx {
	Words words;
	Scanner s;
	int count =0;
	boolean go() {
		boolean success = false;
		count=0;
		Scanner s = new Scanner(System.in);
		System.out.println("�ܾ� >>");
		String search = s.nextLine();
		
//		for(String ss : words.wordVector) {
//			if(ss.length()>search.length()) {
//			String front = ss.substring(0, search.length());
//			if(search.equals(front)) {
//				System.out.println(ss);
//				success = true;
//				count++;
//				}
//			}
//		}
		
		for(String ss : words.wordVector) {
			try {
				String front = ss.substring(0,search.length());
				if(search.equals(front)){
					System.out.println(ss);
					success = true;
					count++;
			}
		}
			catch(StringIndexOutOfBoundsException e) {
				continue;
			}
		}
		
		
	return success;
	
	}
	void run() {
		
		System.out.println("�ܾ� ã�⸦ �����մϴ�..!");
		words = new Words("C:\\javaex\\words.txt");
		s=new Scanner(System.in);
		while(true) {
			
		if(go()) System.out.println("you success "+count+"�� �˻�!!"); //������ �����մϴ�. �õ�Ƚ�� ������ ���ڸ� �ϼ���Ų��.
		else System.out.println("you fail !");

		System.out.println("�˻��� �� �Ͻðڽ��ϱ�? (y/n)");
		if(s.next().equals("n")) {
			System.out.println("�˻��� �����մϴ�.");
			break;
		}	
	}
}
	
	
	public static void main(String[] args) {
		WordSearchEx ex = new WordSearchEx();	
		ex.run();

	}
}
