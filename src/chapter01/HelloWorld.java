package chapter01;

public class HelloWorld {

	public static int sum( int n, int m) {
		return n+m;
	}
	// static - ���α׷� ��ü���� ���� �����Ѵ�. 
	// static�� static�� ���� ��ɾ�鸸 ��밡���ϴ�.
	
	
	public static void main(String[] args) {
		// �����ּ�
		/* �����ּ� */
		// �ּ� ����Ű : ctrl +/
		// ���� : ctrl +F11
		
		int a =10;
		int b =20;
		int s = sum(a, b);
		System.out.println("Hello World");
		System.out.println("a+b = " + s);
	}
	
}

/* public class Hello World 
 * -> ���� ��ǥ���� Ŭ������ public�� �ٿ��ش�*/

