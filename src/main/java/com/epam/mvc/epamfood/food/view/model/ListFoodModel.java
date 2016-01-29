package com.epam.mvc.epamfood.food.view.model;

import java.util.List;

public class ListFoodModel {

    private List<FoodSummaryView> foods;

    public List<FoodSummaryView> getFoods() {
        return foods;
    }

    public void setFoods(List<FoodSummaryView> foods) {
        this.foods = foods;
    }
    
}
