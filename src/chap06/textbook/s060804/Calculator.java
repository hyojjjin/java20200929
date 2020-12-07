package chap06.textbook.s060804;

public class Calculator {
	//정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형의 넓이
	double areaRectangle(double width, double height) { //메소드 이름은 같지만 파라미터의 갯수가 다름.
		return width * height;
	}
}
