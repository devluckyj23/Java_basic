package chapter03;

public class Mission5 {

	public static void main(String[] args) {
		
	//1~100까지의 수 중에서 3의 배수
     // for(int num=1; num<=100; num++) {
//		if(num %3==0)
		
//	1~100까지의 숫자중의 13의 배수만 합산하라
		int sum = 0;
		for(int num=1; num<=100; num++) 
			if(num%13==0)sum += num;
		
		
// 2. 1~100까지의 숫자중의 13이 되기 전까지만 합산하라.
		
		sum = 0;
		for ( int num=1; num <=100; num++) {
			if(num%13==0) break;
			sum += num;
		}
	 System.out.println("sum = " + sum);
	 
	 
	 
	 // 3. 1~100까지의 숫자중의 13의 배수를 제외한 숫자만 합산하라.
	 
	 sum = 0;
	 for ( int num=1; num <=100; num++) {
		 if(num%13==0) continue;
		 sum += num;
	 }
	 System.out.println("sum = " + sum);
	
	}
}


