package chapter05;

interface PhoneInterface{
	final int TIMEOUT = 10000;
	abstract void sendCall();
	abstract void receiveCall();
	default void printLogo() {            
		// 생략하게된다면 abstract가 되기때문에 오류가 뜬다. 그러므로 일반 메서드 처럼 default를 붙여준다 
		System.out.println("**phone**");
	}
}

public class SamsungPhone implements PhoneInterface{ // 모든 메서드 구현 할때까지 빨간줄
	
	
	@Override
	public void sendCall() {
		System.out.println("띠리리링~");
	}
	
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	
	
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.sendCall();
		phone.receiveCall();
		phone.printLogo();
		System.out.println(phone.TIMEOUT);		
	}
}
