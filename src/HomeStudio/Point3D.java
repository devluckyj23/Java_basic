package HomeStudio;

public class Point3D extends Point{
		//z변수 선언 (자식클래스 (자기자신)이 사용할 것이기에 변수선언 ok
		public int z;
		
//		public Point3D() {}
		public Point3D(int x, int y, int z) {
			super(x, y);
			this.z = z;
		}
		// 값을 이동시키는 메서드를 연산자++을 사용해서 생성
		public void moveUp() {
			this.z = z;
			z++;
		}
		public void moveDown() {
			this.z=z;
			z--;
		}
		
		//Point() - 부모 클래스의 move ()에 값을 보내고(super), z값은 자식클래스 즉, 자신이 사용 this
		public void move(int x, int y, int z) {
			super.move(x, y);
			this.z =z;
			
		}
	
		public String toString () {
			return "("+ getX()+","+ getY()+","+ z + ")의 점";
		}
		
	public static void main(String[] args) {
	Point3D p = new Point3D(1,2,3); // 1,2,3 은 각각 
	System.out.println(p.toString() + "입니다.");

	p.moveUp(); // z축으로 위쪽 이동
	System.out.println(p.toString() + "입니다.");
	p.moveDown(); // z축으로 아래쪽 이동
	
	p.move(10, 10);; //x,y축으로 이동
	System.out.println(p.toString() + "입니다.");
	
	p.move(100, 200, 300); //x,y,z 축으로 이동
	System.out.println(p.toString()+ "입니다");
	
	}
	
}
