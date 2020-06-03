package vehicles;

import carcomponents.Battery;
import carcomponents.Engine;
import carcomponents.FuelTank;
import carcomponents.Tyre;

import java.util.ArrayList;

public class HybridCar extends Vehicle{

    FuelTank fueltank;
    Battery battery;

    public HybridCar(ArrayList<Tyre> tyres, Engine engine, FuelTank fueltank, Battery battery) {
        super(tyres, engine);
        this.fueltank = fueltank;
        this.battery = battery;
    }

    public FuelTank getFueltank() {
        return fueltank;
    }

    public Battery getBattery() {
        return battery;
    }
}
