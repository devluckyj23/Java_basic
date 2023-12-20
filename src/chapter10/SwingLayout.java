package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SwingLayout extends JFrame{

	JButton button1 = new JButton("버튼1");
	JButton button2 = new JButton("버튼2");
	JButton button3 = new JButton("버튼3");
	JButton button4 = new JButton("버튼4");
	JButton button5 = new JButton("버튼5");
	
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	
	
	public SwingLayout() {
		setTitle("스윙 레이아웃 연습하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = getContentPane();
		container.setBackground(Color.gray);
		//container에 panel 들을 부착시키자!
		container.add(p1);
		container.add(p2);
		
//		flowLayout();
//		gridLayout();
//		borderLayout();
		cardLayout();
		setSize(300,200);
		setVisible(true);
		
	}
	//flowLayout설정하기
	public void flowLayout() {
		p1.setLayout(new FlowLayout());
		p1.add(button1);
		p1.add(button2);
		p1.add(button3);
		p1.add(button4);
		p1.add(button5);
	}
	
	
	public void gridLayout() {
		p1.setLayout(new GridLayout(2,2));
		p1.add(button1);
		p1.add(button2);
		p1.add(button3);
		p1.add(button4);
	}
	public void borderLayout() {
		
		p1.setLayout(new BorderLayout());
		p1.add(button1, BorderLayout.NORTH);
		p1.add(button2, BorderLayout.WEST);
		p1.add(button3, BorderLayout.CENTER);
		p1.add(button4, BorderLayout.EAST);
		p1.add(button5, BorderLayout.SOUTH);
		
	}
	//이벤트 핸들러도 달아보자!
	public void cardLayout() {
		final CardLayout card = new CardLayout();
		setLayout(card);
		
		p1.add(button1);
		p1.add(button2);
		p1.add(button3);
		p2.add(button4);
		p3.add(button5);
		
		//JFrame에 add 시키기
		add("p1", p1);
		add("p2", p2);
		//이벤트 핸들러 달기(이벤트종료, 핸들러다는 방법)
		
		
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {	
				card.next(getContentPane());	
			}
		});
		
		button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {	
				card.next(getContentPane());	
			}
		});
		button5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {	
				card.show(getContentPane(), "p1");	
			}
		});
		
		//익명클래스의 이벤트 핸들로 달아주는 방법
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	
				JButton btn = (JButton) e.getSource();//이벤트 소스를 가져옴
				
				if(btn.getText().equals("버튼1"))
					btn.setText("action");
				
				else if(btn.getText().equals("action"))
						btn.setText("버튼1");
			}
		});
		//button2에 액션 --> 내부클래스로 작성하기
		button2.addMouseListener(new MyMouseAdapter());//button2에 액션 --> 내부클래스로 작성하기()
		
	} 
	
	public static void main(String[] args) {
		SwingLayout layout = new SwingLayout();

	}

	//button2에 마우스를 누르면 좌표를 가져오도록
	class MyMouseAdapter extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			JButton btn = (JButton) e.getSource();
			int x = e.getX();
			int y = e.getY();
			if(btn.getText().equals("버튼2"))
				btn.setText("좌표 : " + x +","+y);
			else 
				btn.setText("버튼2");
		}
	}
	
	
	
	//MyActionListener 클래스 구현
//	class MyActionListener implements ActionListener{
//	
//		@Override
//		public void actionPerformed(ActionEvent e) {	
//			JButton btn = (JButton) e.getSource();//이벤트 소스를 가져옴
//			
//			if(btn.getText().equals("버튼2"))
//				btn.setText("버튼이 눌러졌습니다.");
//			
//			else if(btn.getText().equals("action"))
//					btn.setText("버튼2");
//		}
//	}
}