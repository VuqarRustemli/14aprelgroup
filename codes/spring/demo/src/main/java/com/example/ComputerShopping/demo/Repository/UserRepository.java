package com.example.ComputerShopping.demo.Repository;

import java.util.Optional;   

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ComputerShopping.demo.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> existsByUsername(String username);
	
    @Query(value = "SELECT COUNT(*) FROM users", nativeQuery = true)
    long countAllUsers();

    @Query("SELECT COUNT(u) FROM User u")
    Long countAllUsers1();

    @Query("SELECT u FROM User u WHERE u.email = :email")
    Optional<User> findByEmail(@Param("email") String email);
    
	Optional<User> findByUsername(String username);

	boolean existsByEmail(String email);	
}