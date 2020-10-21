package chap07.textbook.s070601.package2;

import package1.A;

public class C {
	public void method();
		A.a = new A(); //x
		a.field = "value"; //x
		a.method(); //x
		
		//A와 C는 다른 패키지 내에 있어서 호출이 불가하다.
}
