package chap15.김효진.s150401;

import java.util.*;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		//학번과 이름이 같게 저장
		
		System.out.println("총 Entry 수 : " + map.size());
		
	}
}
