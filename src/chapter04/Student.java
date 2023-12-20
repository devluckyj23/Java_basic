package chapter04;

class Student {

		String dp;
		int dp_num;
		
		public static void main(String[] args) {
			Student student = new Student();
			student.dp = "스마트소프트웨어학과";
			student.dp_num = 20230118;
			System.out.println(student.dp + ":" + student.dp_num);
		}
		
}