package chap06.lecture.textbook.s060708;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator = myClac = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5,6);
		System.out.println("result1: " +result1);
		
		byte x = 10;
		vyte y = 4;
		double result2 = myCalc.divide(x,y);
		System.out.println("result2"+result2);
		
		myCalc.powerOff();
	}
}
