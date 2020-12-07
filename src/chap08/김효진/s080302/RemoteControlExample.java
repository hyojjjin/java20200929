package chap08.김효진.s080302;

public class RemoteControlExample {
	public static void main(String[] args) {
		//익명 구현 클래스
		
		RemoteControl rc = new RemoteControl() {
			//인터페이스 변수 = new 인터페이스()
			public void turnOn() {/*실행문*/}
			public void turnOff() {/*실행문*/}
			public void setVolume(int volume) {/*실행문*/}
			//인터페이스에 작성된 모든 추상멧드를 작성
			
		};
		//익명구현클래스는 실행문으로 ; 세미클론을 붙여야한다.
	}

}
