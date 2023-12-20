package chapter05;


class Person{
	
	String name;
	int id;
	public Person(String name) { this.name =name;}
	
}
class Student extends Person{
	String grade ="상급";
	String depart;
	public Student(String name) {super(name);}
}
	
public class UpcastingEx {

	public static void main(String[] args) {
		//Upcasting
		Person p = new Student("정웅기");
		System.out.println(p.name);
//		System.out.println(s.grade);  실행안된다
		Student s = new Student("김준성");
		System.out.println(s.grade);
		
		
		//Downcasting
		Student s2 = (Student) p;
		System.out.println(s2.name);
		s2.depart ="하이테크";
		System.out.println(s2.depart); //네 실행됩니다.
		
		if(p instanceof Person) System.out.println("Person");
		else					System.out.println("Person 아니야");

	}
}	