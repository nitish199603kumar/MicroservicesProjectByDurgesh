package in.nitish.userservice.service;

import java.util.List;

import in.nitish.userservice.entity.User;

public interface UserService {
	
	User createUser(User user);
	
	List<User> getAllUser();
	
	User getUser(String userId);

	
}
