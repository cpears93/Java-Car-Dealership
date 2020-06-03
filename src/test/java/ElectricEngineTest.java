import carcomponents.ElectricEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricEngineTest {

    ElectricEngine electricEngine;

    @Before
    public void Before(){
        electricEngine = new ElectricEngine(700);
    }

    @Test
    public void getHorsePower(){
        assertEquals(700, electricEngine.getHorsePower(), 0.1);
    }
}
