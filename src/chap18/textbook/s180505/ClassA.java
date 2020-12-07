package chap18.textbook.s180505;

import java.io.Serializable;

public class ClassA implements Serializable{
	static final long serialVersionUID =1;
	//시리얼 번호. 버전 정보.
	
	int field1;
	ClassB field2 = new ClassB();
	//인스턴트 필드만 직렬화 가능
	
	static int field3;
	transient int field4;
	//인스턴트 필드 중 transient 는 안됨!


}
