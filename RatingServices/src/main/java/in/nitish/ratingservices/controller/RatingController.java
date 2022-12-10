package in.nitish.ratingservices.controller;

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

import in.nitish.ratingservices.entities.Rating;
import in.nitish.ratingservices.services.RatingServices;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@Autowired
	private RatingServices ratingServices;
	
	
	@PostMapping("/createrating")
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingServices.createRating(rating));
	}
	
	@GetMapping("/getallrating")
	public ResponseEntity<List<Rating>> getAllRating(){
		
		return ResponseEntity.ok(ratingServices.getAllRating());
	}
	
	@GetMapping("/user/getallratingbyuserid/{userId}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
		
		return ResponseEntity.ok(ratingServices.getRatingByUserId(userId));
	}
	
	@GetMapping("/hotel/getratingbyhotelid/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
		
		return ResponseEntity.ok(ratingServices.getRatingByHotelId(hotelId));
	}
	

}
