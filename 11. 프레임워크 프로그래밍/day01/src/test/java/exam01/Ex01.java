package exam01;

import exam01.config.AppCtx;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {

    // 스프링 컨테이너의 매개변수 class Class
    @Test
    void test1() {
        // AnnotationConfigApplicationContext 애노테이션을 갖고 설정하는 스프링 컨테이너라는 의미
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class); // 스프링 컨테이너 객체

        Greeter g1 = ctx.getBean("greeter", Greeter.class);
        g1.hello("이이름"); // 생성된 객체를 꺼내옴

        Greeter g2 = ctx.getBean("greeter", Greeter.class);
        g2.hello("김이름");

        // 기능을 처리하는 게 주이기 때문에 싱글톤 객체 형태로 관리
        System.out.println(g1 == g2); // 주소 비교 -> 싱글톤 패턴 의미

        ctx.close(); // 스프링 컨테이너 객체 소멸시킬 때 사용
    }

    @Test
    void test2() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        // 싱글톤으로 기본 관리하므로 객체가 한 개만 있는 경우가 많다
        // Class 클래스만 있어도 찾는다.
        Greeter g1 = ctx.getBean(Greeter.class);
        g1.hello("이이름");

        ctx.close();
    }
}
