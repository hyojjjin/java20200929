package chap07.김효진.s070803;

public class SmartPhone extends Phone {
	//실체 클래스
	
	public SmartPhone(String owner) {
		super(owner);
		//추상클래스의 생성자 호출
	}
	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
