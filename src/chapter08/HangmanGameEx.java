package chapter08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.security.DrbgParameters.NextBytes;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
// HangManGame ���� ����(������,����1���� �����ϴ� �޼���)
public class HangmanGameEx {
	
	String randomWord; //����
	StringBuffer hiddenWord; //����� ���
	final int hideWordCnt =2; //������ �ܾ��� ����
	final int TrialMax = 3;
	Scanner s = new Scanner(System.in);
	//1. �ܾ �����´�.
	//2. ���� 2���� ����� ���(HiddenWord) :  2���� ���ڸ� ����� �ش� ���ڴ� _ ǥ�÷� �ٲ�
	//3. ���ڸ� �ϳ��� �����ش�.(HiddenWord �� ��ġ�ϴ��� �´ٰ� ���ְ�_ ��� �ش� ���ڷ� ��ü�ϴ� ���)
	//4. 2������ ���� �� �ֵ��� �ϴ� ���
	//5. ���� ������ ���� �� �ִ� ���
	
	
	void hideLetter() {
		hiddenWord = new StringBuffer(randomWord);
		Random ran = new Random();
    	 ran.nextInt();
    	  for(int i=0; i< hideWordCnt; i++){
    		  int index = ran.nextInt(hiddenWord.length());//�ܾ������ ����
    		  
    		  char c = randomWord.charAt(index);// ������°�� ���ڸ� c�� 
    		 
    		  for(int j=0; j<randomWord.length(); j++){
    			  if(hiddenWord.charAt(j)==c) // j��° ���ڰ� c�� ������
    				  hiddenWord.setCharAt(j, '_'); //j�� _�� ��ȯ
    		  }
    	  }
    }
	
	// ���� ������ �ϴ� �޼ҵ�
	boolean go() {
		boolean success = false;
		int count=0;
		while (true) {
		count++;
		if(count > TrialMax) break;	
		System.out.println(hiddenWord);
		System.out.println(">>");
		String text = s.next();
		char key = text.charAt(0);
		for (int i=0; i<randomWord.length(); i++)
			if(randomWord.charAt(i)==key && hiddenWord.charAt(i)=='_')
				hiddenWord.setCharAt(i, key);
		String msg = new String(hiddenWord);
			if(randomWord.equals(msg)) {success =true; break;}
		}
		return success;
	}
	



void run() {
	System.out.println("��� ������ �����մϴ�..!");
	//������ Words �����ڿ� �־� Vector�� ��ȯ.
	Words words = new Words("C:\\javaex\\words.txt");
	
	//������ �����մϴ�.
	while(true) {
		
		randomWord = words.getRandomWord(); //������ �ܾ ���Ϳ��� �����´�.
		System.out.println(randomWord);
		hideLetter(); //���� 2���� ���ܼ� hiddenWord�� �����.
		if(go()) System.out.println("success"); //������ �����մϴ�. �õ�Ƚ�� ������ ���ڸ� �ϼ���Ų��.
		else System.out.println("fail");
			System.out.println(randomWord);
		
		System.out.println("������ �� �Ͻðڽ��ϱ�? (y/n)");
		if(s.next().equals("n")) {
			System.out.println("������ �����մϴ�.");
			break;
		}
			
	}
}		
	public static void main(String[] args) {
		HangmanGameEx game = new HangmanGameEx();
		game.run();
		
	}
// word Ŭ���� ����(������,����1���� �����ϴ� �޼���)


}

