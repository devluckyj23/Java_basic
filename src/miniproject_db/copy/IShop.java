package miniproject_db.copy;

public interface IShop {
	
	//���θ� �԰��� ������ �������̽�, ��� ���θ��� IShop�������̽��� �����ؾ��Ѵ�.
	//setTitle 		:���θ� ����ޱ�
	public abstract void setTitle(String title);
	//genUser 		:����� ������ ����ϱ�
	public abstract void genUser();
	//genProduct 	:��ǰ������ ����ϱ�
	public abstract void genProduct();
	//start 		:���θ��� ��ü����� ���� �ó����� �ֱ�
	public abstract void start();
	
}
