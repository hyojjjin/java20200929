package chap06.김효진.책.s060702;

public class CarExample {
	public static void main(String[] args) {
		//생성자를 호출하여 객체 생성.
		
		Car myCar = new Car("검정", 3000);
		//Car 클래스에서 Car(color, int cc)였음.
		
		//Car 클래스에서 파라미터가 선언 된 객체 생성.
		//생성자를 호출할때에도 파라미터가 선언되어야함.
		
		//기본 생성자 호출 X
		
//		System.out.println(myCar);
//		값을 불러올 수 없음.
//		불러오려면, 먼저 Car 클래스에서 필드를 생성한 뒤 get메소드 등을 이용해야함.
	}

}
