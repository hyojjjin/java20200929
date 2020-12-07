package chap08.김효진.s080202;

public interface Remotecontrol {
	//인터페이스 상수 필드 선언
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//인터페이스에는 오직 상수만 가능.
	//상수 선언 : public static final
	//인터페이스 필드는 오직 상수 필드만 가능하기에, 상수필드를 선언하는 static final을 생략하여도 컴파일 시 자동으로 생성된다.

}
