package chap07.김효진.s070704;

public class Taxi extends Vehicle{
	//자식클래스 부모클래스의 run을 상속받아서 오버라이딩했다.
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
