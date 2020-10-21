package chap06.lecture.accessModifier.other;

import chap06.lecture.accessModifier.MyClass;

public class MyApp {
	public static void main(String[] args) {

		MyClass o1 = new MyClass();
		
		System.out.println(o1.var1);
//		System.out.println(o1.var2); 다른 패키지라 안됨
//		System.out.println(o1.var3); 같은 클라스가 아니라서 안됨.
		
	}
}
