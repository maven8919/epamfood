package com.epam.mvc.epamfood.food.view.tranformer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.epam.mvc.epamfood.food.domain.Food;
import com.epam.mvc.epamfood.food.view.model.FoodSummaryView;

@Component
public class FoodTransformer {
    private static final String ORDER_FOOD_URL = "/orderFood.html";
    private static final String BOOK_QUERY_URL_PATTERN = "%s?foodId=%d";

    public List<FoodSummaryView> transformFoods(List<Food> foods) {
        List<FoodSummaryView> result = new ArrayList<>();
        for (Food food : foods) {
            result.add(transformFood(food));
        }
        return result;
    }

    public FoodSummaryView transformFood(Food food) {
        FoodSummaryView result = new FoodSummaryView();
        result.setName(food.getName());
        result.setDescription(food.getDescription());
        result.setOrderUrl(String.format(BOOK_QUERY_URL_PATTERN, ORDER_FOOD_URL, food.getId()));
        return result;
    }

}
