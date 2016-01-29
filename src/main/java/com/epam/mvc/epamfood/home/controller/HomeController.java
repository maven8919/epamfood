package com.epam.mvc.epamfood.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.epam.mvc.epamfood.home.model.HomePageModel;

@Controller
public class HomeController {

    private static final String HOMEPAGE_LOGICAL_VIEW = "homePage";
    private static final String HOMEPAGE_REQUEST_MAPPING = "/";
    private static final String WELCOME_MESSAGE = "Welcom to epam buffet!";

    @ModelAttribute(value = "homepageModel")
    public HomePageModel welcomeMessage() {
        return new HomePageModel(WELCOME_MESSAGE);
    }
    
    @RequestMapping(HOMEPAGE_REQUEST_MAPPING)
    public String homePage() {
        return HOMEPAGE_LOGICAL_VIEW;
    }
    
}
