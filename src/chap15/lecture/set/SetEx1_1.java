package chap15.lecture.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1_1 {
	public static void main(String[] args) {
		// 순서가 없고, 중복되지 않음
		Set<String> set = new HashSet<>();
		
		// 추가
		set.add("java");
		set.add("html");
		set.add("2");
		set.add("python");
		set.add("dbms");
		set.add("4");
		set.add(new String("java"));
		
		System.out.println(set.size());
		
		// 삭제
		set.remove("jquery");
		set.remove("html");
		System.out.println(set.size());
//		set.remove(new String("java"));
		System.out.println(set.size());
		
		// 검색(모두 탐색)
		System.out.println("=====Iterator");
		Iterator<String> iter = set.iterator();
		iter.hasNext();
		iter.next();
		
		while (iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
	}
}

