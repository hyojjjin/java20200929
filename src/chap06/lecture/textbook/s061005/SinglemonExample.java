package chap06.lecture.textbook.s061005;

public class SinglemonExample {
	public static void main(String[] args) {
		/*
		  Singleton obj1 = new singleton(); //컴파일 에러
		  Singleton obj2 = new Singleton(); //컴파일 에러
		 */
		
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		
	}
}
