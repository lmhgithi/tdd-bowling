public class BowlingGame {
    int score = 0;

    public void Bowling(int hitDownNumber) {
        this.score += hitDownNumber;
    }

    public int getScore() {
        return this.score;
    }
}
