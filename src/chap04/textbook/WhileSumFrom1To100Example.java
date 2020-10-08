package chap04.textbook;

public class WhileSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		
		int i =1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + "합 : " + sum); //(i-1) 펄스되서 나올 떄 i는 101값으로 나온다.
		}
	}
}
