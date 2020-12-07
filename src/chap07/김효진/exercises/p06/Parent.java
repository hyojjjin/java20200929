package chap07.김효진.exercises.p06;

public class Parent {
	public String nation;
	
	public Parent() {
		this("대한민국");
		System.out.println();
	}
		
		public Parent(String nation) {
			this.nation = nation;
			System.out.println("Parent(String nation) call");
		}
}
