package com.example.demo.domain.restaurant.dto;

import com.example.demo.domain.restaurant.domain.Restaurant;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RestaurantCreateRequestDto {
    private String name;
    private String category;

    public Restaurant toEntity(){
        Restaurant restaurant = Restaurant.builder()
                .name(name)
                .category(category)
                .build();
        return restaurant;
    }

    @Builder
    public RestaurantCreateRequestDto(String name, String category){
        this.name=name;
        this.category=category;
    }
}
