package chap14.lecture.parameter;

public class ParameterEx2 {
	public static void main(String[] args) {
		MyInterface2 o1 = (int a, int b) -> System.out.println(a + b);
		o1.method(3, 10);
		
		MyInterface2 o2 = (x, y) -> System.out.println(x + y);
		o2.method(15, 5);
		
//		MyInterface2 o3 = a, b, -> System.out.println(a + b);
		//파라미터의 값이 두개 이상일때, 둥근 괄호는 생략 가능.
	}

}
