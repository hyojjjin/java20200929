package chap12.lecture.concurrency;

public class ConcurrencyEx2 {
	static int field = 0;
	
	public synchronized static void inc() {
		//Ex1의 오류 해결책 #1
		//synchronized : 먼저 점유한 메소드의 실행이 종료된 후에 다음 메소드가 접근.
		//기다렸다가 실행되면서 속도는 느리다.
		field++;
	}
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 100_0000; i++) {
//					field++;  필드를 실행하지않고, inc 메소드를 통해 필드메소드를 구현한다.
					inc();
				}
				System.out.println(getName() + "종료");
				System.out.println(field);
			};
		};
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 100_000; i++) {
//					field++; 필드를 실행하지않고, inc 메소드를 통해 필드메소드를 구현한다.
					inc();
				}
				System.out.println(getName() + "종료");
				System.out.println(field);
			};
			};
		t1.start();
		t2.start();
		
	}
}