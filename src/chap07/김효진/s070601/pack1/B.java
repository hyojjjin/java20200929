package chap07.김효진.s070601.pack1;

public class B {
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
		
		//같은 패키지 내에 있는 B 클래스는
		//A클래스의 필드, 생성자, 메소드에 접근가능.
	}

}
