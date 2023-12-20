package chapter04;

public class Cylinder {

 public Circle c;
 public double height;
 public Cylinder () {}
 public Cylinder( Circle c, double height ) {
	 this.c = c;
	 this.height = height;
 }
 
 public double getVolume() { return c.getArea()* height ; }

 public static void main(String[] args) {
	 
	 Cylinder cd = new Cylinder();
	 cd.c = new Circle("¿øÅë",2.8);
	 cd.height = 5.6;
	 
	 System.out.println(cd.getVolume());
	 
	 
 }
}
