package chapter08;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {

	public static void main(String[] args) {
		
		FileWriter fout = null;
		Scanner s = new Scanner(System.in);
		try {
			fout = new FileWriter("C:\\javaex\\test.txt", true); // true - append 이어쓰기 가능 
			
			while(true) {
				String line = s.nextLine();
				
				if(line.length()==0) 
					break;
				
				fout.append(line, 0, line.length());
				fout.append("\r\n", 0, 2);
			}
			fout.close();
		}
		catch(IOException e){
			System.out.println("파일 입출력 오류");
		}
		s.close();
	}

}