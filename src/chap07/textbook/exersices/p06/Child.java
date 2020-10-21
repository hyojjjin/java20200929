package chap07.textbook.exersices.p06;

public class Child extends Parent{
	private String name;
	
	public Child() {
		// super();
		this("홍길동");
		System.out.println("Child() call"); // 4
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call"); // 3
	}

}
