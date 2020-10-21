package chap10.lecture.checkedExceptions;

public class ClassNotFoundExceptionEx1 {
	public static void main(String[] args) {
		System.out.println("프로그램 실행1");
		
		try {
			System.out.println("프로그램 실행 try 1");
			
			Class.forName("jave.lang.String2"); //실행되지 않음.
			
			System.out.println("프로그램 실행 try 2");
		} catch(ClassNotFoundException e) {
			System.out.println("익셉션 발생!!!!"); //익셉션이 발생할 때 나오는 것
		} finally {
			System.out.println("무조건 실행!!");
		}
		
		System.out.println("프로그램 실행2");
	}
}
