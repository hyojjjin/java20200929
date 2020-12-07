package chap07.김효진.s070804;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍멍멍!");
	//실체클래스에서 추상메소드를 오버라이딩하여 사용.
	}
}
