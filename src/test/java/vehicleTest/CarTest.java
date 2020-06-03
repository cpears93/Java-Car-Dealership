package vehicleTest;

import carcomponents.Engine;
import carcomponents.FuelTank;
import carcomponents.PetrolEngine;
import carcomponents.Tyre;
import org.junit.Before;
import vehicles.Car;

import java.util.ArrayList;

public class CarTest {

    Car car;
    PetrolEngine petrolEngine;
    FuelTank fuelTank;
    ArrayList<Tyre> tyres;

    @Before
    public void Before(){
        tyres = new ArrayList<Tyre>();
        car = new Car(tyres, 700, 3000);
    }
}
