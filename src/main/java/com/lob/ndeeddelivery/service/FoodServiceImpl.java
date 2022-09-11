package com.lob.ndeeddelivery.service;

import com.lob.ndeeddelivery.model.Food;
import com.lob.ndeeddelivery.repository.FoodRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    private  final FoodRepository foodRepository;

    public FoodServiceImpl(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @Override
    public Food save(Food food) {
        food.setTimeCreated(LocalDateTime.now());
        return foodRepository.save(food);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        foodRepository.deleteById(id);
    }

    @Override
    public List<Food> findAllFood() {
        return foodRepository.findAll();
    }
}
