package chap06.lecture.overload;

public class MyClass {
	public static void main(String[] args) {
		//같은 이름의 메소드를 만들었을 경우, 달라야한다. overloading
		//1. 파라미터
		//2. 파라미터의 타입
		//3. 파라미터의 갯수
		//4.파라미터의 순서
		void = method1() {
			System.out.println("method1....");
		}
		
		void method1(int i) {
			System.out.println("method1#######"); //같은 이름의 메소드를 만들었을때는 파라미터가 달라야한다.
		}
		
		void method1(double j) {
			System.out.println("method1*****"); //파라미터의 타입이 달라야함.
		}
		
		void method1(int i, int j) {
			System.out.println("method1 int, int"); //파라미터의 갯수가 달라야한다.
		}
		
		void method(int i, double j) {
			System.out.println("method1 int, double"); //파라미터의 순서가 달라야한다.
		}
		
		void method1(double i, int j) {
			System.out.println("method1 double, int");
			return 3;
		}
		
		
	}

}
