package chap15.lecture.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		

		//순서가 없고, 중복되지 않음.
		Set<String> set = new HashSet<>();
		
		// 추가
		set.add("java");
		set.add("html");
			set.add("css");
		set.add("java");
		set.add(new String("java")); //중복. 교체 x
		
		System.out.println(set.size());
		
		
		//set에서 remove
		//set은 순서(인덱스)가 없음. 이름을 넣어야함.
		
		set.remove("jqurey");
		System.out.println(set.size());				
		set.remove(new String("html"));
		System.out.println(set.size());
		
		
		//검색 (모두 탐색)
		System.out.println("======향상된 for");
		for(String s : set) {
			System.out.println(s);
		}
		
		
		
		System.out.println("=======Iterator");
		Iterator<String> iter = set.iterator();
//		iter.hasNext();
//		iter.next(); - 바로 다음 것

		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
		
		
		System.out.println("=======Iterator");
		Iterator<String> iter2 = set.iterator();
//		iter.hasNext();
//		iter.next(); - 바로 다음 것

		while(iter2.hasNext()) {
			String s = iter2.next();
			System.out.println(s);
		}
				
	}
}
