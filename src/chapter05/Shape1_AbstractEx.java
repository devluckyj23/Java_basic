package chapter05;

abstract class Shape1 {
	
	abstract void draw();
	 void paint() {System.out.println("paint�޼��� ȣ��");}
	 void print() {System.out.println("print�޼��� ȣ��");}
}

class RealShape extends Shape1 {
	@Override
	void draw() {System.out.println("draw�޼��� ȣ��");}
}

public class Shape1_AbstractEx{
	public static void main(String args[]) {
	
	Shape1 sp = new RealShape();
	sp.paint();
	sp.draw();
	}
	
}