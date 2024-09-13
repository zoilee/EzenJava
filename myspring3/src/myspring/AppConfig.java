package myspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import myspring.entity.User;

@Configuration
@ComponentScan(basePackages = "myspring")
public class AppConfig {
	//반등록
	@Bean
	public User user1() {
		return new User(1, "홍길동", "gilding@gildong.com");
	}
}
