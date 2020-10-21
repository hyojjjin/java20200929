package chap05.lecture;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayrgument num1 num2");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
	}
}
