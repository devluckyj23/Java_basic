package HomeStudio;


public class PositivePoint extends Point{
	// �ʱⰪ�� �θ�Ŭ�������� �����´� 0,0
	public PositivePoint() {super(0,0);}
	//���밪�� �ʿ��ϹǷ� ������ ���� ����� ���ü��ְ� if������ �������ش�.
	public PositivePoint(int x, int y) {
		super(0, 0);
		if( x>0 && y >0);
	}
	
	//�������̵� ���Ѽ� �θ� Ŭ�������� move() ������ �������� �� ���� �����´�. super
	@Override
	public void move(int x, int y) {
		if( x>0 && y >0) super.move(x, y);
	}
	// �������̵� ���Ѽ� �θ� Ŭ�������� toString() ������ �������� �� ���� �����´�. super
	@Override
	public String toString () {
		return "("+ super.getX()+","+ super.getY()+")�� ��";
	}
	
	
	public static void main(String[] args) {
		
		PositivePoint p = new PositivePoint();
		p.move(10,10);
		System.out.println(p.toString() + "�Դϴ�.");
		
		p.move(-5, 5); //��ü p�� ���� �������� �̵����� ����
		System.out.println(p.toString() + "�Դϴ�.");
		
		PositivePoint p2 = new PositivePoint(-10,-10);
		System.out.println(p2.toString() + "�Դϴ�.");

	}

}
