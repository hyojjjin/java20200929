package chap14.lecture.lambda;

public class LambdaEx2 {
	public static void main(String[] args) {
		
		MyInterface o1 = () -> {
			System.out.println("hello");
			System.out.println("world");
		};
		
		//실행문이 두 개 이상일 경우에는,
		//실행문을 중괄호로 묶음.
		
		MyInterface o2 = () -> {System.out.println("hello");};
		MyInterface o3 = () -> System.out.println("jsp");
		//실행문이 한 줄일 경우,
		//중괄호가 있어도 되고, 없어도 된다.
		
		
		o1.method();
				
	}
}
