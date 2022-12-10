package in.nitish.ratingservices.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nitish.ratingservices.entities.Rating;
import in.nitish.ratingservices.repository.RatingRepository;
import in.nitish.ratingservices.services.RatingServices;


@Service
public class RatingServicesImpl implements RatingServices {

	@Autowired
	private RatingRepository ratingRepository;
	
	@Override
	public Rating createRating(Rating rating) {
		
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getAllRating() {
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		
		return ratingRepository.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		
		return ratingRepository.findByHotelId(hotelId);
	}

}
