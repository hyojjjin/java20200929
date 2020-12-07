package chap07.김효진.s070803;

public class PhoneExample {
	public static void main(String[] args) {
		//추상클래스
		
		//Phone phone = new Phone();
		//추상클래스에서 객체를 생성할 수 없음.
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
	}

}
