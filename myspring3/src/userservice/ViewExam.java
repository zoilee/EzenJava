

package userservice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import myspring.AppConfig;
import myspring.service.UserService;

public class ViewExam {
	public static void main(String[] args) {
		
		//Spring 건텍스트 로드
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		//bean 가져오기
		
		UserService userService = context.getBean(UserService.class);
				
		userService.listUser(); //목록 출력
		
		userService.removeUser(2); //유저 삭제
		
		
		System.out.println(userService.getUser(1)); //선택한 유저만 출력
		System.out.println("--------------------------------");
		System.out.println();		
		
		userService.listUser(); //목록 출력
		
	}
}
