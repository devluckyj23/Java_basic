package chapter11;


import java.awt.*;
import javax.swing.*;

class FlickeringLabel extends JLabel implements Runnable{
	private long delay; 
	
	public FlickeringLabel(String text, long delay) {
		super(text);
		this.delay = delay;
		setOpaque(true);
		
		Thread t = new Thread(this);
		t.start();
		
	}
	
	@Override
	public void run() {
		
		int n = 0; // �����ʱⰪ
		while(true) { //���ѷ���
			if(n==0)
				setBackground(Color.yellow);
			else if(n==1)
				setBackground(Color.green);
			if(n==0) n=1;
			else if(n==1) n=0;
			
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		}		
		
	}

public class FlickeringLabelEx extends JFrame{
	public FlickeringLabelEx() {
		setTitle("���ڰŸ��� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c =getContentPane();
		c.setLayout(new FlowLayout());
	
		//label - 3���� ����
		FlickeringLabel label1 = new FlickeringLabel("0.5�� ����",500);
		JLabel label2 = new JLabel("�ȱ���");
		FlickeringLabel label3 = new FlickeringLabel("0.3�� ����",300);
		
		//label�� �����̳ʿ� ����
		c.add(label1); c.add(label2); c.add(label3);		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		FlickeringLabelEx ex = new FlickeringLabelEx();
	}

}
