package chap08.lecture.casting;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		MyInterface i1 = o1;
		i1.method1(); //자동으로 형변환되고 실행되는 메소드는 형변환된 것.
		
		MyClass o2 = (MyClass) i1; // 강제 형변환
		i1.method2();
		
		System.out.println(i1 instanceof MyInterface);
		System.out.println(i1 instanceof MyClass);
		
	}

}
