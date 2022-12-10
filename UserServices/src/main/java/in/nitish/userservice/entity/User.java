package in.nitish.userservice.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


import in.nitish.userservice.payload.Rating;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
@Setter
@Getter
@Builder
public class User {
	
	@Id
	private String userId;
	private String name;
	private String email;
	private String about;
	
	@Transient
	//private List<Rating> rating; //we will get null in response
	
	private List<Rating> rating = new ArrayList<>();
	

}
