package com.example.demo.domain.restaurant.service;

import com.example.demo.domain.restaurant.dao.RestaurantRepository;
import com.example.demo.domain.restaurant.domain.Restaurant;
import com.example.demo.domain.restaurant.dto.RestaurantCreateRequestDto;
import com.example.demo.domain.restaurant.dto.RestaurantResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;
    @Transactional
    public Restaurant register(RestaurantCreateRequestDto restaurantCreateRequestDto){
        Restaurant restaurant = restaurantCreateRequestDto.toEntity();
        return restaurantRepository.save(restaurant);
    }

    @Transactional
    public Restaurant readRestaurant(Long id){
        return restaurantRepository.findById(id).get();
    }

    @Transactional
    public List<Restaurant> readAllRestaurant(){
        return restaurantRepository.findAll();
    }


}
