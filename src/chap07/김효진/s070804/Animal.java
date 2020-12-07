package chap07.김효진.s070804;

public abstract class Animal {
	//추상클래스에서 추상메소드 선언
	
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
	//메소드 선언부만 있고, 실행내용이 없는 추상메소드.
}
