package chapter10;


import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

//import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{
		public MyFrame() {
	setTitle("300X300 스윙 프레임 만들기");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//컨텐트 팬의 정보를 갖고 와서 변경
			Container contentPane = getContentPane();
			contentPane.setBackground(Color.gray);
			//버튼 추가 (등록, 조회, 삭제 버튼 추가)
			JButton button1 = new JButton("등록");
			JButton button2 = new JButton("조회");
			JButton button3 = new JButton("삭제");
	
			contentPane.setLayout(new FlowLayout());
			contentPane.add(button1);
			contentPane.add(button2);
			contentPane.add(button3);

			setSize(300,300);
			setVisible(true);
		}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		
	}

}
