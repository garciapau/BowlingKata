package pau.garcia.kata;

public class BowlingGame {
    private int score;

    public int score() {
        return score;
    }

    public void roll(int pinsDown) {
        score += pinsDown;
    }
}
