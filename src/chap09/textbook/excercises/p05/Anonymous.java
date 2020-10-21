package chap09.textbook.excercises.p05;

public class Anonymous {
	
	Vehicle field = new Vehicle() {
	//필드 초기값 대입
		@Override
		public void run() {
			System.out.println("자건거가 달립니다.");
		}
	};
		
		
	void method1() {
	//로컬 변수값으로 대입
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
	
		localVar.run();
				
	}
	
	void method2(Vehicle v) {
		v.run();
	}

}
