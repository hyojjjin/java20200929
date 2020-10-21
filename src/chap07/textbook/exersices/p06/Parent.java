package chap07.textbook.exersices.p06;

public class Parent {
	public String nation;
	
	public Parent() {
		this("대한민국"); // != this.nation
		System.out.println("Parent() call"); // 2
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call"); // 1
	}
}
