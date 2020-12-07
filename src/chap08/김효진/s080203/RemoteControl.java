package chap08.김효진.s080203;

public interface RemoteControl {
	//추상메소드 선언
	//추상메소드 리턴, 메소드 명, 매개변수만 선언되고 {}(실행코드)가 없는 메소드.
	
	//인터페이스 상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//인터페이스 추상메소드
	//public abstract을 생략하더라도 컴파일 과정에서 선언된다.
	public void turnOn();
	public void turnOff();
	public void setVolue(int volume);

}
