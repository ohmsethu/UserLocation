package com.example.demo.UserRepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.UserEntity.UserEntity;

@Repository
 public interface UserRepo extends JpaRepository<UserEntity,Integer>{
	 
}