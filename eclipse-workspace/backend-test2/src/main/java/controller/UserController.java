package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;

import UserRepository.UserRepository;


	
@Controller
public class UserController {
		
	final UserRepository<User> userRepository = null;
		
	private List<User> data =  new ArrayList<User>();

	public List<User> getData() {
		return data;
	}

	public void setData(List<User> data) {
		this.data = data;
	} 
	


}
