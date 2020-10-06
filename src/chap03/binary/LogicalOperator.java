package chap03.binary;

public class LogicalOperator {
public static void main(String[] args) {
	//논리연산자
	//&& & and
	//|| | or
	// ^ xor (exclusive or, 배타적논리합) : 다를 떄만 true
	
	
	System.out.println("==== and ====");
	System.out.println(true && true);
	System.out.println(true && false);
	System.out.println(false && true);
	System.out.println(false && false);
	
	
	
	System.out.println("==== or ====");
	System.out.println(true || true);
	System.out.println(true || false);
	System.out.println(false || true);
	System.out.println(false || false);
	
	
	
	
	System.out.println("==== xor ====");
	System.out.println(true ^ true);
	System.out.println(true ^ false);
	System.out.println(false ^ true);
	System.out.println(false ^ false);
	
	
	
	System.out.println("==== &| ====");
	int a = 3;
	System.out.println(false & false);
	System.out.println(false & true);
	System.out.println((a < 0) & (a++ < 0));
	System.out.println(a);
	//앞이 펄스여도 뒤의 결과를 살핌.
	
	System.out.println("==== &&|| ====");
	System.out.println(false && false);
	System.out.println(false && true);
	System.out.println((a<0) && (a++ < 0));
	//앞이 펄스이면 뒤에가 펄스여도 상관안함.
	//앞에 true면 뒤에를 살펴야하는데 안봄
	
}
}
