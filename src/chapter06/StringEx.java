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
		
		String s[] = c.split(","); // "," �� �������� ����Ʈ������ 
		for(String n : s)
			System.out.println(n);
	
		String sub = c.substring(4); 
		System.out.println(sub);	// substring 4��° ���ں��� ��ȯ
		
		System.out.println(c.charAt(3)); // �ش� ��ġ�� ���� 1�� ��ȯ
	
	}
	
}
