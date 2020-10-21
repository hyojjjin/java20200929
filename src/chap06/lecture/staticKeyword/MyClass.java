package chap06.lecture.staticKeyword;

public class MyClass {
	static int var2;
	int var1
	
	void method() {
		System.out.println(var1); 
		
	}
	
	static void method2() {
		System.out.println(var2);
		
	}
}

//스테틱 멤버에서 인스턴트 멤버에 있는 것을 가져올 수 없다. 읽을 수 없음.
//단, 인스턴트 멤버는 클래스 멤머를 접근할 수 있음.