package chap15.김효진.s150401;

public class Student {
	//키로 사용할 객체 
	//hashcode()와 equals 재정의
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && (name.equals(student.name));
		}	else {
			return false;
		}
	}
	
	public int hashCode() {
		return sno + name.hashCode();
	}

}
