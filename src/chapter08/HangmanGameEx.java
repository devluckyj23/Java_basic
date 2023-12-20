package chapter08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.security.DrbgParameters.NextBytes;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
// HangManGame 게임 구성(생성자,글자1개를 추출하는 메서드)
public class HangmanGameEx {
	
	String randomWord; //랜덤
	StringBuffer hiddenWord; //숨기기 기능
	final int hideWordCnt =2; //숨겨진 단어의 개수
	final int TrialMax = 3;
	Scanner s = new Scanner(System.in);
	//1. 단어를 가져온다.
	//2. 글자 2개를 숨기는 기능(HiddenWord) :  2개의 글자를 숨기고 해당 글자는 _ 표시로 바꿈
	//3. 글자를 하나씩 맞춰준다.(HiddenWord 와 일치하는지 맞다고 해주고_ 대신 해당 문자로 교체하는 기능)
	//4. 2개까지 맞출 수 있도록 하는 기능
	//5. 직접 게임을 해줄 수 있는 기능
	
	
	void hideLetter() {
		hiddenWord = new StringBuffer(randomWord);
		Random ran = new Random();
    	 ran.nextInt();
    	  for(int i=0; i< hideWordCnt; i++){
    		  int index = ran.nextInt(hiddenWord.length());//단어길이의 난수
    		  
    		  char c = randomWord.charAt(index);// 난수번째의 글자를 c에 
    		 
    		  for(int j=0; j<randomWord.length(); j++){
    			  if(hiddenWord.charAt(j)==c) // j번째 글자가 c랑 같으면
    				  hiddenWord.setCharAt(j, '_'); //j를 _로 변환
    		  }
    	  }
    }
	
	// 실제 게임을 하는 메소드
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
	System.out.println("행맨 게임을 시작합니다..!");
	//파일을 Words 생성자에 넣어 Vector로 변환.
	Words words = new Words("C:\\javaex\\words.txt");
	
	//게임을 시작합니다.
	while(true) {
		
		randomWord = words.getRandomWord(); //랜덤한 단어를 벡터에서 꺼내온다.
		System.out.println(randomWord);
		hideLetter(); //글자 2개를 숨겨서 hiddenWord를 만든다.
		if(go()) System.out.println("success"); //게임을 진행합니다. 시도횟수 내에서 글자를 완성시킨다.
		else System.out.println("fail");
			System.out.println(randomWord);
		
		System.out.println("게임을 더 하시겠습니까? (y/n)");
		if(s.next().equals("n")) {
			System.out.println("게임을 종료합니다.");
			break;
		}
			
	}
}		
	public static void main(String[] args) {
		HangmanGameEx game = new HangmanGameEx();
		game.run();
		
	}
// word 클래스 구성(생성자,글자1개를 추출하는 메서드)


}

