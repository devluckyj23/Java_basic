package chapter05;

abstract class Shape1 {
	
	abstract void draw();
	 void paint() {System.out.println("paint메서드 호출");}
	 void print() {System.out.println("print메서드 호출");}
}

class RealShape extends Shape1 {
	@Override
	void draw() {System.out.println("draw메서드 호출");}
}

public class Shape1_AbstractEx{
	public static void main(String args[]) {
	
	Shape1 sp = new RealShape();
	sp.paint();
	sp.draw();
	}
	
}