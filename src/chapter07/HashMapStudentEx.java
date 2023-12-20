package chapter07;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudentEx {

	public static void main(String[] args) {
		HashMap<String, Student1> map = new HashMap<>();
		
		
		map.put("김준성", new Student1(1,"010-1111-1111"));
		map.put("정웅기", new Student1(2,"010-2222-2222"));
		map.put("이태형", new Student1(3,"010-3333-3333"));

		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("검색할 이름?");
				String name = s.nextLine();
				if(name.equals("exit")) 
					break;
				System.out.println(map.get(name));
				
		}
		
			
	}

}
