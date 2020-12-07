package chap07.김효진.s070703;

public class HankookTire extends Tire {
	//Tire의 자식클래스
	
	//필드
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		}
	
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명 : " +
					(maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "HankookTire 펑크 ***");
			return false;
		}
	}
}
