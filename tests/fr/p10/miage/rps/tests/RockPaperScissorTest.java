package fr.p10.miage.rps.tests;

import fr.p10.miage.rps.model.RPSEnum;
import fr.p10.miage.rps.model.Result;
import fr.p10.miage.rps.model.RockPaperScissor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RockPaperScissorTest {
    private RockPaperScissor rps;

    @BeforeMethod
    public void setUp() throws Exception {
        this.rps = new RockPaperScissor();
    }
    @Parameters({"rock","scissor"})
    @Test
    public void testWinPlay(String p1, String p2){
        assertEquals(rps.Result_Play(RPSEnum.valueOf(p1),RPSEnum.valueOf(p2)), Result.WIN);
    }
    @Parameters({"rock", "rock"})
    @Test
    public void testTiePlay(String p1, String p2){
        assertEquals(rps.Result_Play(RPSEnum.valueOf(p1),RPSEnum.valueOf(p2)), Result.TIE);
    }
    @AfterMethod
    public void tearDown() throws Exception {
        this.rps = null;
    }
}