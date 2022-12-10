package in.nitish.hotelservices.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nitish.hotelservices.entity.Hotel;
import in.nitish.hotelservices.exception.ResourceNotFoundException;
import in.nitish.hotelservices.repository.HotelRepository;
import in.nitish.hotelservices.services.HotelServices;

@Service
public class HotelServicesImpl implements HotelServices {

	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel createHotel(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setId(hotelId);
		
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel() {
		
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getoneHotel(String hotelId) {
		
		return hotelRepository.findById(hotelId).orElseThrow(()->new ResourceNotFoundException("Hotel with given id is not found !!"));
		
	}
	
	
}
