

package userservice;

import myspring.entity.User;
import myspring.service.UserService;

public class ViewExam {
	public static void main(String[] args) {
		UserService userService = new UserService();
		
		User user1 = new User(1, "홍길동", "gildong@gildong.com");
		User user2 = new User(2, "임꺽정", "imgg@imgg.com");
		User user3 = new User(3, "르브론", "lebron@james.com");
		
		userService.addUser(user1);
		userService.addUser(user2);
		userService.addUser(user3);
		
		userService.listUser(); //목록 출력
		
		userService.removeUser(2); //유저 삭제
		
		
		System.out.println(userService.getUser(1)); //선택한 유저만 출력
		System.out.println("--------------------------------");
		System.out.println();		
		
		userService.listUser(); //목록 출력
		
	}
}
