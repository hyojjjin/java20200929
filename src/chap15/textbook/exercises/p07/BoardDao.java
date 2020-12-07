package chap15.textbook.exercises.p07;

import java.util.ArrayList;
import java.util.List;

	public class BoardDao {

		public List<Board> getBoardList() {
			List<Board> list = new ArrayList<>();
			
			list.add(new Board("제목1", "내용1"));
			list.add(new Board("제목2", "내용2"));
			list.add(new Board("제목3", "내용3"));
			
			return list;
		}
		
		
//		
//		
//		
//		public List<Board> get BoardList() {
//			List<Board> list = new ArrayList<>();
//			
//			list.add(new Board("제목1", "내용1"));
//		}
//		
//		
//		
		
		
//	Board<String> dao(T t, T a) {
//		t.add("제목1");
//		t.add("제목2");
//		t.add("제목3");
//
//		a.add("내용1");
//		a.add("내용2");
//		a.add("내용3");
//	}
	
	
}
