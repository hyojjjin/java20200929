package chap08.김효진.s080402;

public class RemoteControlExample {
	public static void main(String[] args) {
		//디폴트 메소드 사용
		
		//디폴트 메소드는 호출 시 구현 객체가 필요하다.
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
	}
}
