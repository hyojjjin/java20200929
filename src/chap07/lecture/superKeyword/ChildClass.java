package chap07.lecture.superKeyword;

public class ChildClass extends ParentClass {
	@Override
	void method1() {
		super.method1();
		//super 키워드 : 상위 클래스의 메소드를 실핼할 수 있다.
		System.out.println("parent method1");
		
		System.out.println("child method1");
	}

}
