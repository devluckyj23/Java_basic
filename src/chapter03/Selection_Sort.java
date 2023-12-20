package chapter03;

// iu를 활용한 선택정렬 알고리즘
public class Selection_Sort {

	public static void main(String[] args) {
		
		// int iu_height[7]
		int [] iu_height = {180, 165, 175, 170, 160, 171, 150, 162};
		
		
		
		System.out.print("정렬 전 : ");
		// foreach문 사용
		for(int iu :iu_height )
			System.out.print(iu + " ");
		System.out.println();
		
		
		// 3. 단계별로 반복하기
		for(int i =0; i<7; i++) {
		
			//1. 최소값 알고리즘
			int min = iu_height[i];
			int min_index = i;
			
			for(int j =i+1; j<8; j++)
				if(min > iu_height[j]) {
					min = iu_height[j];
					min_index =j;
				}
			
			//2. 교환 알고리즘 
			
			int temp = iu_height[min_index];
			iu_height[min_index] = iu_height[i];
			iu_height[i] =temp;
		}
		
		System.out.print("정렬 후 : ");
		for(int iu :iu_height )
			System.out.print(iu + " ");
		System.out.println();
		
		//탐색(검색) 알고리즘
		// 순차탐색 
		
		
		
	}

}
