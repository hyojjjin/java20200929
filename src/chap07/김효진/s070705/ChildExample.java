package chap07.김효진.s070705;

public class ChildExample {
	//강제타입변환(casting)
	
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		
		/*
		 parent.field2 = "data2";
		 parent.method3();
			부모클래스로 자동변환이 되었지만,
			자식클래스에만 있는 필드와 메소드를 호출할 수 없다.
		*/
		
		
		
		Child child = (Child) parent;
		//자동변환된 부모클래스를 강제 타입변환(캐스팅)을 주어,
		//자식클래스에만 명시된 필드와 메소드가 사용가능하게 되었다.
		
		child.field2 = "yyy"; //가능
		child.method3(); //가능
	}

}
