package chap04.exercises;

public class exercise04 {
	public static void main(String[] args) {
		
		//while문
		//Math.random()메소드
		//(눈1, 눈2)
		//눈의 합이 5일때.
		//(14)(41)(23)(32)
		

		
		int s = 0;
		while (s != 5) {
			int a = (int) (Math.random()*6)+1; 
			int b = (int) (Math.random()*6)+1;
			s = a + b ;
			
			System.out.println("("+ a +","+ b +")");
			
		}
		
	
			//머징???
			}
}
