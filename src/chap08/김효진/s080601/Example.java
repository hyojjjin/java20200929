package chap08.김효진.s080601;

public class Example {
	public static void main(String[] args) {
		//인터페이스 호출 가능 메소드
		
		ImplementationC imp1 = new ImplementationC();
		
		InterfaceA ia = imp1;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = imp1;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = imp1;
		//인터페이스C 변수는 A, B, C 모두 호출 가능.
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
