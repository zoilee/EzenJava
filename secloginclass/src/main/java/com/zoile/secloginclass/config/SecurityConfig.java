package com.zoile.secloginclass.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	//사용자 인증 권한 설정
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("admin").password("{noop}1234").roles("ADMIN")
			.and()
			.withUser("user").password("{noop}1234").roles("USER");
	}
	//http 요청
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN")
			.antMatchers("/member/**").hasAnyRole("ADMIN, USER")
			.anyRequest().permitAll()
			.and()
			.formLogin()
			.defaultSuccessUrl("/") //로그인 성공 url
			.failureUrl("/login?error=error") //로그인 실패 url
			.and()
			.logout()
			.logoutSuccessUrl("/?logout=logout");
	}
	
	//비밀번호 암호화 설정 (실제 서비스에서는 BCryptPasswordEncoder 를 이용해야함), 현재는 암호화 없음
	@SuppressWarnings("deprecation")
	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}
	
}
