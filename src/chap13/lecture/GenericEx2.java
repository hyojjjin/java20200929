package chap13.lecture;

public class GenericEx2 {
	public static void main(String[] args) {
		MyClass2<Number> o1 = new MyClass2<>();
		MyClass2<Integer> o2 = new MyClass2<>();
//		MyClass2<Object> o3 = new MyClass2<>(); //넘버의 하위클래스만 가능하게 설정했어서. 오브젝트는 안됨.
	}
}
