package chap07.김효진.s070803;

public abstract class Phone {
	//추상 클래스 만들기.
	//abstract 선언. new 연산자를 이용해 생성자를 호출할 수 없다.
	
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
