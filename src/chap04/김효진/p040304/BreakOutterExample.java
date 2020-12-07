package chap04.김효진.p040304;

public class BreakOutterExample {
	public static void main(String[] args) {
		//중첩된 반복문 모두 종료
		
		Outter : for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter;
				}
			}
		}
	System.out.println("프로그램 종료");
	}
}
