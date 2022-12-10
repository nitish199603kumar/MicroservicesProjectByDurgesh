package in.nitish.ratingservices.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.nitish.ratingservices.entities.Rating;

public interface RatingRepository extends MongoRepository<Rating, String> {
	
	List<Rating> findByHotelId(String hotelId);
	List<Rating> findByUserId(String userId);

}
