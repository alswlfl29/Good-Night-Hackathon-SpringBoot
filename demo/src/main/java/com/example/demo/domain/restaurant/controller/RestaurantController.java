package com.example.demo.domain.restaurant.controller;

import com.example.demo.domain.restaurant.domain.Restaurant;
import com.example.demo.domain.restaurant.dto.RestaurantCreateRequestDto;
import com.example.demo.domain.restaurant.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/restaurants")
@RequiredArgsConstructor
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;
    RestaurantController(RestaurantService restaurantService){
        this.restaurantService=restaurantService;
    }

    @GetMapping(value="/register")
    @ResponseBody
    public List<Restaurant> getRestaurant(){
        return restaurantService.readAllRestaurant();
    }

    @GetMapping(value = "/register/{id}")
    @ResponseBody
    public Restaurant getRestaurant(@PathVariable("id")Long id){
        return restaurantService.readRestaurant(id);
    }
    @PostMapping(value="/register")
    @ResponseBody
    public Restaurant registerRestaurant(@RequestBody RestaurantCreateRequestDto restaurantCreateRequestDto){
        System.out.println(restaurantCreateRequestDto);
        return restaurantService.register(restaurantCreateRequestDto);
    }
}
