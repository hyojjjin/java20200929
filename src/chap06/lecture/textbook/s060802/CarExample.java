package chap06.lecture.textbook.s060802;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
			
		myCar.setGas(5); //Car의 setGas()메소드 호출
		
		boolean gasState = myCar.isLftGas(); //Car의 isLeftGas메소드 호출
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run(); //car의 run()메소드 호출
		}
	}
}
