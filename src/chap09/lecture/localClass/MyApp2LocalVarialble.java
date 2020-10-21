package chap09.lecture.localClass;

public class MyApp2LocalVarialble {
	public static void main(String[] args) {
		int i = 1;
		
		class LocalClass {
			void method1() {
				System.out.println(i);
				System.out.println(args);
				//안쪽에서 사용이되면 암묵적으로 final 
				
//				i += 1;
	
				//로컬 클래스 내부에서 메소드에 있는 값은 변경 불가.
			}
		}
		args = new String[3];
		
//		i +=1;
		//밖에서도 안됨. 값을 두번 넣는 것은 안됨.
		//암묵적으로 final
	}

}
