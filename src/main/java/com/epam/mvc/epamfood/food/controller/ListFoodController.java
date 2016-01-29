package com.epam.mvc.epamfood.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.epam.mvc.epamfood.food.service.FoodSearchService;
import com.epam.mvc.epamfood.food.view.model.ListFoodModel;
import com.epam.mvc.epamfood.food.view.tranformer.FoodTransformer;

@Controller
public class ListFoodController {
    
    private static final String LIST_FOODS_MODEL_ATTRIBUTE = "listFoodModel";
    public static final String LIST_FOODS_REQUEST_MAPPING = "/foods.html";
    private FoodSearchService foodSearchService;
    private FoodTransformer foodTransformer;
    
    @Autowired
    public ListFoodController(FoodSearchService foodSearchService, FoodTransformer foodTransformer) {
        super();
        this.foodSearchService = foodSearchService;
        this.foodTransformer = foodTransformer;
    }
    
    @ModelAttribute(LIST_FOODS_MODEL_ATTRIBUTE)
    public ListFoodModel listFoodsModel() {
        ListFoodModel foodModel = new ListFoodModel();
        foodModel.setFoods(foodTransformer.transformFoods(foodSearchService.findAllBooks()));
        return foodModel;
    }

    @RequestMapping(value = LIST_FOODS_REQUEST_MAPPING)
    public String foods() {
        return "foods";
    }
}
