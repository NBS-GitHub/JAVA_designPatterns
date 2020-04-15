package com.frontepic.designpatterns.strategy.drinkstrategies;

public class CoffeeDrinkStrategy implements IDrinkStrategy {

    @Override
    public void drink() {
        System.out.println("is drinking some coffee...");
    }

}
