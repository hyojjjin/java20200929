package chap15.김효진.s150504;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		
		  TreeSet<Person> treeSet = new TreeSet<Person>();
		  
		  treeSet.add(new Person("홍길동", 45)); treeSet.add(new Person("김효진", 25));
		  treeSet.add(new Person("박지원", 31));
		  
		  Iterator<Person> iterator = treeSet.iterator(); while (iterator.hasNext()) {
		  Person person = iterator.next(); System.out.println(person.name + ":" +
		  person.age); }
		  
		 

	}

}
