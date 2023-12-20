package chapter11;

public class ThreadEx_multi extends Thread{
	
	
	public void run() {
		String currentThread = Thread.currentThread().getName();
		System.out.println(currentThread + "---시작");
		for(int i=0; i<=10; i++) {
			System.out.println(currentThread + "-"+ i);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	System.out.println(currentThread + "---종료");
	}
	public static void main(String[] args) {
		ThreadEx_multi ex = new ThreadEx_multi();
		
		for(int i=0; i<=2; i++) {
			Thread t = new Thread(ex);
			t.start();
	        
		}
		System.out.println("메인종료");  
	}
}