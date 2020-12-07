package chap15.김효진.exercises.p08;

public class Student {
	public int studentNum;
	public String name;
	public Student (int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {// s1.equals(s2)
		// 학번이 같으면 true return, 아니면 false
		/*
		스투턴스 객체에서 가져와서 s1
		s2 ㅇ오브젝트 객체 인지 확인
		오브젝트 객체에 스튜턴트가 부모인지 봐야해
		근데 어ㅏㅊ피 
		
		맞으면 s1.equals(s2)
		*/
		// studentNum 이 object 객체에서 빼왔는지
		// sutdent가  objcet인지
		if(obj instanceof Student) {
			return studentNum == ((Student) obj).studentNum;
		}
		return false;
		
		//코드 작성
	}

}
