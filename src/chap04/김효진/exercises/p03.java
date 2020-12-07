package chap04.김효진.exercises;

public class p03 {
	public static void main(String[] args) {
		//for문을 이용해서
		//1부터 100까지 정수 중에서
		//3의 배수의 총합을 구하기
		
		int sum = 0;
		for(int i = 0; i<101; i++) {
			if(i%3 != 0) {
				continue;
			}
			
			sum += i;
		}
		System.out.println(sum);
		
	}
}
