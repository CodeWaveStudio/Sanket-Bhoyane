package com.api.demo.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.api.demo.model.User;

@Service
public class UserService {

	public static List<User> list=new ArrayList<>();
	
	static {
		list.add(new User(123,"Pratiksha","Pune"));
		list.add(new User(124,"Chanku","Kothrud"));
		list.add(new User(125,"Maari","World"));
	}
	public List<User> getAllUser(){
		return list;
	}
	public User getUser(int id) {
		
		for(User user1:list)
			if(id==user1.getUserId()) {
				
				return user1;
			}
	
		return null;
		
	}
	public User saveUser(User user) {
		//User user=new User();
		list.add(user);
		return user;
	}
	
	public User editUser(int id,User user) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getUserId()==id) {
				list.set(i, user);
				return user;
			}
		}
		return null;
	}
		
	
}
