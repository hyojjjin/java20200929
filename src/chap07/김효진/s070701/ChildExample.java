package chap07.김효진.s070701;

public class ChildExample {
	public static void main(String[] args) {
		//타입 변환 후의 멤버 접근
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		//자식클래스에서 오버로딩된 값으로 출력
		
		parent.method2();
		//자식클래스에 있지않아도 상속받고있는 부모클래스에 있기 때문에 사용할 수 있음.
		
//		parent.method3();
		//자식클래스에만 있는 메소드. 부모클래스에 메소드가 없어서 사용할 수 없음.
		
	}

}
