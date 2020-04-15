package com.frontepic.designpatterns.strategy.people;

import com.frontepic.designpatterns.strategy.codestrategies.ICodeStrategy;
import com.frontepic.designpatterns.strategy.drinkstrategies.IDrinkStrategy;
import com.frontepic.designpatterns.strategy.eatstrategies.IEatStrategy;

public class Programmer implements IProgrammer {

    private String name;
    private ICodeStrategy codeStrategy;
    private IEatStrategy eatStrategy;
    private IDrinkStrategy drinkStrategy;

    public Programmer(String name, ICodeStrategy codeStrategy, IEatStrategy eatStrategy, IDrinkStrategy drinkStrategy) {
        this.name = name;
        this.codeStrategy = codeStrategy;
        this.eatStrategy = eatStrategy;
        this.drinkStrategy = drinkStrategy;
    }

    @Override
    public void code() {
        System.out.print(name + " ");
        codeStrategy.code();
    }

    @Override
    public void eat() {
        System.out.print(name + " ");
        eatStrategy.eat();
    }

    @Override
    public void drink() {
        System.out.print(name + " ");
        drinkStrategy.drink();
    }
}
