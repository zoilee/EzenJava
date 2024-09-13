package myspring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myspring.entity.User;

@Service
public class UserService {
	
	//필드 
	@Autowired
	private List<User> users = new ArrayList<>();

	
	//메소드 유저생성, 유저생성, get
	public void addUser(User user) {
		users.add(user);
		System.out.println(user.getName() + "님이 추가 되었습니다.");
		System.out.println("--------------------------------");
		System.out.println();
	}
	public void removeUser(int id) {
		users.removeIf(user -> user.getId() == id);
		System.out.println("유저 아이디 " + id + "님이 삭제 되었습니다.");
		System.out.println("--------------------------------");
		System.out.println();		
	}
	
	public User getUser (int id) {
		return users.stream().filter(user->user.getId() == id).findFirst().orElse(null);


	}
	
	//전체출력
	public void listUser() {
		users.forEach(System.out::println);
		System.out.println("--------------------------------");
		System.out.println();		
		
		
	}
}
