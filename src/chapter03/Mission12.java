package chapter03;

public class Mission12 {

	public static void main(String[] args) {
		int lotto_num[] = new int [7];
		
		// �迭�� �� �Է�
		for(int i=0; i<7; i++) {
			lotto_num[i] = 1 + (int)(Math.random() * 45);		
			
			String names [] = {"������","����ȣ","������"};
			
			for(int j=0; j<i; j++)
			if(lotto_num[i] == lotto_num[j]) i--; 
		
			System.out.println("");
		for(String name : names)
			System.out.println(name + "");
		
		}
		// �迭�� �� ���
//		for(int i=0; i<7; i++) 
//			
//			System.out.printf("%5d", lotto_num[i]);
		
		
		// foreach���� �̿��� �� ���
		for(int num : lotto_num)
			System.out.printf("%5d",num);
		
	}

}
