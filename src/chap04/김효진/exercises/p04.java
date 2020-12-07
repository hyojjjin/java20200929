package chap04.김효진.exercises;

public class p04 {
	public static void main(String[] args) {
		//while문과 Math.random() 메소드를 이용
		//두개의 주사위를 던져서 나오는 눈을 (눈1, 눈2) 형태로 출력
		//두 눈의 합이 5면 주사위를 멈춘다.
		
		
		  int num1 = (int) ((Math.random()*6)+1);
		  int num2 = (int) ((Math.random()*6)+1);
		  
		  while (num1 + num2 != 5) {
			  System.out.println("("+ num1 +", " + num2 + ")");
			  num1 = (int) ((Math.random()*6)+1);
			  num2 = (int) ((Math.random()*6)+1);
			  
			  if(num1 + num2 == 5) {
				  System.out.println("("+ num1 +", " + num2 + ")");
				  System.out.println("끗!");
			  } 
		  
		
		  } 

		/*
		while(true) {
			int num1 = (int)((Math.random()*6)+1);
			int num2 = (int)((Math.random()*6)+1);
			
			System.out.println("(" + num1 +", " + num2 + ")");
		
			if(num1 + num2 ==5) {
				break;
			}
		}
				*/
		
		
		 
	}
}
