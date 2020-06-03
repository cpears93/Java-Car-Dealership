package vehicles;

import carcomponents.Battery;
import carcomponents.Engine;
import carcomponents.Tyre;

import java.util.ArrayList;

public class ElectricCar extends Vehicle{

    Battery battery;

    public ElectricCar(ArrayList<Tyre> tyres, Engine engine, Battery battery) {
        super(tyres, engine);
        this.battery = battery;
    }

    public Battery getBattery() {
        return battery;
    }
}
