package chapter03;

public class Mission12 {

	public static void main(String[] args) {
		int lotto_num[] = new int [7];
		
		// 배열에 값 입력
		for(int i=0; i<7; i++) {
			lotto_num[i] = 1 + (int)(Math.random() * 45);		
			
			String names [] = {"이유진","정성호","정웅기"};
			
			for(int j=0; j<i; j++)
			if(lotto_num[i] == lotto_num[j]) i--; 
		
			System.out.println("");
		for(String name : names)
			System.out.println(name + "");
		
		}
		// 배열에 값 출력
//		for(int i=0; i<7; i++) 
//			
//			System.out.printf("%5d", lotto_num[i]);
		
		
		// foreach문을 이용한 값 출력
		for(int num : lotto_num)
			System.out.printf("%5d",num);
		
	}

}
