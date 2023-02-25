package com.example.demo.domain.restaurant.dto;

import com.example.demo.domain.restaurant.domain.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
public class RestaurantResponseDto {
    private Long id;
    private String name;
    private String category;

    @Builder
    public RestaurantResponseDto(Restaurant restaurant){
        this.id=restaurant.getId();
        this.name=restaurant.getName();
        this.category= restaurant.getCategory();
    }
}
