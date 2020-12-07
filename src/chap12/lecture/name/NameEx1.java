package chap12.lecture.name;

public class NameEx1 {
	//스레드 이름 찾기
	
	public static void main(String[] args) {
		Thread th0 = Thread.currentThread();
		System.out.println(th0.getName());
		
		th0.setName("my main Thread"); //set메소드로 이름 수정
		System.out.println(th0.getName());
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println(getName());
				//스레드 이름을 정해주지않았기때문에 Thread -0 부터 순서대로 나옴.
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				try {
					Thread.sleep(500);{
				} catch {InterruptedException e) {
					e.printStackTrace();
				}
		
				System.out.println(getName());
			}
		};
		
		//다시 보깅
		
		
		t1.start();
		t2.start();
		
	}

}
