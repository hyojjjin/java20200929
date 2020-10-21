package chap09.lecture.anonymous;

public class MyApp {
	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.method1();
		
		Parent P2 = new Parent() {
			//아무것도 작성하지 않으면 parent에 있느 ㄴ것을 그대로 가져옴
		
		@Override
		public void method1() {
			System.out.println("anonymous method1");
		}
		};
		
		p2.method1();
		
		Parent p3 = new Parent();{
		//추상메소드가 있으면 에러남.
		};
		
	}
}
