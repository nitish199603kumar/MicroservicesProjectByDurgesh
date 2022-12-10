package in.nitish.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nitish.userservice.entity.User;
import in.nitish.userservice.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/createuser")
	public ResponseEntity<User> createUser(@RequestBody User user)
	{
		
		User createUser = userService.createUser(user);
	//	return new ResponseEntity<User>(createUser,HttpStatus.OK);
		return ResponseEntity.status(HttpStatus.CREATED).body(createUser);
	}
	
	@GetMapping("/userid/{userId}")
	public ResponseEntity<User> getSingleUser(@PathVariable String userId)
	{
		User user = this.userService.getUser(userId);
		return ResponseEntity.ok(user);
	}
	
	@GetMapping("/alluser")
	public ResponseEntity<List<User>> getAllUser()
	{
		List<User> allUser = userService.getAllUser();
		
		return ResponseEntity.ok(allUser);
		
	}

}
