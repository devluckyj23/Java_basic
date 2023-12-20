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
		System.out.println("단어 >>");
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
		
		System.out.println("단어 찾기를 시작합니다..!");
		words = new Words("C:\\javaex\\words.txt");
		s=new Scanner(System.in);
		while(true) {
			
		if(go()) System.out.println("you success "+count+"개 검색!!"); //게임을 진행합니다. 시도횟수 내에서 글자를 완성시킨다.
		else System.out.println("you fail !");

		System.out.println("검색을 더 하시겠습니까? (y/n)");
		if(s.next().equals("n")) {
			System.out.println("검색을 종료합니다.");
			break;
		}	
	}
}
	
	
	public static void main(String[] args) {
		WordSearchEx ex = new WordSearchEx();	
		ex.run();

	}
}
