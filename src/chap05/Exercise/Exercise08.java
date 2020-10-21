package chap05.Exercise;

public class Exercise08 {
	public static void main(String[] args) {
		//전체 항목의 합
		//평균값
		//중첩 for문 사용
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int cut = 0;
		
			
		for (int i=0; i < array.length; i++) {
			for(int k=0; k < array[i].length; k++) {
		//		System.out.println(array[i][k]);
				
				sum = sum + array[i][k];
				cut ++;
		
			}
			
		}
	//갯수 구하기
		//array[i]
		
//		int sum2 = 0;
//		for (int i=0; i < array.length; i++) {
			
//			sum2 += sum2 + array[i].length;
//			avg =  sum / sum2;
			
		}
				
	
		
		System.out.println("sum :" + sum);
		System.out.println("avg :" + avg);
	}
	
}
