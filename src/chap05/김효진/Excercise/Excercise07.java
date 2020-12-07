package chap05.김효진.Excercise;

public class Excercise07 {
	public static void main(String[] args) {
		//주어진 배열의 항목에서 최대값 구하기 for문이용
		
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i=0; i<array.length; i++){
			if(max<array[i])
			max = array[i];	
			}
		
		//작성 위치
		
		System.out.println("max : " + max);
	}
}
