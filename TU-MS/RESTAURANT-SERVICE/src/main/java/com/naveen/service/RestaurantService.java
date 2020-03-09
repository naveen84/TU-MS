package com.naveen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naveen.dao.RestaurantRepository;
import com.naveen.model.Menu;
import com.naveen.model.Restaurant;

@Service
public class RestaurantService {
	@Autowired
	private RestaurantRepository repo;
	
	public Restaurant save(Restaurant restaurant) {
		return repo.save(restaurant);
	}
	
	public List<Menu> getMenu(String restaurantName) {
		return repo.findByResName(restaurantName).getItems();
	}
}
