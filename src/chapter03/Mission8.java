package chapter03;

public class Mission8 {

	public static void main(String[] args) {
		
		int count = 0;
		for (int x=1; x<=31; x++) {
			 count++;
			 System.out.printf("%5d",x); //����� �����ϱ� ���ؼ��� printf�� ����ؼ� ����ؾ��Ѵ�.
			 if(count%7 ==0)
				 System.out.println();	 
		}
		
	}
}

