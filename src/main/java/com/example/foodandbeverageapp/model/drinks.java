package com.example.foodandbeverageapp.model;

public class drinks {

    String drinksName;
    String drinksPrice;
    Integer drinksImageUrl;

    public drinks(String drinksName, String drinksPrice, Integer drinksImageUrl) {
        this.drinksName = drinksName;
        this.drinksPrice = drinksPrice;
        this.drinksImageUrl = drinksImageUrl;
    }

    public String getDrinksName() {
        return drinksName;
    }

    public void setDrinksName(String drinksName) {
        this.drinksName = drinksName;
    }

    public String getDrinksPrice() {
        return drinksPrice;
    }

    public void setDrinksPrice(String drinksPrice) {
        this.drinksPrice = drinksPrice;
    }

    public Integer getDrinksImageUrl() {
        return drinksImageUrl;
    }

    public void setDrinksImageUrl(Integer drinksImageUrl) {
        this.drinksImageUrl = drinksImageUrl;
    }
}
