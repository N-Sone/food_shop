package com.lob.ndeeddelivery.service;

import com.lob.ndeeddelivery.model.Food;

import java.util.List;

public interface FoodService {

    Food save(Food food);
    void deleteById(Long id);
    List<Food> findAllFood();
}
