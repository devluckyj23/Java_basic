package chapter03;

import java.util.Scanner;

public class Mission10 {

	public static void main(String[] args) {
		int count=0; //�Է��� ������ ����
		int sum=0; //������ ��
		double average = 0.0;
		Scanner scan = new Scanner(System.in);		
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		int n =0;
		do{ 
		 
			sum += n;
			count++;
			n = scan.nextInt(); 
		}
		 while(n != -1);
		count = count -1;
		if(count > 0) {
		
			System.out.println("������ ���� : " + count + "�� ");
			average = (double)sum/count;
			System.out.printf("�����: %.2f" , average );
		}
		else {
			System.out.println("�Էµ� ���� �����ϴ�.");
		}
		scan.close();

	}

}
