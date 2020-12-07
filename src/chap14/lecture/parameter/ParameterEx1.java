package chap14.lecture.parameter;

public class ParameterEx1 {
	public static void main(String[] args) {
		MyInterface1 o1 = (int a) -> System.out.println(a);
		o1.method(9);
		
		MyInterface1 o2 = (i) -> System.out.println(i);
		o2.method(3);
		//파라미터의 타입 생략 가능
		
		MyInterface1 o3 = x -> System.out.println(x);
		o3.method(10);
		//파라미터가 하나면 둥근 괄호도 생략 가능
	}
	
	public static void method1(int x) {
		System.out.println(x);
	}


}
