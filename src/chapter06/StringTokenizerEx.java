package chapter06;

import java.util.Scanner;
import java.util.StringTokenizer;


public class StringTokenizerEx {

	public static void main(String[] args) {
	
		
	      Scanner s = new Scanner(System.in);
	      StringTokenizer st;
	      
	      while(true) {
	    	  System.out.println(">>>");
	    	  String a = s.nextLine();
	    	  if(a.equals("그만"))
	    	  { 
	    		  System.out.println("종료합니다.");
	    		  s.close();
	    		  break;
	    	  }
	    	  st = new StringTokenizer(a," ");
	    	  String x[] =a.split(" ");
	    	  System.out.println("어절 개수는"+ x.length);
	      }
	  }

	
	
	
	}



