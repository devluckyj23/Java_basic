package chapter04;

public class Student2 {
	//�Ӽ�:�ʵ� 
	private String name;
	private int age;
	private int id;
	
	// getters & setters �� �����ϸ� �Ӽ��� private (����������)�� �ٿ��ִ°� ����! 
	
	
	//����:�޼���
	
	//������ �޼��� : �ʱ�ȭ�� ���������Ѵ�.
	public Student2() {}
	public Student2(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	//�Ϲ� �޼���
	// �پ缺 : �����ε�(overloading) -�Ķ���͸� �ٸ��� �޼��带 ����Ҽ��ִ�.
	void study () { System.out.println("�����մϴ�.");}
	void study(String test) {System.out.println(test + "���θ� �մϴ�.");}
	void eat () { System.out.println("�Ծ��");}
	void eat (String meat) { System.out.println(meat + "��⸦ �Խ��ϴ�");}
	void sleep () { System.out.println("��ϴ�");}
	boolean test(String test, int score) {
		System.out.println(test +"������ �ñ���!");
		if (score >=60) return true;
		else 			return false;
	}
	
	
	//getters & setters (������ ������) : �Ӽ��� �ƴ� �޼���� ���� / �Ӽ��� �ܺο��� �������� ���ϰ� �Ѵ�
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	//main�޼���
	public static void main(String[] args) {
		Student2 student = new Student2(); // Stdent2�� student�� �����ϰ�, (new)���� ���� ������ ������ Ȯ��
		student.study();
		if(student.test("����ó��������",80))
			System.out.println("�հ��ϼ̽��ϴ�.:D");
		else
			System.out.println("���հ��ϼ̽��ϴ�.��");
	}
}
