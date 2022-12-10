package in.nitish.ratingservices.services;

import java.util.List;

import in.nitish.ratingservices.entities.Rating;

public interface RatingServices {
	
	
	//create 
	
	Rating createRating(Rating rating);
	
	//get all Rating
	List<Rating> getAllRating();
	
	//get all By UserId
	
	List<Rating> getRatingByUserId(String userId);
	
	//get all By HotelId
	
	List<Rating> getRatingByHotelId(String hotelId);
	

}
