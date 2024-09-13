package myspring.service;

import java.util.ArrayList;
import java.util.List;

import myspring.entity.User;

public class UserService {
	
	//필드 
	private List<User> users = new ArrayList<>();
	private User user;
	
	public void setUser(User user) {
		this.user = user;
	}
	
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
	
	public void setupUser(int id, String name, String email) {
		user.setId(id);
		user.setName(name);
		user.setEmail(email);
		addUser(user);
	}


}
