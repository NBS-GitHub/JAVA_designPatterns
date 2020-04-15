import com.frontepic.designpatterns.observer.observables.IThermometer;
import com.frontepic.designpatterns.observer.observables.Thermometer;
import com.frontepic.designpatterns.observer.observers.Display;
import com.frontepic.designpatterns.observer.observers.IDisplay;

public class App {

    public static void main(String[] args) {


//        Create the observable
        IThermometer thermometer = new Thermometer();

//        Create the observers
        IDisplay phoneDisplay = new Display(thermometer, "Phone Display");
        IDisplay kitchenDisplay = new Display(thermometer, "Kitchen Display");

//        Add the observers to the observable
        thermometer.addDisplay(phoneDisplay);
        thermometer.addDisplay(kitchenDisplay);

//        Changing the data
        thermometer.setTemperature(12.5);
        System.out.println();
        thermometer.setTemperature(12.5);
        System.out.println();
        thermometer.setTemperature(12.8);
        System.out.println();

//        Delete an observer
        thermometer.removeDisplay(kitchenDisplay);

//        Changing the data
        thermometer.setTemperature(13.6);


    }

}
