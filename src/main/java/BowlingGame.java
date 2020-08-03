public class BowlingGame {
    static int maxFrameNum = 10;
    int score = 0;
    int curFrameNum = 0, curFrameScore = 0, curFrameThrowTimes = 0;
    int curAdd = 0, nextAdd = 0, next2Add = 0;

    public void Bowling(int hitDownNumber) {
        if (curFrameNum > maxFrameNum) {
            return;
        }
        curFrameThrowTimes++;
        curAdd = nextAdd;
        nextAdd = next2Add;
        next2Add = 0;

        if (curAdd != 0) {
            this.score += hitDownNumber * curAdd;
        }

        this.score += hitDownNumber;
        curFrameScore += hitDownNumber;

        if (curFrameThrowTimes == 2) {
            if (curFrameScore == 10) {
                nextAdd++;
            }
            curFrameNum++;
            curFrameScore = 0;
            curFrameThrowTimes = 0;
        }

    }

    public int getScore() {
        return this.score;
    }
}
