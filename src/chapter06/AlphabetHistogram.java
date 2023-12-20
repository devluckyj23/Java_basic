package chapter06;

import java.util.Scanner;

public class AlphabetHistogram {
	
	//readString�� ���� ������ �� �ؽ�Ʈ�� ���ĺ� ���� ī�����ϴ� �޼���
	int histData[] = new int[26]; // �� ���ĺ��� ������ ī��Ƽ�ϴ� ������ �迭
	AlphabetHistogram() {
		for(int i =0; i<histData.length; i++) histData[i]=0;
	}
	//������ ���ִ� �޼��� : readString > checkAlphabet > drawHistogram
	void run() { 
		checkAlphabet(readString());
		drawHistogram();
	}
	
	void checkAlphabet(String msg) { // ���ĺ��� ������ 26�� ũ�⸦ ���� ���ĺ� �迭 ����
			msg = msg.toUpperCase();// �Ű������� ���� �ؽ�Ʈ ���ڿ��� ��� �빮�ڷ� �ٲ۴�.
			int index;
			for (int i = 0; i < msg.length(); i++) { // ó������ �ؽ�Ʈ�� ������ �ݺ�
				char c = msg.charAt(i);	// 'A'�� �ƽ�Ű�ڵ� �� 65, 'Z'�� �ƽ�Ű�ڵ� �� 90
				if (c >= 'A' && c <= 'Z') {	// �빮�� ���ĺ��� �б� ���� c�� 'A'���� ũ�ų� ���� 'Z'���� �۰ų� ���� ��쿡��
					index = c -'A';// �迭�� ������Ų��.
					histData[index]++;
				}
			}
		}
	
	void drawHistogram() {
		System.out.println("������׷��� �׸��ϴ�.");
		for (int i = 0; i < histData.length; i++) {
			System.out.print((char) (i + 'A')+ ":");	// A~Z ���
			for (int j = 0; j < histData[i]; j++)	// �迭�� ������ ����ŭ "-" ���
				System.out.print("��");
			System.out.println();
//			System.out.println("���� �ؽ�Ʈ�� �Է��ϰ� �����ݷ��� �Է��ϼ���.");
//			String s = this.readString();
		}
	}

	String readString() {
		
		StringBuffer sb = new StringBuffer(); // Ű �Է��� ���� ��Ʈ������ ����
		Scanner scan = new Scanner(System.in);
		while (true) {
			String line = scan.nextLine(); // �ؽ�Ʈ �� ���� �б�
			if (line.length() == 1 && line.charAt(0) == ';') // ';'�� �ִ� �����̸�
				break; // �Է� ��
			sb.append(line); // ���� ���� ���ڿ��� ��Ʈ�����ۿ� �߰��Ѵ�.
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		AlphabetHistogram al = new AlphabetHistogram();
		al.run();
	}
}

