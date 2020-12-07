package chap12.lecture.concurrency;

public class ConcurrencyEx3 {
	static int field = 0;
	static final Object lock = new Object();
	//lock 의미 없는 객체
	
	
	public static void inc() {
		//Ex1의 오류 해결책 #2
		//메소드 전체가 동기화되지 않는다면, 시작에 synchronized를 붙여줘도 되지만,
		//메소드 중간중간에 동기화를 주고싶지않다면.
		synchronized(lock) {
			//lock -> 객체. 바톤 또는 발언권으로 생각.
			//싱크로나이즈 코드 블록에 들어오기 전에, lock객체를 획득해야함. 
			//획득한 스레드만 진행이 가능.
			field++;
		}
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
				for(int i = 0; i < 100_0000; i++) {
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