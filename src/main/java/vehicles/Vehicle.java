package vehicles;

import carcomponents.Engine;
import carcomponents.Tyre;

import java.util.ArrayList;

public abstract class Vehicle {

    ArrayList<Tyre> tyres;
    Engine engine;

    public Vehicle() {
        this.tyres = new ArrayList<Tyre>();
    }

    public ArrayList<Tyre> getTyres() {
        return tyres;
    }

    public Engine getEngine() {
        return engine;
    }
}
