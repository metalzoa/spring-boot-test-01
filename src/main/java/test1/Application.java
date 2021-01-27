package test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

// 아래 3개가 위에 SpringBootApplication 하나의 설정에 모두 포함된 상태
//@SpringBootConfiguration // 일반 @Configuration 과 거의 동일
//@ComponentScan  // 1단계 빈 등록
//@EnableAutoConfiguration // 2단계 빈등록, 서블릿 설정을 이곳에서 하게됨
public class Application {
    public static void main(String[] args) {
//        SpringApplication.run( Application.class, args);
        // 또는 아래 처럼 setWebApplicationType 통해서
        // (web app 가 아닌 즉 서블릿이 아닌 모드로 실행도 가능
        SpringApplication application = new SpringApplication((Application.class));
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }
}
