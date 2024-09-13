

package userservice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myspring.service.UserService;

public class ViewExam {
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		UserService userService = (UserService) context.getBean("userService");
		
		userService.setupUser(1, "홍길동", "gildong@gildong.com");
		userService.setupUser(2, "임꺽정", "imgg@imgg.com");
		userService.setupUser(3, "르브론", "lebron@james.com");
		
		
		userService.listUser(); //목록 출력
		
		userService.removeUser(2); //유저 삭제
		
		
		System.out.println(userService.getUser(1)); //선택한 유저만 출력
		System.out.println("--------------------------------");
		System.out.println();		
		
		userService.listUser(); //목록 출력
		
	}
}
