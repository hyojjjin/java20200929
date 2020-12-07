package chap08.김효진.s080303;

public class SmartTelevision implements RemoteControl, Searchable {
	//다중 인터페이스 구현
	private int volume;
	
	//remotecontrol 인터페이스 추상 메소드에 대한 실체 메소드
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME; 
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
	
	//searchalbe 인터페이스의 추상메소드 대한 실체 메소드
	public void search(String url) {
		System.out.println(url+ "을 검색합니다.");
	}

	//추상메소드가 하나라도 없으면 추상 클래스가 된다.
}
