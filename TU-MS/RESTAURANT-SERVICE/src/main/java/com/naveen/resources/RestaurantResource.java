package com.naveen.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.model.Menu;
import com.naveen.model.Restaurant;
import com.naveen.service.RestaurantService;
import com.naveen.util.StringUtil;

@RestController
public class RestaurantResource {
	
	@Autowired
	private RestaurantService service;
	
	@RequestMapping("/restaurant")
	@PostMapping(consumes = "{application/json}",produces = "{application/json}")
	public Restaurant save(@RequestBody Restaurant restaurant) {
		System.out.println("INPUT : "+restaurant);
		service.save(restaurant);
		return restaurant;
	}
	
	@RequestMapping("/restaurant/{name}")
	@GetMapping
	public List<Menu> getMenuByRestaurantName(@PathVariable("name")String restaurantName) {
		return service.getMenu(restaurantName);
	}
}
