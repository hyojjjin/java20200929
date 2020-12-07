package chap15.김효진.exercises.p08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import chap13.textbook.s130601.Student;

public class HashSetEample {
	public static void main(String[] args) {
		
		Set<Student> set = new HashSet<Student>();
			
			set.add(new Student(1, "홍길동"));
			set.add(new Student(2, "김효진"));
			set.add(new Student(1, "김자바"));
			
			Iterator<Student> iterator = set.iterator();
			while(iterator.hasNext()) {
				Student student = iterator.hasNext();
				System.out.println(student.studentNum + ":" + student.name);
		}
	}
}
