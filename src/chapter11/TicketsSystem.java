package chapter11;

public class TicketsSystem extends Thread{
	public int total;
	private SellManager sm;
	
	
	@Override
	public void run() {
		String currentName = Thread.currentThread().getName();
		System.out.println(currentName + "- ����");
		for( int i= 0; i <3; i++) {
			System.out.println(currentName + "�Ǹ�:"+sm.sell());
		}
		System.out.println(currentName + "- ����");
	}
	
	
	
	//������
	public TicketsSystem() {
		sm = new SellManager();
		total = 100;
	}
	public static void main(String[] args) {
		System.out.println("#####Ƽ�� ���� ���α׷�#####");
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
		System.out.println("main �޼ҵ� ����!!");
	}
	
	class SellManager{
		//Ƽ���� ��ü ������ �����ϴ� �޼ҵ�
		synchronized int sell() {
			total--;
			//0.3�ʰ� ����.
			try {
				Thread.sleep(300);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			return total;
		}
	}
	
}
