package chap14.lecture.api.function;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class FunctionEx3 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap14/lecture/api/function/FunctionEx3.java";
		FileReader fr = new FileReader(path);
				
		Map<Character, Integer> map = new HashMap<>();
		
		int ch;
		
		while ((ch = fr.read()) != 1 ) {
			if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
				char c = (char) ch;
				System.out.println(c);
				
//				int cnt[i] = 0;
//				for(int i = 0; i < 총개수; i++) {
//					for( int j = 0; i< 총개수; i++) {
//						
			
//					if	(char(i).equals(char(j))) {
//						cnt[i] ++;
//					} return null;
//						
//					}
//				}
//				
//				Map<Character, Integer> map = (ch, cnt) -> {cnt == 0 ? null : cnt[i]};
//				
//				
//				System.out.println(map);
				
				//총갯수 구하기
				//글자 찾기
			
				
				
				map.compute(c, (k, v)-> v == null? 1: v+1);
				map.compute(c, (k, v) -> v);
			}
		}
		
		map.forEach((k, v) -> System.out.println(k + ":"+ v));
		
		
		
		
		fr.close();
	}

}
