package com.itb.mif3an.academicologin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itb.mif3an.academicologin.model.User;
import com.itb.mif3an.academicologin.web.dto.UserDto;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	User save(UserDto userDto);
	
}
