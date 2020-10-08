package chap04.exercises;

public class exercise03 {
	public static void main(String[] args) {
		
		//1부터 100의 수 중 3의 배수의 총합
		
		int sum = 0;
		for (int i=3; i<=100; i+=3){
		sum += i;
			
		}
		System.out.println(sum);
	}
}
