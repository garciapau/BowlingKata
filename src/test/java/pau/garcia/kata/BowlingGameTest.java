package pau.garcia.kata;

import org.junit.Assert;
import org.junit.Test;

public class BowlingGameTest {
    @Test
    public void testWhenNoScoresReturnsZero() {
        BowlingGame bowlingGame = new BowlingGame();
        Assert.assertEquals(0, bowlingGame.score());
    }
    @Test
    public void testWhenAllZerosReturnsZero() {
        BowlingGame bowlingGame = new BowlingGame();
        for (int i = 0; i < 20; i++) {
            bowlingGame.roll(0);
        }
        Assert.assertEquals(0, bowlingGame.score());
    }

}
