package chap14.lecture.api.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx1 {
	//매개값은 있고, 리턴값없음
	
	public static void main(String[] args) {
		Consumer<Integer> con1 = x -> System.out.println(x * 2);
		con1.accept(30);
		
		System.out.println("==========list foreach method==========");
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(70);
		list.add(77);
		list.add(11);
		list.add(33);
		
		
		list.forEach(con1);
		//forEach는 하나씩 꺼내서 메소드에 넣음
		
		
		list.forEach(con1);
		System.out.println("====list foreach2 ========");
		
		list.forEach(x -> System.out.println("items : " + x));
	}

}
