import carcomponents.FuelTank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FuelTankTest {

    FuelTank fuelTank;

    @Before
    public void Before(){
        fuelTank = new FuelTank(3000);
    }

    @Test
    public void getCapacity(){
        assertEquals(3000, fuelTank.getCapacity(),0.1);
    }
}
