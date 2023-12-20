package chapter06;

public class WrapperEx {

	public static void main(String[] args) {
		
		//Integer i = new Integer(10); // ¹Ú½Ì
		Integer i =10;				   // ¿ÀÅä¹Ú½Ì
		Integer i1 = new Integer("10");
		System.out.println(i);
		System.out.println(i1);

		char c1 = '4';
		char c2 = 'A';
		if(Character.isDigit(c1)) System.out.println("c1Àº ¼ıÀÚ");
		if(Character.isAlphabetic(c2)) System.out.println("c2Àº ¾ËÆÄºª");
		
		
		
	}

}
