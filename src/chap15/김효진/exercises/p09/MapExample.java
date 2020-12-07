package chap15.김효진.exercises.p09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import chap13.textbook.exercises.p02.Container;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		// 작성 위치
		Set<Map.Entry<String, Integer>> entryset = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entryset.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer val = entry.getValue();

			totalScore += val;
			
			if(val > maxScore) {
				maxScore = val;
				name = key;

		}

		}	 
		System.out.println("평균 점수  : " + totalScore / map.size()); 
		System.out.println("최고 점수  : " + maxScore);
		System.out.println("최고 점수를 받은 아이디  : " + name);
	}

}
