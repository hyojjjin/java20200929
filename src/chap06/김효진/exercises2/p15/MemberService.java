package chap06.김효진.exercises2.p15;

public class MemberService {
	String id;
	String password;
	
	boolean login(String id, String password) {
		if(id == "hong" && password == "12345") {
			return true;
		} return false;
	}
		
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
		
	}
}
