package chap05.김효진.Excercise;

public class Exercise08 {
	public static void main(String[] args) {
		//배열의 전체 항목의 합과 평균. 중첩 for문 사용
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int cnt = 0;
		for(int i = 0; i<array.length; i++) {
			for(int a : array[i]) {
				sum += a;
				cnt++;
			}
		}
		
		avg = (double) sum/cnt;
		//작성 위치
		
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
	}
}
