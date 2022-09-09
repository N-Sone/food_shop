package com.lob.ndeeddelivery.repository;

import com.lob.ndeeddelivery.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
