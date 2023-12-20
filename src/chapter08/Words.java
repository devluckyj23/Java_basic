package chapter08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;


class Words{
	
	static Vector<String> wordVector = new Vector<String>();
	public Words(String filename) {
		
		try {
			Scanner s = new Scanner(new FileReader(filename));
			while(s.hasNext()) {
				String Words = s.nextLine();
				wordVector.add(Words);
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
			System.exit(0); // ���α׷� ����
			}
		
		}
	
	public void printVector() {
		for(String s : wordVector)
			System.out.println(s);
	}
	public String getRandomWord() {
		final int WORDMAX = wordVector.size(); // �� �ܾ� ����
		int randomIndex = (int)(Math.random()* WORDMAX);
		return wordVector.get(randomIndex);
		}
}