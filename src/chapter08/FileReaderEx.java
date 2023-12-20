package chapter08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

//public class FileReaderEx {
//
//	public static void main(String[] args) throws IOException { //IOException 예외 처리 중 가장 상위급. (input/output을 포함하는 모든 예외 처리)
//		FileReader fin = new FileReader("C:\\javaex\\ex.txt");
//		
//		int c;
//			while((c=fin.read())!=-1) {
//				System.out.print((char)c);
//		}
//		fin.close();
//	}
//}


//2.try-catch
public class FileReaderEx {

	public static void main(String[] args) { 
		FileReader fin;
		try {
			 fin = new FileReader("C:\\javaex\\ex.txt", Charset.forName("UTF-8"));
			
		int c;
			while((c=fin.read())!=-1) {
				System.out.print((char)c);
			 }
			fin.close();
			}
		
		catch(IOException e) {
			e.printStackTrace(); 
		
		} 
	}
}
