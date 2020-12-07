package chap04.김효진.p040301;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		//for문으로 구구단 출력하기
		
		for(int i = 1; i < 10; i++) {
			System.out.println(i + "단");
			
			for(int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + " = " + i * j);
			}
		}
	}
}
