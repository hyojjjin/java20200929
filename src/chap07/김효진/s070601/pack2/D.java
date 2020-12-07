package chap07.김효진.s070601.pack2;

import chap07.김효진.s070601.pack1.A;

public class D extends A {
	
	public D() {
		super();
		this.field = "value";
		this.method();
	
		//super(); : 부모클래스의 생성자를 호출.
		//A클래스는 protected 접근제한을 가지고 있어서
		//다른 패키지의 자식클래스(extends A)가 접근이 가능하다.
	}

}
