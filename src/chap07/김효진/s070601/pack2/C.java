package chap07.김효진.s070601.pack2;

import chap06.김효진.s061302.pack1.A;

public class C {
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
		
		//다른 패키지에 있는 C클래스는
		//A클래스에 있는 필드, 생성자, 메소드에 접근할 수 없다.
	}
}
