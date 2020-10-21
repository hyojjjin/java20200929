package chap06.lecture.textbook.s061401;

public class CarExample {
	Car myCar = new Car();
	
	//잘못된 속도 변경
	myCar.setSpeed(-50);
	
	System.out.println("현재 속도: " + myCar.getSpeed());
	
	//올바른 속도 변경
	myCar.setSpeed(60);
	
	//멈춤
	if(!myCar.isStop()) {
		myCar.setStop(true);
	}
	System.out.prinln("현재 속도:" + myCar.getSpeed());
	
}
