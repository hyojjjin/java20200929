package chap08.김효진.s080502;

public class Car {
	//필드의 다형성
	
	//인터페이스 대입 필드 선언과 초기 구현 객체.
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	//인터페이스 roll 메소드 호출
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll(); 
		backLeftTire.roll();
		backRightTire.roll();
	}
}
