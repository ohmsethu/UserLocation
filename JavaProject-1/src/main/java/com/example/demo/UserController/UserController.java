package com.example.demo.UserController;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.UserEntity.UserEntity;
import com.example.demo.UserRepository.UserRepo;

import jakarta.persistence.EntityNotFoundException;

@RestController
public class UserController {
	@Autowired
	private UserRepo rep;
	
	@PostMapping("User/create")
		public UserEntity user(@RequestBody UserEntity user) {
		 return rep.save(user);
	}
	@PatchMapping("User/update/{id}")
	public UserEntity update(@PathVariable int id,@RequestBody  UserEntity user) {
		UserEntity existingUserEntity = rep.findById(id)
			    .orElseThrow(() -> new EntityNotFoundException("User Entity not found"));
		  existingUserEntity.setName(user.getName());
	        existingUserEntity.setLatitude(user.getLatitude());
	        existingUserEntity.setLongitude(user.getLongitude());

	        return rep.save(existingUserEntity);
	}
	@GetMapping("User/get/")
	public List<UserEntity> userentity(@RequestBody UserEntity user) {
		return rep.findAll();
		}
	
	}
	



