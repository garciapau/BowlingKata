package pau.garcia.kata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {
    private BowlingGame bowlingGame;

    @Before
    public void setUp() throws Exception {
        bowlingGame = new BowlingGame();
    }

    @Test
    public void whenNoScoresReturnsZero() {
        Assert.assertEquals(0, bowlingGame.score());
    }
    @Test
    public void whenAllZerosReturnsZero() {
        annotateRolls(20, 0);
        Assert.assertEquals(0, bowlingGame.score());
    }

    @Test
    public void whenAllFiveReturns100() {
        annotateRolls(20, 5);
        Assert.assertEquals(145, bowlingGame.score());
    }

    @Test
    public void whenOneSpareAndRestZeroShouldReturn10() {
        bowlingGame.roll(5);
        bowlingGame.roll(5);
        annotateRolls(18, 0);
        Assert.assertEquals(10, bowlingGame.score());
    }

    @Test
    public void whenOneSpareAndRestOneShouldReturn29() {
        bowlingGame.roll(5);
        bowlingGame.roll(5);
        annotateRolls(18, 1);
        Assert.assertEquals(29, bowlingGame.score());
    }
    @Test
    public void whenOneSpareAndRestOneShouldReturn16() {
        bowlingGame.roll(5);
        bowlingGame.roll(5);
        bowlingGame.roll(3);
        annotateRolls(18, 0);
        Assert.assertEquals(16, bowlingGame.score());
    }

    private void annotateRolls(int times, int pinsDown) {
        for (int i = 0; i < times; i++) {
            bowlingGame.roll(pinsDown);
        }
    }
}
