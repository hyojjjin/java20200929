package chap14.lecture.api.predicate;

import java.util.ArrayList;
import java.util.List;

public class PredicateEx2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		supplier<Integer> random = () -> (int)(Math.random()*200)-50);
		
		for(int i = 0; i < 30; i++) {
			list.add(random.get());
		}
		System.out.println("----값 확인");
		list.forEach(e -> System.out.println(e));
		
		list.removeIf(
				if()
				
				);
		
		//0~100의 값만 남도록
		System.out.println("----값 확인");
		list.forEach(e -> System.out.println(e));

	}

}
