package chap13.textbook.s130501;

public class BoundedTypeParameterExamle {
	public static void main(String[] args) {
		//String str = Util.compare("a", "b"); - string은 넘버 타입이 아님.
		
		int result1 = Util.compare(10, 20);
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3);
		System.out.println(result2);
	}

}
