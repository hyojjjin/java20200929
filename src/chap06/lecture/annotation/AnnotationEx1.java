package chap06.lecture.annotation;

@MyAnnotation
public class AnnotationEx1 {
	@MyAnnotation
	private int i;
	
	// 주석들
	// annotation - 프로그램, 컴파일러, jbm?이 보라고 달아놓는 정보. => 실행에 영향을 미친다.
	// annotation - 메소드, 클래스, 생성자 등 어느 곳이든 사용할 수 있고, 여러개를 달아도됨.
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@MyAnnotation(value = "abc", number =  5, names = {"c", "b"})
	public static void mymethod() {
	}
}
