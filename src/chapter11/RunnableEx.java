package chapter11;

public class RunnableEx implements Runnable{
	
	@Override
	public void run() {
		System.out.println("RUN���� ����� ���!");
	}
	
	public static void main(String[] args) {

		//ThreadEx ex = new ThreadEx();
		//ex.start();
		
		RunnableEx ex = new RunnableEx();
		Thread t = new Thread(ex);
		t.start();
		System.out.println("main���� ����� ���!");
	}
}