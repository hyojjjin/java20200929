package chap05.김효진.p050501;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "김효진";
		String strVar2 = "김효진";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2은 문자열이 같다.");
		}
		
		String strVar3 = new String("김효진");
		String strVar4 = new String("김효진");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4은 문자열이 같다.");
		}
		
		
		if(strVar1 == strVar4) {
			System.out.println("strVar1과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar4는 참조가 다름");
		}
		
		if(strVar1.equals(strVar4)) {
			System.out.println("strVar1과 strVar5은 문자열이 같다.");
		}
	}
}
