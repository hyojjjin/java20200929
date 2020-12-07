package chap11.textbook.s110602;

public class ReflectionExample {
	public static void main(String[] args) {
	Class clazz = class.forNAme("sec05.exam02_reflection.Car");
	
	System.out.println("[클래스 이름]");
	System.out.println(clazz.getName());
	System.out.println();
	
	System.out.println("[생성자 정보]");
	Constructor[] constructors = claszz.getDeclaredConstructors();
	for(Constructor constructor : construcktors) {
		Class[] parameter =constructor getParamether)Types(;)
		printParameters(parameters);
		System.out.println(")");
	}
}
}
