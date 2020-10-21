package chap08.textbook.s080505;

public class vehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); x
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
		
		
		System.out.println("-------------------------");
		
		Driver driver = new Driver();
		driver.drive(new Bus());
		driver.drive(new Taxi());
	}

}
