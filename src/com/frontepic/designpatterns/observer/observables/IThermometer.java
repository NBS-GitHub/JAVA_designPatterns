package com.frontepic.designpatterns.observer.observables;

import com.frontepic.designpatterns.observer.observers.IDisplay;

public interface IThermometer {
    void addDisplay(IDisplay display);
    void removeDisplay(IDisplay display);
    void notifyDisplays();
    double getTemperature();
    void setTemperature(double newTemperature);
}
