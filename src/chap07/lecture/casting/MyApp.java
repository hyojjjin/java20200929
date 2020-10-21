package chap07.lecture.casting;

public class MyApp {
	public static void main(String[] args) {
		SuperClass o1 = new SubClass();
		SuperClass[] arr = new SuperClass[3];
		arr[0] = new SubClass(); //서브클라스는 서브클라스다. 값을 넣어줄 수 있다.
		method3(new SubClass());
		
		o1.method1();
		
		SubClass o2 = (SubClass) o1;
		
		o2.method2();
		
		//캐스팅은 값 손실이 일어날 수 있다.
	
	}
	
	
	
	public static void method3(SuperClass s) {
		s.method1();
	}

}
