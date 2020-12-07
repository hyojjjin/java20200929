package chap08.김효진.s080503;

public class Car {
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
	};
	
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}

}
