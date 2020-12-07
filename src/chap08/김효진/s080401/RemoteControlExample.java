package chap08.김효진.s080401;

public class RemoteControlExample {
	public static void main(String[] args) {
		//인터페이스 사용
	
		RemoteControl rc = null;
		//인터페이스 변수 선언
		
		rc = new Television();
		//객체를 인터페이스 타입에 대입하여 메소드를 호출할 수 있다.
		rc.turnOn();
		rc.turnOff();
		
		
		rc = new Audio();
		//객체를 인터페이스 타입에 대입하여 메소드를 호출할 수 있다.
		rc.turnOn();
		rc.turnOff();
	}

}
