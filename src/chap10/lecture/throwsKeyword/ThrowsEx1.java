package chap10.lecture.throwsKeyword;

public class ThrowsEx1 {
	public static void main(String[] args) throws ClassNotFoundException {
	//메인 메스도도 넘김.
		//
		method1();
	}
	public static void method1() throws ClassNotFoundException {
		method2();
	}
	public static void method2() throws ClassNotFoundException {
		//다시 위로 책임을 넘김.
		//try-catch로 감싸거나, 다시 책임을 넘기거나.
		method3();
	}
	public static void method3() throws ClassNotFoundException, FileNotFoundException {
		//처리할 책임을 넘김.
		Class.forName("java.lang.String1");
		FileReader fr = new FileReader("file.txt")
	}
	
}
