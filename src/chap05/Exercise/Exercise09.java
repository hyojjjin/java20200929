package chap05.Exercise;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		//키보드로 학생수와 점수를 입력받아서
		//최고 점수 및 평균 점수를 구하는 프로그램
		
		boolean run = true;
		int studentNum = 0;//3
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("----------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				//학생수 입력
				//학생 수 나오기
				System.out.print("학생수 >");
		//		String a = scanner.nextLine();
		//		int a1 = Integer.valueOf(a);
				int a = scanner.nextInt();
				studentNum=a;
			
		//		System.out.println(studentNum); 이건 그저 값을 출력하는 용도, 위에 코드와는 관련이 없다.
				
			
			} else if(selectNo == 2) {
				System.out.print("점수입력 >");
				String b = scanner.nextLine();
				int b1 = Integer.valueOf(b);
			// 	scores+=b1;
				//값이 한개씩 추가가 되어야하는데??
						
			} else if(selectNo == 3) {
				System.out.print("점수리스트>");
				for(int i=0; i<studentNum; i++) {
					System.out.print("scores[" + i +" ] " + scores[i]);
				}
			
				
				//작성
				
			} else if(selectNo == 4) {
				
				System.out.print("분석 >");
				
				//최고 점수 구하기
				int max = 0;
				
				for(int i=0; i<studentNum;i++) {
				int max < int scores[i];
				int max;
				}
				

				
				
			
				int sum = 0;

				for(int i=0; i<studentNum; i++) {
					sum += scores[i]; }
				
				int avg = sum/studentNum;
				
				
				
				//1. 최고 점수
				//2. 평균 모든 점수의 합 나누기 학생수
				
				//작성
			} else if(selectNo == 5) {
				run = false;
			}
			
			
		}
		System.out.println("프로그램 종료");
	}
}
