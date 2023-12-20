package chapter03;

public class Mission8 {

	public static void main(String[] args) {
		
		int count = 0;
		for (int x=1; x<=31; x++) {
			 count++;
			 System.out.printf("%5d",x); //결과값 정렬하기 위해서는 printf를 사용해서 출력해야한다.
			 if(count%7 ==0)
				 System.out.println();	 
		}
		
	}
}

