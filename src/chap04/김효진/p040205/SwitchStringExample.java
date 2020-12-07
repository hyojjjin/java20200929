package chap04.김효진.p040205;

public class SwitchStringExample {
	public static void main(String[] args) {
		//String 타입을 가진 Switch문

		String position = "과장";
		
		switch(position) {
			case "부장":
				System.out.println("700만");
				break;
				
			case "과장":
				System.out.println("500만");
				break;
				
			default:
				System.out.println("300만");
				
		}
	}
	
}
