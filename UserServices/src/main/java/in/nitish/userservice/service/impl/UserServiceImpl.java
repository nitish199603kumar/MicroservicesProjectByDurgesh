package in.nitish.userservice.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nitish.userservice.entity.User;
import in.nitish.userservice.exception.ResourceNotFoundException;
import in.nitish.userservice.repository.UserRepository;
import in.nitish.userservice.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	

	@Override
	public User createUser(User user) {
		String randomUserId = UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		
		return this.userRepository.save(user)
				;
	}

	@Override
	public List<User> getAllUser() {
		
		
		return this.userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		
		return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User with given id is not found on server" +userId));
	}

}
