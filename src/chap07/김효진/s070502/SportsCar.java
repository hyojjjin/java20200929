package chap07.김효진.s070502;

public class SportsCar extends Car{

	@Override
	public void speedUP() {
		speed += 10;
	}
	
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	
	//부모클래스에서 final 메소드로 정의되어 오버라이딩될 수 없음.
}
