package HomeStudio;

public class Point3D extends Point{
		//z���� ���� (�ڽ�Ŭ���� (�ڱ��ڽ�)�� ����� ���̱⿡ �������� ok
		public int z;
		
//		public Point3D() {}
		public Point3D(int x, int y, int z) {
			super(x, y);
			this.z = z;
		}
		// ���� �̵���Ű�� �޼��带 ������++�� ����ؼ� ����
		public void moveUp() {
			this.z = z;
			z++;
		}
		public void moveDown() {
			this.z=z;
			z--;
		}
		
		//Point() - �θ� Ŭ������ move ()�� ���� ������(super), z���� �ڽ�Ŭ���� ��, �ڽ��� ��� this
		public void move(int x, int y, int z) {
			super.move(x, y);
			this.z =z;
			
		}
	
		public String toString () {
			return "("+ getX()+","+ getY()+","+ z + ")�� ��";
		}
		
	public static void main(String[] args) {
	Point3D p = new Point3D(1,2,3); // 1,2,3 �� ���� 
	System.out.println(p.toString() + "�Դϴ�.");

	p.moveUp(); // z������ ���� �̵�
	System.out.println(p.toString() + "�Դϴ�.");
	p.moveDown(); // z������ �Ʒ��� �̵�
	
	p.move(10, 10);; //x,y������ �̵�
	System.out.println(p.toString() + "�Դϴ�.");
	
	p.move(100, 200, 300); //x,y,z ������ �̵�
	System.out.println(p.toString()+ "�Դϴ�");
	
	}
	
}
