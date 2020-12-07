package chap08.김효진.s080702;

public interface ParentInterface {
	//추상메소드 method1와
	//디폴트 메소드 method2 가 선언되어있는 인터페이스
	
	public void method1();
	public default void method2() {
	
		// 실행문
		
	}

}
