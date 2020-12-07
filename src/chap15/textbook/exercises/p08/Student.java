package chap15.textbook.exercises.p08;

public class Student {
	public int studentNum;
	public String name;
	
	public Student (int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

		@Override
		public int hashCode() {// 객체 번지수, 같은 객체인지 확인
			//코드 작성
			 return studentNum;
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Student) {
				Student student = (Student) obj;
				return studentNum == student.studentNum;
			}
			//코드 작성
			return false;
		}
}
