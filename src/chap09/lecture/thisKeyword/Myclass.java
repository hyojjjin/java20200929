package chap09.lecture.thisKeyword;

public class Myclass {
	int field1;
	
	class Nested {
		int field1;

		void method() {
			int field1 = 3;
			System.out.println(field1);
			System.out.println(this.field1); //바로 위의 field 선택
			System.out.println(MyClass.this.field1); //바깥에 가장 첫 field1 선택
		}
	}

}
