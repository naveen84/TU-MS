package com.naveen.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.client.RestaurantServiceClient;
import com.naveen.model.RestaurantMenuResponse;

@RestController
public class UserResource {
	
	@Autowired
	private RestaurantServiceClient restaurantServiceClient;
	
	@GetMapping(path = "/user/{restaurant_name}")
	public List<RestaurantMenuResponse> getMenuByName(@PathVariable("restaurant_name") final String restaurantName){
		return restaurantServiceClient.getMenu(restaurantName);
	}
}
