package com.frontepic.designpatterns.strategy.eatstrategies;

public class BurgerEatStrategy implements IEatStrategy {

    @Override
    public void eat() {
        System.out.println("is eating a burger...");
    }

}
