package chap12.lecture.concurrency;

public class ConcurrencyEx1 {
	static int field = 0;
	public static void main(String[] args) {
		
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 100_0000; i++) {
					field++;
				}
				System.out.println(getName() + "종료");
				System.out.println(field);
			};
		};
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 100_000; i++) {
					field++;
				}
				System.out.println(getName() + "종료");
				System.out.println(field);
			};
			};
		t1.start();
		t2.start();
		//각각의 스레드가 공유되어 실행하면서, 데이터를 기억하기 전에 새로운 행동을 하게됨으로 정확한 데이터값이 안 나오는 경우가 있음.
	}
}
