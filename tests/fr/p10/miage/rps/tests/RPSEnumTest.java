package fr.p10.miage.rps.tests;

import fr.p10.miage.rps.model.RPSEnum;
import fr.p10.miage.rps.model.Result;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RPSEnumTest {


    @Parameters({"rock"})
    @Test
    public void testGetChoix(RPSEnum rps) throws Exception {
        assertEquals(rps.getChoix(),"Rock");
    }
}
