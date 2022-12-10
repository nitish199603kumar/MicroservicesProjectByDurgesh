package in.nitish.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nitish.userservice.entity.User;

public interface UserRepository extends JpaRepository<User,String> {

}
