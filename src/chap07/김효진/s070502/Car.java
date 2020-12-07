package chap07.김효진.s070502;

public class Car {
	//재정의 할 수 없는 final메소드
	
	//필드
	public int speed;
	
	//메소드
	public void speedUP() {
		speed += 1;
		}
	
	//final 메소드
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
