package in.nitish.hotelservices.services;

import java.util.List;

import in.nitish.hotelservices.entity.Hotel;

public interface HotelServices {
	
	//create
	
	Hotel createHotel(Hotel hotel);
	
	//getAll
	List<Hotel> getAllHotel();
	
	
	//getOne
	Hotel getoneHotel(String hotelId);

}
