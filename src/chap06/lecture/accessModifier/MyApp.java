package chap06.lecture.accessModifier;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		System.out.println(o1.var1); // va1 보다 var2가 더 작은 범위
		System.out.println(o1.var2); // 같은 패키지 내라서 가능
//		System.out.println(o1.var3); 같은 클라스가 아니라서 안됨
		
	}
}
