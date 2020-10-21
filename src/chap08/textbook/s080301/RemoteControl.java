package chap08.textbook.s080201;

public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	int f;
	
	public void turnOn(); //public abstract 생략 가능
	public void turnOff();
	

}

