package com.frontepic.designpatterns.strategy.drinkstrategies;

public class WaterDrinkStrategy implements IDrinkStrategy {

    @Override
    public void drink() {
        System.out.println("is drinking some water...");
    }

}
