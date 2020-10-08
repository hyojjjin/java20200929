package chap04.exercises;

public class exercise05 {
	public static void main(String[] args) {
		
		//중첩 for문 사용
		//4x+5y=60
		//(x,y)
		// x y 1이상 10 이하
		
		
		int x = 1;
		int y = 1;	
		
		for (x=1; x<=10; x++) {
			for (y=1; y<=10; y++) {
				if(4*x+5*y == 60) {
					System.out.println("("+x +","+y+")");
				}
			}
		}
		
	}
}
