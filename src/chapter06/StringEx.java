package chapter06;

public class StringEx {

	public static void main(String[] args) {
		String a = new String(" c#");
		String b = new String(",c++");
		
		System.out.println(a.length());
		System.out.println(a.contains("#"));
		System.out.println(a.concat(b));
		System.out.println(a);
		System.out.println(a.trim());
		
		String c = a.concat(b);
		System.out.println(c);
		System.out.println(c.replace("c#", "java"));
		
		String s[] = c.split(","); // "," 를 기준으로 리스트형으로 
		for(String n : s)
			System.out.println(n);
	
		String sub = c.substring(4); 
		System.out.println(sub);	// substring 4번째 문자부터 반환
		
		System.out.println(c.charAt(3)); // 해당 위치의 문자 1개 반환
	
	}
	
}
