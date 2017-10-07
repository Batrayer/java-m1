package fr.p10.miage.rps.tests;

import fr.p10.miage.rps.model.Result;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ResultTest {


    @Parameters({"lost"})
    @Test
    public void testGetResult(Result res) throws Exception {
        assertEquals(res.getResult(),Result.LOST.getResult());
    }
}
