package pau.garcia.kata;

public class BowlingGame {
    final int MAX_FRAMES = 10;
    final int MAX_ROLLS = 21;
    private int[] rolls = new int[MAX_ROLLS];
    int currentRoll=0;

    public int score() {
        int score = 0;
        for (int frame = 0; frame < MAX_FRAMES; frame++) {
            if ( (rolls[frame*2]) == 10) {
                score += rolls[frame*2] + rolls[frame*2 +1] + rolls[frame*2 + 2];
            } else if ((rolls[frame*2] + rolls[frame*2 + 1]) == 10) {
                score += rolls[frame*2] + rolls[frame*2 + 1]+ rolls[frame*2 + 2];
            } else {
                score += rolls[frame*2] + rolls[frame*2 + 1];
            }
        }
        return score;
    }

    public void roll(int pinsDown) {
        rolls[currentRoll++] = pinsDown;
    }
}
