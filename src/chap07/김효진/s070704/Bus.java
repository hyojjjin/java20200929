package chap07.김효진.s070704;

public class Bus extends Vehicle {
	//자식클래스 vehicle의 run메소드를 상속받아서 오버라이딩했다.
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
