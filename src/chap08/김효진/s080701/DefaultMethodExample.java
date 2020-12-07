package chap08.김효진.s080701;

public class DefaultMethodExample {
	public static void main(String[] args) {
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		mi1.method2();
		//인터페이스를 받아서 사용할 수 있는 건가.
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();
	}
	
}
