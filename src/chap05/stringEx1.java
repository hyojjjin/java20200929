package chap05;

public class stringEx1 {
	public static void main(String[] args) {
		String str1 = "java";
		char c1 = str1.charAt(0);
		//charAt int 파라미터만 넣을 수 있음
				
		System.out.println(c1);
		System.out.println(str1.charAt(1));
		
		
		//equals
		String str2 = "python";
		String str3 = "python";
		String str4 = "py";
		String str5 = "thon";
		String str6 = str4 + str5;
		
		System.out.println(str2);
		System.out.println(str6);
		
		System.out.println(str2 == str6); //false가 나옴. ==가 문자열을 비교한 것이 아니기 때문
		System.out.println(str2.equals(str6));
		
		//insexOf
		
		
		//length
		String  str8 = "이것이 자바다.     java";
		int l = str8.length();
		System.out.println(l);
		System.out.println(str8.charAt(l-1));
		
		// substring
		String str11 = "0123456789"; //일부분을 뽑아내는 메소드
		String sub = str11.substring(2, 3); //2부터 3바로 전까지의 글자만 뽑음!
		System.out.println(sub);
		sub = str11.substring(5, str11.length());
	
		sub = str11.substring(6);
		System.out.println(sub);
		
		//trim
		String str12 = "java";
		str12.trim();
		System.out.println(t);
		System.out.println(str12);
		
		
}
}
