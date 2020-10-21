package chap05.lecture;

public class MatrixArrayEx01 {
	public static void main(String[] args) {
		int[][] matrix = new int[3][2];
		//int[][] int배열을 저정하는 int
		
		int[] arr = new int[3];
		System.out.println(arr.length);
		
		System.out.println(matrix[0].length);
		System.out.println(matrix[1].length);
		System.out.println(matrix[2].length);
//		System.out.println(matrix[3].length); 값이 없음
		
		arr[0] = 99;
		arr[1] = 88;
		arr[2] = 77;
		
		matrix[0][0] = 9; //첫번째 데이터의 첫번째 값
		matrix[2][0] = 1; //세번째 데이터의 첫번째 값
		
//		matrix[2][2] = 2; 없음		
//		matrix[3][0] = 3; 없음
		
	}
	
}
