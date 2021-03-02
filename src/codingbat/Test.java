package codingbat;

public class Test {
	public static void main(String[] args) {
		MyClass i1 = new MyClass();
		MyClass i2 = new MyClass();
		
		i1.b = "bbb";
		i2.b = "cccc";
		
		System.out.println(i1.b);
		System.out.println(i2.b);
		
		i1.a = "ddd";
		i2.a = "eee";
		
		System.out.println(i1.a);
		System.out.println(i2.a);
		System.out.println(MyClass.a);
		
		System.out.println();
		
		
		i1.c = "ddd";
		i2.c = "eee";
		System.out.println(i1.c);
		System.out.println(i2.c);
		System.out.println(MyClass.c);
		
	}
}

class MyClass {
	static String a;
	static String c;
	String b;
}
