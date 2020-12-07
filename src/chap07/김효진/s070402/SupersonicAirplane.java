package chap07.김효진.s070402;

public class SupersonicAirplane extends Airplane {
	//자식클래스. 부모클래스의 fly를 오버라이딩했지만, 다시 부모클래스를 super 매소드를 이용하여 불러냄.
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			//Airplane 객체의 fly(	) 메소드 호출
			super.fly();
		}
		
	}
	

	
}

