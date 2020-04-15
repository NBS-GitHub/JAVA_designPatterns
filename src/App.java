import com.frontepic.designpatterns.observer.observables.IThermometer;
import com.frontepic.designpatterns.observer.observables.Thermometer;
import com.frontepic.designpatterns.observer.observers.Display;
import com.frontepic.designpatterns.observer.observers.IDisplay;
import com.frontepic.designpatterns.strategy.codestrategies.ICodeStrategy;
import com.frontepic.designpatterns.strategy.codestrategies.JavaCodeStrategy;
import com.frontepic.designpatterns.strategy.codestrategies.PHPCodeStrategy;
import com.frontepic.designpatterns.strategy.codestrategies.PythonCodeStrategy;
import com.frontepic.designpatterns.strategy.drinkstrategies.CoffeeDrinkStrategy;
import com.frontepic.designpatterns.strategy.drinkstrategies.IDrinkStrategy;
import com.frontepic.designpatterns.strategy.drinkstrategies.TeaDrinkStrategy;
import com.frontepic.designpatterns.strategy.drinkstrategies.WaterDrinkStrategy;
import com.frontepic.designpatterns.strategy.eatstrategies.BurgerEatStrategy;
import com.frontepic.designpatterns.strategy.eatstrategies.IEatStrategy;
import com.frontepic.designpatterns.strategy.eatstrategies.PastaEatStrategy;
import com.frontepic.designpatterns.strategy.eatstrategies.PizzaEatStrategy;
import com.frontepic.designpatterns.strategy.people.IProgrammer;
import com.frontepic.designpatterns.strategy.people.Programmer;

public class App {

    public static void main(String[] args) {

//        STRATEGY PATTERN //////////////////////////////////////////////////////////////////

        System.out.println("--- STRATEGY PATTERN EXAMPLE:");

        //        Creating the code strategies
        ICodeStrategy javaCodeStrategy = new JavaCodeStrategy();
        ICodeStrategy pythonCodeStrategy = new PythonCodeStrategy();
        ICodeStrategy phpCodeStrategy = new PHPCodeStrategy();

//        Creating the eat strategies
        IEatStrategy pizzaEatStrategy = new PizzaEatStrategy();
        IEatStrategy pastaEatStrategy = new PastaEatStrategy();
        IEatStrategy burgerEatStrategy = new BurgerEatStrategy();

//        Creating the drink strategies
        IDrinkStrategy coffeeDrinkStrategy = new CoffeeDrinkStrategy();
        IDrinkStrategy teaDrinkStrategy = new TeaDrinkStrategy();
        IDrinkStrategy waterDrinkStrategy = new WaterDrinkStrategy();

//        Creating the programmers and calling their methods
        IProgrammer programmer1 = new Programmer("John", javaCodeStrategy, pastaEatStrategy, waterDrinkStrategy);
        programmer1.code();
        programmer1.eat();
        programmer1.drink();

        System.out.println();

        IProgrammer programmer2 = new Programmer("Susan", pythonCodeStrategy, burgerEatStrategy, coffeeDrinkStrategy);
        programmer2.code();
        programmer2.eat();
        programmer2.drink();

        System.out.println();

        IProgrammer programmer3 = new Programmer("Henry", phpCodeStrategy, pizzaEatStrategy, teaDrinkStrategy);
        programmer3.code();
        programmer3.eat();
        programmer2.drink();

        System.out.println();

//        OBSERVER PATTERN //////////////////////////////////////////////////////////////////

        System.out.println("--- OBSERVER PATTERN EXAMPLE:");

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
