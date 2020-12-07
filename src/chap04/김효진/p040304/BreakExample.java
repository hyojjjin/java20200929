package chap04.김효진.p040304;

public class BreakExample {
	public static void main(String[] args) {
		//while문을 사용해서 주사위 번호 중 하나를 반복해서 뽑고, 만약 6이 나오면 종료시킨다.
		
		while (true) {
			int num = (int) ((Math.random()*6) +1);
			System.out.println(num);
			
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
