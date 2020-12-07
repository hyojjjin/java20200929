package chap07.김효진.s070301;

public class People {
	//부모클래스
	
	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	//기본 생성자가 없고, name과 ssn을 매개값을 가지는 생성자가 있다.
	//자식 클래스에도 super(name, ssn)의 생성자를 호출해야함.
	
	}

}
