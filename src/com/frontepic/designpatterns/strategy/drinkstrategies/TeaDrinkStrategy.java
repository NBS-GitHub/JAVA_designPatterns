package com.frontepic.designpatterns.strategy.drinkstrategies;

public class TeaDrinkStrategy implements IDrinkStrategy {

    @Override
    public void drink() {
        System.out.println("is drinking some tea...");
    }

}
