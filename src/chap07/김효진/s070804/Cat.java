package chap07.김효진.s070804;

public class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹야옹야옹야옹");
		
	}

}
