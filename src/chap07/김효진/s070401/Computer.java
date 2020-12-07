package chap07.김효진.s070401;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

}
