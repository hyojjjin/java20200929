package chap14.lecture.nested;

public class NestedEx2 {
		private int outterField;
		
		public void method() {
		MyInterface i1 = () -> {
			int ouuterField;
			System.out.println("익명 클래스의 객체(local class)");
			System.out.println(this);
			System.out.println(outterField);
			System.out.println(NestedEx2.this.outterField);
			//밖 필드에 있는 내용을 지칭하려면 this 앞에 붙여야한다.
			//밖 필드.this. dd
		};
	}
	public static void main(String[] args) {
		
	}
}
