package chap08.김효진.s080505;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare();
		//현재 인터페이스 변수로 자동변환된 상태라, 버스클래스의 메소드를 꺼내올 수 없음.
		
		Bus bus = (Bus) vehicle;
		//강제 타입 변환
		
		bus.run();
		bus.checkFare(); //타입변환된 후 버스클래스의 메소드 사용 가능.
	}

}
