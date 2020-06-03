import carcomponents.Battery;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BatteryTest {

    Battery battery;

    @Before
    public void before(){
        battery = new Battery(8000);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(8000, battery.getCapacity(), 0.1);
    }
}
