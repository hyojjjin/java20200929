package chap06.김효진.s061504;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target ({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

public @interface PrintAnnotation {
	//어노테이션 정의
	//Target은 메소드에만 적용
	//Retention은 런타임 시까지 어노테이션 정보를 유지
	
		String value() default "-";
		int number() default 15;
}
