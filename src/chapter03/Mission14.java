package chapter03;

public class Mission14 {

	
	// makeArray �޼��� : int�� �迭�� ������ �� �����͸� �־� �����ϴ� �޼���
	static int[] makeArray () {
		int temp[] = new int[4];
		for(int i = 0; i < temp.length; i++)
			temp[i] = i;
		return temp;
	
	}
	public static void main(String[] args) {
		int[] intArray = makeArray();
		for(int n : intArray)
			System.out.print(n+" ");
		
	}

}