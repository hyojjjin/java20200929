package chap14.lecture.api.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ConsumerEx2 {
	public static void main(String[] args) {
		//람다식 이용한 방법
		
		Map<String, Integer> map = new HashMap<>();
		map.put("java", 9);
		map.put("html", 3);
		map.put("css", 5);
		map.put("jsp", 2);
		map.put("servlet", 4);
		map.put("jquery", 3);
		
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		
		System.out.println("======ket set 사용 ========");
		//예전에 사용했던 방법
		Set<String> keys = map.keySet();
		for(String key : keys ) {
			System.out.println(key + ":" + map.get(key));
		}
		
	}

}
