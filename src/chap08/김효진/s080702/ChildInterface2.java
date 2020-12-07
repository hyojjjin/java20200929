package chap08.김효진.s080702;

public interface ChildInterface2 extends ParentInterface {
	//디폴트 메소드를 오버라이딩한 자식 인터페이스
	
	@Override
	public default void method2() {
		// 실행문 재정의
	}
	
	public void method3();

}
