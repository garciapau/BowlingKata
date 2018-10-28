package pau.garcia.kata;

import org.junit.Assert;
import org.junit.Test;

public class BowlingGameTest {
    @Test
    public void testNoScoresReturnsZero() {
        BowlingGame bowlingGame = new BowlingGame();
        Assert.assertEquals(0, bowlingGame.score());
    }
}
