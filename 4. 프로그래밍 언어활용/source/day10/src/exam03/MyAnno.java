package exam03;

import static java.lang.annotation.ElementType.*; // 사용시

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({TYPE, METHOD, FIELD}) // 정적인 상태의 ElementType 생략 가능
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno { // 추상 메서드 정의
    int min() default 10; // min 설정 항목, 기본값 10
    int max() default 100; // max 설정 항목, 기본값 100
    String[] names() default {"이름1"};
    String value();
}
