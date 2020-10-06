package chap03.binary;

public class BitOperator {
public static void main(String[] args) {
	// ~ 반전(단항)
	int i = 10;
	int j = ~i;
	System.out.println(j);
	
	//이상
	//& and : 같은 자리의 bit가 1인 경우만 1, 나머지 0
	//| or : 같은 자리의 bit가 0인 경우에만 0, 나머지 1
	//^ xor : 같은 자리의 bit가 다를 경우 1, 같으면 0
	//피연산자 : integer
	//결과 : integer
	
	int a = 45; //0010 1101
	int b = 25; //0001 1001
	
	int c = a & b; //0000 1001 => 9
	System.out.println(c);

	c = a | b; //0011 1101 => 61
	System.out.println(c);
	
	c = a ^ b; //0011 0100 => 52
	System.out.println(c);
	
	
	// bit shift 연산자
	// << : 각 bit를 왼쪽으로 옮김, 오른쪽은 0으로 채움.
	// >> : 각 bit를 오른쪽으로 옮김, 왼쪽은 msb(Most Significant Bit) 최상위 비트(가장 왼쪽에 있는 비트)로 채움. 한칸씩 미뤄지면서 왼쪽 끝에 빈 공간은 바로 최상위 비트로 채워짐.
	// >>> : 각 bit를 오른쪽으로 옮김, 왼쪽은 0으로 채움.
	
	int val = 1;
	int res = val <<1; //왼쪽 시프트 1은 곱하기 2
	System.out.println(res);
	
	
	val = 16;
	res = val >> 1;
	System.out.println(res);
	
	
	val = -17;
	res = val >> 1;
	System.out.println(res);
	
	
	val = 98;
	res = val >>> 2;
	System.out.println(res);
	
	val = -17;
	res = val >>> 1;
	System.out.println(res);
}
}
