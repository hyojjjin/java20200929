package chap08.textbook.s080301;

public class Audio implements RemoteControl {
	//필드
	private int volueme;
	
	//turnOn 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	//turnOff 추상 메소드의 실체 메소드
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	//setVolume() 추상메소드의 실체 메소드
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.setVolume = RemoteControl.MAX_VOLUME ;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.setVolume = RemoteControl.MIN_VOLUME;
		} else {
			this.setVolume(- volume);
		}
		System.out.println("guswo Audio 볼륨:" + this.volume);
	}
}
