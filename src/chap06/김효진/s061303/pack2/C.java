package chap06.김효진.s061303.pack2;

import chap06.김효진.s061303.pack1.A;

public class C {

	public C() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1; //default 다른 패키지 접근 제한.
		a.field3 = 1; //private 모두 접근 제한.
		
		a.method1();
		a.method2(); //default 다른 패키지 접근 제한.
		a.method3(); //private 모두 접근 제한.
	}
}
