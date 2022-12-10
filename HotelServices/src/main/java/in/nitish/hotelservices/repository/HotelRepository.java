package in.nitish.hotelservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nitish.hotelservices.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}
