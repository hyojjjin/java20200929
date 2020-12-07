package chap12.lecture.annoymous;

public class AnnoymouseEx1 {
	public static void main(String[] args) {
		//상속과 인스턴트 생성을 한번에
		
		Thread t1 = new Thread() {
			
			@Override
			public 
			void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		};
		//구현하면서 인스턴스 만들기
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println((char) ('a' + i));
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		//좀더 간단하게 사용하는 식.
		//람다식
		//인터페이스가 추상메소드를 하나만 가지고 있을때 사용.
		//메소드명, 메소드 파라미터를 생략가능.
		Thread t3 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println((char)('Z' - i));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
			
		
	
	
		t1.start();
		t2.start();
		
	}

}
