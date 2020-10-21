package chap08.textbook.s080303;

import chap08.textbook.s080201.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable {

	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.setVolume = RemoeControl.MUN_VOLUME;
		} else {
			this.bolume = volume;
		}
		System.out.println("현재 TV 볼륨 :"+ this volume);
	}
	
}
