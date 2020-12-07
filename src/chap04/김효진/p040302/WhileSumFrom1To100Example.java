package chap04.김효진.p040302;

public class WhileSumFrom1To100Example {
	public static void main(String[] args) {
		
	//와일문으로 1부터 100까지 합 구하기
	
		int sum = 0;
		int i = 1;
		while(i < 101) {
			sum += i;
			i++;
			
		}
		System.out.println(sum);
	}
}
