package chapter07;

public class Student1 {
	private int id;
	private String tel;
	
	

	public Student1(int id, String tel) {
		super();
		this.id = id;
		this.tel = tel;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public static void main(String[] args) {
		
	}

	@Override
	public String toString() {
		return "Student1 [아이디" + id + ", 전화" + tel + "]";
	}

}
