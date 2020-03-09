package com.naveen.client;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonAutoConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.naveen.model.RestaurantMenuResponse;

@FeignClient(name="RESTAURANT-SERVICE")
@RibbonClient(name="RESTAURANT-SERVICE",configuration = RibbonAutoConfiguration.class)
public interface RestaurantServiceClient {
	
	@GetMapping("/restaurant/{name}")
	public List<RestaurantMenuResponse> getMenu(@PathVariable("name")final String restaruantName);
		
}
