package chapter03;

import java.util.Scanner;

// iu를 활용한 선택정렬 알고리즘
public class Search {

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
		
		
//=========================================================================//
		
								//탐색(검색) 알고리즘
		Scanner scan = new Scanner(System.in);
		System.out.print("검색키값 : ");
		int key = scan.nextInt();
		int key_index = -1; // 검색된 값의 인덱스 값, -1은 실패로 가정
		
		
		
// 순차탐색(Sequential Search)
		System.out.print("순차탐색======================================================== ");
		for(int i=0;  i<8; i++)
			if(iu_height[i] == key)
				key_index = i;
		
		if( key_index == -1) System.out.println("검색실패!");
		else 				 System.out.println("검색성공!" + key_index + "번 방에 있습니다." );	
		
// 이진탐색(Binary Search)
		System.out.print("이진탐색======================================================== ");
		
		int low = 0, high = 7; // low와 high 초기화
		int middle = 0;  	   // 중간방의 인덱스
		
		System.out.print("검색키값 : ");
		key = scan.nextInt();
		key_index = -1; // 검색된 값의 인덱스 값, -1은 실패로 가정
		
		while(low<=high) {
		middle = (low+high) / 2;
			
			System.out.println("[low] " + low + "[high]" + high
					+ "[middle]" + middle + "[value]" + iu_height[middle]);
		if( key == iu_height[middle]) {
			key_index = middle;
			break;
		}
		else if ( key > iu_height[middle])
			low = middle +1;
		
		else if ( key < iu_height[middle])
			high = middle -1;
		
		}
		
		if( key_index == -1) System.out.println("검색실패!");
		else 				 System.out.println("검색성공!" + key_index + "번 방에 있습니다." );	
		
		System.out.println("원소의 개수:" + iu_height.length);
		//iu_height.length - iu_height 배열의 개수 
		for(int i =0; i< iu_height.length; i++) 
			System.out.println(iu_height[i] + " ");
		
	}

}
