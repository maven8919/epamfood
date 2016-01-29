package com.epam.mvc.epamfood.food.service.transformer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.epam.mvc.epamfood.food.domain.Food;
import com.epam.mvc.epamfood.food.repository.FoodEntity;

@Component
public class FoodEntityTransformer {

    public List<Food> transformUserEntities(Iterable<FoodEntity> foodEntities) {
        List<Food> result = new ArrayList<>();
        for (FoodEntity foodEntity : foodEntities) {
            result.add(tranformUserEntity(foodEntity));
        }
        return result;
    }

    public Food tranformUserEntity(FoodEntity foodEntity) {
        Food result = new Food();
        result.setId(foodEntity.getId());
        result.setName(foodEntity.getName());
        result.setDescription(foodEntity.getDescription());
        return result;
    }

}
