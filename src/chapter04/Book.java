package chapter04;

public class Book {
	
	//�ʵ� : �������
		 String title; 
		 String author;
		 String name = "���º�";
		//�޼���
		//�����ڸ޼���
		 Book(){System.out.println(name);}
		 Book(String title) { 
			 this("","");
			this.title = title; 
			this.author = "���ڹ̻�";
		}
		
		 Book(String title, String author) {
			
			 this.title = title;
			this.author = author; 	
			}
		//�Ϲݸ޼���
		void printBook() {
			System.out.println(this.title + ":"+this.author);
		}
		public static void main(String [] args) {
			Book book = new Book();
			Book littlePrince = new Book("�����", "�������丮"); 
			Book loveStory = new Book("������");
			
			littlePrince.printBook();
			loveStory.printBook();
			book.title = "���̿���";
			System.out.println(book.title);
}
}