package com.frontepic.designpatterns.observer.observers;

import com.frontepic.designpatterns.observer.observables.IThermometer;

public class Display implements IDisplay {

    private IThermometer thermometer;
    private String displayName;
    private double temperature;

    public Display(IThermometer thermometer, String displayName) {
        this.thermometer = thermometer;
        this.displayName = displayName;
    }

    @Override
    public void update() {
        temperature = thermometer.getTemperature();
        display();
    }

    @Override
    public void display() {
        System.out.println(displayName + ": The current temperature is: " + temperature + ". ");
    }
}
