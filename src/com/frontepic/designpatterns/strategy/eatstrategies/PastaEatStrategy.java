package com.frontepic.designpatterns.strategy.eatstrategies;

public class PastaEatStrategy implements IEatStrategy {

    @Override
    public void eat() {
        System.out.println("is eating some pasta...");
    }

}
