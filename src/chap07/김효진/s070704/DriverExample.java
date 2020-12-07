package chap07.김효진.s070704;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		//매개변수를 자식클래스의 객체를 사용
		//자동 타입변환이 일어난다. Vehicle vehicle = bus;
		
		driver.drive(taxi);
		//매개변수를 자식클래스의 객체를 사용
		//자동 타입변환이 일어난다. Vehicle vehicle = taxi;
		
	}

}
