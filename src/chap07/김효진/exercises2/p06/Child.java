package chap07.김효진.exercises2.p06;

public class Child extends Parent {
	private String name;
	private int name1;
	
	public Child() {
		this(1); //super()와 함께 사용할 수 없다. this()의 매개변수를 가지고 있는 생성자를 일을 시킨다. 
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
	public Child(int name1) {
//		super(); 자동으로 컴파일러됨. 만약. super("srping")이 있으면 매개변수가 spring인 것이 실행되고, 만약 int를 가진다면 int를 가진 생성자가 실행된다.  
		this.name1 = name1;
		System.out.println("Child(int name1) call");
	}
}
