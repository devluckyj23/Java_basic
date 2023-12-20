package chapter04;

public class ArrayParameterEx {

	static void printCharArray(char a[]) {
//		for(int i=0; i <a.length; i++)
//			System.out.println(a[i]);
		
		for(char aa: a)
			System.out.print(aa);
			System.out.println();
	}
	
	static void replaceSpace(char a[]) {
		for( int i =0; i<a.length; i++)
			if( a[i] == ' ')
				a[i] = '¢½';
	}
	
	public static void main(String[] args) {
		char c[] = {'I',' ','L','o','v','e',' ','y','o','u'};

		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}

}
