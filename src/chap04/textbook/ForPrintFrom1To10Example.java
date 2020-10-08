package chap04.textbook;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		
	for(int i=1; i<=10; i++) {
		System.out.println(i);
	}
	
	//1. 11~20
	//2. 1~9 홀수만
	//3. 10~1
	//4. 10~2 짝수만
	
	
	//1.
	for(int i=11; i<=20; i++) {
		System.out.println(i);
	}
	
	//2.
	for(int i=1; i<=9; i+=2) {
		System.out.println(i);
	}
	
	//3.
	for(int i=10; i>=1; i--) {
		System.out.println(i);
	}

	//4.
	for(int i=10; i>=1; i-=2) {
		System.out.println(i);
	}
	
	
}
}
