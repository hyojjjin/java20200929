package chap06.김효진.s060300;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student(); //s1 변수, Student 객체 생성
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student(); //s1 변수, Student 객체 생성
		System.out.println("s2 변수가 Student 객체를 참조합니다.");
		
		//각각 s1 s2의 Student 객체는 서로 다른 것.
		//new 연산자로 객체 생성. 객체 = 인스턴스.
	}

}
