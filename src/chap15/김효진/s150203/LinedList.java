package chap15.김효진.s150203;

import java.util.LinkedList;
import java.util.List;

public class LinedList {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>(); 
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1, 5);
		System.out.println("index: " + list.get(1));
		//System.out.println("index: " + list[0]);
		
		list.forEach(x -> System.out.println(x));
		System.out.println("---------");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
