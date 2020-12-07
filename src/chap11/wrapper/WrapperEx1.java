package chap11.wrapper;

public class WrapperEx1 {
	public static void main(String[] args) {
		//byte, short, int, long
		//float, double, char, boolean
		
		//Byte, Short, Integer, Long
		//Float, Double, Character, Boolean
		
		
		int i = 1;
		
		Integer in = Integer.ValueOf(i);
		
		method1(in);
	}
	
	public static viod method1(Object o) {
		System.out.println(o);
	}
}
