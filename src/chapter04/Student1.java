package chapter04;

public class Student1 {
	private String dp;
	private int dp_num;
	
	
	
	public Student1() {
		
	}
	public Student1(String dp, int dp_num) {
		super();
		this.dp = dp;
		this.dp_num = dp_num;
	}
	public String getDp() {
		return dp;
	}
	public void setDp(String dp) {
		this.dp = dp;
	}
	public int getDp_num() {
		return dp_num;
	}
	public void setDp_num(int dp_num) {
		this.dp_num = dp_num;
	}
	@Override
	public String toString() {
		return "Student1 [dp=" + dp + ", dp_num=" + dp_num + "]";
	}
	
}
