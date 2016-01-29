package com.epam.mvc.epamfood.home.model;

public class HomePageModel {
    private String welcomeMessage;

    public HomePageModel(String welcomeMessage) {
        super();
        this.welcomeMessage = welcomeMessage;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }
    
}
