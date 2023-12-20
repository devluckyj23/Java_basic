package game;

import java.util.Random;
import java.util.Scanner;

//게임 시나리오
public class GameUnit {
	    static int bossPower = 5000;
	    private int unitPower = 5000;
	    private Myweapon weapon; 
	    private String name;
	    		
	    //생성자를 구현해주세요. 
	    
	    // 생성자메서드
//	    public GameUnit () {};
	    public GameUnit(String name) {
			this.name =name;
	    	weapon = new Myweapon();
	    	weapon.charge(unitPower);
	    	
		}
	    //attack 메서드 구현
	    private void attack (int power) {
	    	GameUnit.bossPower = bossPower - power;
	    }
	    
	    void defence (int power) {
	    	GameUnit.bossPower = bossPower + power;
	    }
	    
	    public static void main(String[] args){ 
	      GameUnit unit1 = new GameUnit("unit1");
	      GameUnit unit2 = new GameUnit("unit2");	      
	      
	      Random r = new Random();
	      Scanner scan = new Scanner(System.in);
	      while(true){   
	    	  int p1 = 500+ r.nextInt(1000);
	    	  int p2 = 1+ r.nextInt(500);
	    	  System.out.println("공격하세요!");
	    	  String act = scan.next();
	    	 
	    	  if(act.equals("1"))  { 
	    		  
	    		  unit1.attack(p1);
	    		  System.out.println("웅기가 공격한다!"+ p1 + "데미지 작렬!");
	    		  		if(p1>1000)
	    		  			System.out.println("크리티컬!!! WOW!!!");
	    		  		
	    		  if(GameUnit.bossPower <0) {
	    		  			System.out.println("우우우 보스다이");
	    		  			System.exit(0);}
	    		  
	    		  else
	    			  System.out.println("남겨진 bossPower:" + GameUnit.bossPower);
	    		  
	    		  unit2.defence(p2);
	    		  System.out.println("슬기가 보스피를 회복했다! "+ p2+ "리커버리!!");
	    	  }
				 	if(p2>200)
				 		System.out.println("결코 쉽지는 않을껄 !");
	    	  if(GameUnit.bossPower<=0) {
	    		  System.out.println("게임승리!-게임 종료합니다.");
	    	  System.exit(0);
	    	  }
	    	  else
	    		  System.out.println("남겨진 bossPower:" + GameUnit.bossPower);
	    	 }
	      
	    }
	    
}