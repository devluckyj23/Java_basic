package chapter07;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {
	
	
	public static void printList(LinkedList<String> ll) {
		Iterator<String> iterator =ll.iterator();
		while(iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if(iterator.hasNext())
				separator = "->";
			else
				separator = "\n";
			System.out.print(e + separator);
		}

	}
		
		public static void main(String[] args) {
			
			LinkedList<String> myList = new LinkedList<String>();
			
			myList.add("트랜스포머");
			myList.add("스타워즈");
			myList.add("매트릭스");
			myList.add(0,"터미네이터");
			myList.add(2,"아바타");
			
			printList(myList); // 정렬되지 않은 리스트 출력
			
			Collections.sort(myList); //리스트 정렬
			printList(myList);
			
//			Collections.reverse(myList);
//			printList(myList);
			
			int index = Collections.binarySearch(myList, "아바타")+1; // 리스트를 정렬한 후 binarySearch를 실행.
			System.out.println(index+"번째에 있습니다.");
		
		}
}
