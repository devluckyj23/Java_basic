package chapter04;

public class Student2 {
	//속성:필드 
	private String name;
	private int age;
	private int id;
	
	// getters & setters 를 실행하면 속성에 private (접근제어자)를 붙여주는게 국룰! 
	
	
	//행위:메서드
	
	//생성자 메서드 : 초기화를 목적으로한다.
	public Student2() {}
	public Student2(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	//일반 메서드
	// 다양성 : 오버로드(overloading) -파라미터만 다르게 메서드를 사용할수있다.
	void study () { System.out.println("공부합니다.");}
	void study(String test) {System.out.println(test + "공부를 합니다.");}
	void eat () { System.out.println("먹어요");}
	void eat (String meat) { System.out.println(meat + "고기를 먹습니다");}
	void sleep () { System.out.println("잡니다");}
	boolean test(String test, int score) {
		System.out.println(test +"시험을 봤군요!");
		if (score >=60) return true;
		else 			return false;
	}
	
	
	//getters & setters (접근자 설정자) : 속성이 아닌 메서드로 접근 / 속성에 외부에서 접근하지 못하게 한다
	
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

	//main메서드
	public static void main(String[] args) {
		Student2 student = new Student2(); // Stdent2를 student로 정의하고, (new)값을 저장 가능한 공간을 확보
		student.study();
		if(student.test("정보처리산업기사",80))
			System.out.println("합격하셨습니다.:D");
		else
			System.out.println("불합격하셨습니다.ㅠ");
	}
}
