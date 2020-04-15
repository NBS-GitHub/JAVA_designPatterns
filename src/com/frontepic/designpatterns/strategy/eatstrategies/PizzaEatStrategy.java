package com.frontepic.designpatterns.strategy.eatstrategies;

public class PizzaEatStrategy implements IEatStrategy {

    @Override
    public void eat() {
        System.out.println("is eating pizza...");
    }

}
