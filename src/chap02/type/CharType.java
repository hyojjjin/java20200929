package chap02.type;

public class CharType {
	public static void main(String[] args) {
		//char : 2byte
		//작은 따옴표를 이용해 하나의 문자를 표현
		
		char charValue;
		charValue = 'a';
		System.out.println(charValue);
		
//		charValue = 'ab';
//		charValue = ''; //빈 문자열도 가질 수 없음.
		charValue = ' '; //스페이스도 문자로 인식. 가능
		
		charValue = 44032;
		System.out.println(charValue);
		
		charValue = '나';
		System.out.println(charValue);
		
		charValue = '\uac00';
		//코드값을 16진법으로 변환
		System.out.println(charValue);
		
	}
}
