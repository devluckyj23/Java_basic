package chapter01;


//미션 1: 주어진 섭씨 온도를 화씨 온도로 바꾸는 CtoF 메소드를 작성하라.
//	F = (9/5)*C + 32
//C : 15도 라고 가정
// input - intC (섭씨) / output - F == (9/5)*C+32
// int + double = 큰 수에 맞춰서 나온다. 5 -> 5.0 으로 
// 정수 5 / 실수 5.
public class Mission1 {
	public static double CtoF( int C) {
		return (9./5.)*C +32;
	}
	
	public static void main(String[] args) {
		int C =14;
		
		System.out.println("화씨온도 : " + CtoF(C));
		}
	
	}

