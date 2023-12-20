package chapter11;

public class TicketsSystem extends Thread{
	public int total;
	private SellManager sm;
	
	
	@Override
	public void run() {
		String currentName = Thread.currentThread().getName();
		System.out.println(currentName + "- 시작");
		for( int i= 0; i <3; i++) {
			System.out.println(currentName + "판매:"+sm.sell());
		}
		System.out.println(currentName + "- 종료");
	}
	
	
	
	//생성자
	public TicketsSystem() {
		sm = new SellManager();
		total = 100;
	}
	public static void main(String[] args) {
		System.out.println("#####티켓 예매 프로그램#####");
		TicketsSystem ts = new TicketsSystem();
		for(int i=0; i <10; i++) {
			Thread t = new Thread(ts);
			t.start();
			try {
				Thread.sleep(300);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main 메소드 종료!!");
	}
	
	class SellManager{
		//티켓의 전체 갱숙를 리턴하는 메소드
		synchronized int sell() {
			total--;
			//0.3초간 쉰다.
			try {
				Thread.sleep(300);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			return total;
		}
	}
	
}
