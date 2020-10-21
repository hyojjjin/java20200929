package chap06.lecture.encapsulation;

public class Car {
	private int speed;
	//캡슐화 : 데이터는 공개하지않고 메소드만 공개
	public class Car;
	
	
	public void setSpeed(int speed) {
		this.speed = speed;
		
	}
	
	public void setSpeed(int speed) {
		if(speed >= 0) {
			this.speed = speed;
			
		}
	}
	
	public int getSpeed() {
		return this.speed;
		
		
	}

	
	
}
