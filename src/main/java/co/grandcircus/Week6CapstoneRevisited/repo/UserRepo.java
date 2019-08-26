package co.grandcircus.Week6CapstoneRevisited.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import co.grandcircus.Week6CapstoneRevisited.Entity.User;



public interface UserRepo extends JpaRepository<User, Integer> {
	
	

}
	