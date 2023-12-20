package chapter03;

public class Studio_1 {

	public static void main(String[] args) {
		
		
	for(int num = 1; num<100; num++) {
		int x = num/10;
		int y = num%10;
	
		if((x == 3 || x == 6 || x == 9)&&(y ==3 || y ==6 || y == 9))
				System.out.println(num + "¹Ú¼öÂ¦Â¦");
		else if((x == 3 || x == 6 || x == 9) || (y == 3 || y ==6 || y == 9))
				System.out.println(num + "¹Ú¼öÂ¦"); 				
		
		}
	
	}
	
}
