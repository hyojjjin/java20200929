package chap07.김효진.exercises.p05;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
		
		//부모의 생성자를 호출할때는 super()메소드를 사용한다.
	}
}
