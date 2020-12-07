package chap06.김효진.s061302.pack2;

import chap06.김효진.s061302.pack1.A;

public class C {

	//필드
	A a1 = new A(true);
	A a2 = new A(1);	 	//default 다른 패키지 안됨.
	A a3 = new A("문자열"); 	//private 다 금지.
	
}
