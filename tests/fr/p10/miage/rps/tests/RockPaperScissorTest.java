package fr.p10.miage.rps.tests;

import fr.p10.miage.rps.model.RPSEnum;
import fr.p10.miage.rps.model.Result;
import fr.p10.miage.rps.model.RockPaperScissor;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class RockPaperScissorTest {
    private RockPaperScissor rps;

    @BeforeMethod
    public void setUp() throws Exception {
        this.rps = new RockPaperScissor();
    }

    @DataProvider(name = "winData")
    public Object[][] createDataRpsWin() {
        return new Object[][] {
                { RPSEnum.ROCK, RPSEnum.SCISSOR},
                { RPSEnum.SCISSOR, RPSEnum.PAPER},
                { RPSEnum.PAPER, RPSEnum.ROCK}
        };
    }
    @DataProvider(name = "looseData")
    public Object[][] createDataRpsLoose() {
        return new Object[][] {
                { RPSEnum.SCISSOR, RPSEnum.ROCK},
                { RPSEnum.PAPER, RPSEnum.SCISSOR},
                { RPSEnum.ROCK, RPSEnum.PAPER}
        };
    }

    @DataProvider(name = "tieData")
    public Object[][] createDataRpsTie() {
        return new Object[][] {
                { RPSEnum.SCISSOR, RPSEnum.SCISSOR},
                { RPSEnum.PAPER, RPSEnum.PAPER},
                { RPSEnum.ROCK, RPSEnum.ROCK}
        };
    }

/*
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
    @Parameters({"rock", "paper"})
    @Test
    public void testLostPlay(String p1, String p2){
        assertEquals(rps.Result_Play(RPSEnum.valueOf(p1),RPSEnum.valueOf(p2)), Result.LOST);
    }*/

    @Test(dataProvider = "winData")
    void testWinPlay(RPSEnum p1, RPSEnum p2){
        assertEquals(rps.Result_Play(p1,p2), Result.WIN);
    }

    @Test(dataProvider = "looseData")
    void testLostPlay(RPSEnum p1, RPSEnum p2){
        assertEquals(rps.Result_Play(p1,p2), Result.LOST);
    }

    @Test(dataProvider = "tieData")
    void testTiePlay(RPSEnum p1, RPSEnum p2){
        assertEquals(rps.Result_Play(p1,p2), Result.TIE);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        this.rps = null;
    }
}