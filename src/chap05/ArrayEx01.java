package chap05;

public class ArrayEx01 {
		public static void main(String[] args) {
			int i1 = 30;
			int i2 = 50;
			int i3 = 20;
			int i4 = 70;
			
			int[] arr1; //배열 선언하기 배열은 참조 타입
			arr1 = new int[3]; //배열의 길이
			System.out.println(arr1[0]);
			System.out.println(arr1[1]);
			System.out.println(arr1[2]);
//			System.out.println(arr1[3]); 배열의 길이를 넘은 것들 참조하면 오류가남.
			
			arr1[0] = 99;
			arr1[1] = 88;
			arr1[2] = 77;
			
			System.out.println(arr1[0]);
			System.out.println(arr1[1]);
			System.out.println(arr1[2]);
			
			int[] arr2;
			arr2 = arr1; //서로 같은 인스턴트가 있음.
			arr2[0] = 55; //인스턴트를 바꿔줌.
			System.out.println(arr2[0]);
			System.out.println(arr1[0]); //arr2의 인스턴트를 바꿔쭸는데, 값이 같게 나옴. 서로 같은 것을 참조하기 때문.
		}
}
