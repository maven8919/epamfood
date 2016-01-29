package com.epam.mvc.epamfood.food.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.mvc.epamfood.food.domain.Food;
import com.epam.mvc.epamfood.food.repository.FoodDao;
import com.epam.mvc.epamfood.food.service.transformer.FoodEntityTransformer;

@Service
public class FoodSearchService {

    private FoodDao foodDao;
    private FoodEntityTransformer foodEntityTransformer;
    
    @Autowired
    public FoodSearchService(FoodDao foodDao, FoodEntityTransformer foodEntityTransformer) {
        super();
        this.foodDao = foodDao;
        this.foodEntityTransformer = foodEntityTransformer;
    }
    
    public List<Food> findAllBooks() {
        return foodEntityTransformer.transformUserEntities(foodDao.findAll());
    }
    
}
