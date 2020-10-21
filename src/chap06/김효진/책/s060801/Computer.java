package chap06.김효진.책.s060801;

public class Computer {
	//매개 변수의 수를 모를 경우
	//1. 배열 [] 사용, 2. ...사용
	
	int sum1(int[] values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}
	
	int sum2(int ... values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
		sum += values[i];
	}
	return sum;

	}
}