package vehicles;

import carcomponents.Engine;
import carcomponents.FuelTank;
import carcomponents.Tyre;

import java.util.ArrayList;

public class Car extends Vehicle {

    FuelTank fuelTank;

    public Car(ArrayList<Tyre> tyres, Engine engine, FuelTank fuelTank) {
        super(tyres);
        this.fuelTank = fuelTank;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }
}
