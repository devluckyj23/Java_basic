package miniproject_db.copy;

public interface IShop {
	
	//쇼핑몰 규격을 정의한 인터페이스, 모든 쇼핑몰은 IShop인터페이스를 구현해야한다.
	//setTitle 		:쇼핑몰 제목달기
	public abstract void setTitle(String title);
	//genUser 		:사용자 정보를 등록하기
	public abstract void genUser();
	//genProduct 	:상품정보를 등록하기
	public abstract void genProduct();
	//start 		:쇼핑몰의 전체기능을 위한 시나리오 넣기
	public abstract void start();
	
}
