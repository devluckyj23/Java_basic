package chapter06;

import java.util.Scanner;

public class AlphabetHistogram {
	
	//readString을 통해 가지고 온 텍스트를 알파벳 별로 카운팅하는 메서드
	int histData[] = new int[26]; // 각 알파벳의 갯수를 카운티하는 정수형 배열
	AlphabetHistogram() {
		for(int i =0; i<histData.length; i++) histData[i]=0;
	}
	//동작을 해주는 메서드 : readString > checkAlphabet > drawHistogram
	void run() { 
		checkAlphabet(readString());
		drawHistogram();
	}
	
	void checkAlphabet(String msg) { // 알파벳의 개수인 26의 크기를 갖는 알파벳 배열 생성
			msg = msg.toUpperCase();// 매개변수로 받은 텍스트 문자열을 모두 대문자로 바꾼다.
			int index;
			for (int i = 0; i < msg.length(); i++) { // 처음부터 텍스트의 끝까지 반복
				char c = msg.charAt(i);	// 'A'의 아스키코드 값 65, 'Z'의 아스키코드 값 90
				if (c >= 'A' && c <= 'Z') {	// 대문자 알파벳만 읽기 위해 c가 'A'보다 크거나 같고 'Z'보다 작거나 같은 경우에만
					index = c -'A';// 배열에 누적시킨다.
					histData[index]++;
				}
			}
		}
	
	void drawHistogram() {
		System.out.println("히스토그램을 그립니다.");
		for (int i = 0; i < histData.length; i++) {
			System.out.print((char) (i + 'A')+ ":");	// A~Z 출력
			for (int j = 0; j < histData[i]; j++)	// 배열에 누적된 값만큼 "-" 출력
				System.out.print("●");
			System.out.println();
//			System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
//			String s = this.readString();
		}
	}

	String readString() {
		
		StringBuffer sb = new StringBuffer(); // 키 입력을 받을 스트링버퍼 생성
		Scanner scan = new Scanner(System.in);
		while (true) {
			String line = scan.nextLine(); // 텍스트 한 라인 읽기
			if (line.length() == 1 && line.charAt(0) == ';') // ';'만 있는 라인이면
				break; // 입력 끝
			sb.append(line); // 읽은 라인 문자열을 스트링버퍼에 추가한다.
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		AlphabetHistogram al = new AlphabetHistogram();
		al.run();
	}
}

