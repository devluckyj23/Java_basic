package chapter10;




import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
public class FruitSelect extends JFrame{

	int index = 0;
	String fruits[] = {"���","��","����","����","�޷�"};
	JButton b1 = new JButton("<<");
	JButton b2 = new JButton(">>");
	JButton b3 = new JButton(fruits[0]);
	
	
	public FruitSelect() {
		setTitle("���ϰ��� GUI ���α׷�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		
		b3.setBackground(Color.LIGHT_GRAY);
		
		b1.addMouseListener(new Select());
		b2.addMouseListener(new Select());
		
		add(b1, BorderLayout.WEST);
		add(b2, BorderLayout.EAST);
		add(b3, BorderLayout.CENTER);
		
		setSize(300,300);
		setVisible(true);
	}
	class Select extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			JButton btn = (JButton) e.getSource();//�̺�Ʈ�ҽ�
			if(btn == b1) {
				index--;
				if(index <= 0) 
					index=0;
			}
			
			else if(btn == b2) {
				index++;
				if(index >= fruits.length) 
					index= fruits.length -1;
			}
			b3.setText(fruits[index]);
		}
	}
	
	public static void main(String[] args) {
		FruitSelect fruit = new FruitSelect();
	}

}
