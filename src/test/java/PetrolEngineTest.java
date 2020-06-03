import carcomponents.PetrolEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolEngineTest {

    PetrolEngine petrolEngine;

    @Before
    public void Before(){
        petrolEngine = new PetrolEngine(845);
    }

    @Test
    public void getHorsePower(){
        assertEquals(845, petrolEngine.getHorsePower(), 0.1);
    }
}
