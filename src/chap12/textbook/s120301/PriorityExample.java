package chap12.textbook.s120301;

public class PriorityExample {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			Thread thread = new CalcThread("thread" + i);
			//스레드 10개를 만들음
			
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
				//우선순위 낮게
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
				//우선순위 높게
			}
			thread.start();
		}
	}
}
