public class BowlingGame {
    static int maxFrameNum = 10;
    int score = 0;
    int curFrameNum = 1, curFrameScore = 0, curFrameThrowTimes = 0;
    int[] extraAdding = {0,0,0};

    public void Bowling(int hitDownNumber) {
        if (curFrameNum > maxFrameNum) {
            return;
        }
        curFrameThrowTimes++;
        extraAdding[0] = extraAdding[1];
        extraAdding[1] = extraAdding[2];
        extraAdding[2] = 0;

        if (extraAdding[0] != 0) {
            this.score += hitDownNumber * extraAdding[0];
        }

        this.score += hitDownNumber;
        curFrameScore += hitDownNumber;
        if (curFrameNum != 10) {
            if (curFrameThrowTimes == 2) {
                if (curFrameScore == 10) {
                    extraAdding[1]++;
                }
                curFrameNum++;
                curFrameScore = 0;
                curFrameThrowTimes = 0;
            } else if (curFrameScore == 10) {
                extraAdding[1]++;
                extraAdding[2]++;

                curFrameNum++;
                curFrameScore = 0;
                curFrameThrowTimes = 0;
            }
        } else {
            if (curFrameThrowTimes == 3) {
                curFrameNum++;
            }
        }
    }

    public int getScore() {
        return this.score;
    }
}
