package com.example.demo.UserEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import com.example.demo.UserRepository.UserRepo;
import com.example.demo.UserController.UserController;


@Entity
public class UserEntity {
	public UserEntity(int id, double latitude, double longitude, boolean excluded, String name) {
		super();
		this.id = id;
		this.name= name;
		Latitude = latitude;
		Longitude = longitude;
		this.excluded = excluded;
	}
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private int id;
	private String name;
	private double Latitude;
	private double Longitude;
	private boolean excluded;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLatitude() {
		return Latitude;
	}
	public void setLatitude(double latitude) {
		Latitude = latitude;
	}
	public double getLongitude() {
		return Longitude;
	}
	public void setLongitude(double longitude) {
		Longitude = longitude;
	}
	public boolean isExcluded() {
		return excluded;
	}
	public void setExcluded(boolean excluded) {
		this.excluded = excluded;
	}
	

}
