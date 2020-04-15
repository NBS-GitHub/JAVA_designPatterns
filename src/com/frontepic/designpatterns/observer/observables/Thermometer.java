package com.frontepic.designpatterns.observer.observables;

import com.frontepic.designpatterns.observer.observers.IDisplay;

import java.util.ArrayList;

public class Thermometer implements IThermometer {

    private ArrayList<IDisplay> displays = new ArrayList<>();
    private double temperature = 0;

    @Override
    public void addDisplay(IDisplay display) {
        displays.add(display);
    }

    @Override
    public void removeDisplay(IDisplay display) {
        displays.remove(display);
    }

    @Override
    public void notifyDisplays() {
        for (IDisplay display: displays) {
            display.update();
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double newTemperature) {
        if (newTemperature != this.temperature) {
            this.temperature = newTemperature;
            notifyDisplays();
        }
    }

}
