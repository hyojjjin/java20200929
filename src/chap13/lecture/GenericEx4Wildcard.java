package chap13.lecture;

import chap13.textbook.s130601.*;

public class GenericEx4Wildcard {
	public static void main(String[] args) {
		Course<Person> coursePerson = new Course<> ("일반인", 5);
		Course<Student> courseStudent = new Course<> ("학생", 5);
		
		Person p = new Person("일반");
		Student s = new Student("학생");
		
		p = s;
		courseStudent.add(new Student("hong"));
		coursePerson.add(new Person("kim"));
		
		coursePerson = courseStudent;
		
		Course<? super Student> courseW = enw Couse<person>("a", 1);
	}

}
