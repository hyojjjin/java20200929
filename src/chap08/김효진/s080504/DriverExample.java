package chap08.김효진.s080504;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		//드라이버 객체를 생성
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		//인터페이스 구현객체를 생성
		
		driver.drive(bus);
		driver.drive(taxi);
		
		
		
		
	}

}

