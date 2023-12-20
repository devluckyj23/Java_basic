package chapter03;

public class Mission13 {
// 2차원 배열
	public static void main(String[] args) {
		int H[][] = {
				{1,0,0,0,1},
				{1,0,0,0,1},
				{1,1,1,1,1},
				{1,0,0,0,1},
				{1,0,0,0,1},
				
		};
/*행의 역할*/		for( int i = 0; i<H.length; i++) { 						
/*열의 역할*/			for( int j = 0; j<5; j++) {						
					if( H[i][j]==1) System.out.print(" ■");
					else 			System.out.print("  ");
							
				}
					System.out.println();
			}
	}

}
