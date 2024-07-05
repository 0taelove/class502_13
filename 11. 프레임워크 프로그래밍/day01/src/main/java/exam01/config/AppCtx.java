package exam01.config;

import exam01.Greeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// @Import로 설정 클래스 포함
// @Import(value={AppCtx2.class})
// @Import({AppCtx2.class})
@Import(AppCtx2.class)
// 설정 클래스 - 스프링 컨테이너 관리할 객체를 정의, 설정
@Configuration
public class AppCtx {

    @Bean // 스프링이 관리할 객체임을 알려주는 애너테이션
    public Greeter greeter() {
        return new Greeter();
    }
}
