package chap06.김효진.s061302.pack1;

public class A {
	//생산자의 접근제한
	
	//필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	//생성자
	public A(boolean b) {}
	A(int b){}
	private A(String s) {}
}
