package chap04.김효진.exercises;

public class p05 {
	public static void main(String[] args) {
		//중첩 for문
		//방정식 4x + 5y = 60의 모든 해
		//(x, y) 형태
		//x와 y는 10이하의 자연수
		
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <=10; y++) {
				if(4*x + 5*y == 60) {
					System.out.println("("+ x + ", " + y + ")");
				}
			}
		}
	}

}
