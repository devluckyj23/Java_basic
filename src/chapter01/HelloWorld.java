package chapter01;

public class HelloWorld {

	public static int sum( int n, int m) {
		return n+m;
	}
	// static - 프로그램 전체에서 따로 관리한다. 
	// static은 static을 붙인 명령어들만 사용가능하다.
	
	
	public static void main(String[] args) {
		// 한줄주석
		/* 영역주석 */
		// 주석 단축키 : ctrl +/
		// 실행 : ctrl +F11
		
		int a =10;
		int b =20;
		int s = sum(a, b);
		System.out.println("Hello World");
		System.out.println("a+b = " + s);
	}
	
}

/* public class Hello World 
 * -> 가장 대표적인 클래스에 public을 붙여준다*/

