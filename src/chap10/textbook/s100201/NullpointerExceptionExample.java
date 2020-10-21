package chap10.textbook.s100201;

public class NullpointerExceptionExample {
	public static void main(String[] args) {
		
		System.out.println("프로그램 실행 중 1");
					
		String data = null;
		
		if (data != null) {
		System.out.println(data.toString());
		//코드가 컴파일 되지않음.
		}
		System.out.println("프로그램 실행 중 2");
	}
}
