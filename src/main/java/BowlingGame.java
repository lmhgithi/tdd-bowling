public class BowlingGame {
    final static int maxFrameNum = 10;
    int scoreOfMatch = 0;
    int curFrameNo = 1, curFrameScore = 0, curFrameThrowTimes = 0;
    int[] extraAdding = {0, 0, 0}; // extraAdding of current Bowling, next Bowling, next next Bowling

    public void Bowling(int hitDownNumber) {
        if (curFrameNo > maxFrameNum) {
            return;
        }
        curFrameThrowTimes++;
        extraAdding[0] = extraAdding[1];
        extraAdding[1] = extraAdding[2];
        extraAdding[2] = 0;

        if (extraAdding[0] != 0) {
            this.scoreOfMatch += hitDownNumber * extraAdding[0];
        }

        this.scoreOfMatch += hitDownNumber;
        curFrameScore += hitDownNumber;
        if (curFrameNo != 10) {
            if (curFrameThrowTimes == 2) {
                if (curFrameScore == 10) {
                    extraAdding[1]++;
                }
                goToNextFrame();
            } else if (curFrameScore == 10) {
                extraAdding[1]++;
                extraAdding[2]++;
                goToNextFrame();
            }
        } else {
            if (curFrameThrowTimes == 3) {
                curFrameNo++;
            }
        }
    }

    private void goToNextFrame(){
        curFrameNo++;
        curFrameScore = 0;
        curFrameThrowTimes = 0;
    }
    public int getScore() {
        return this.scoreOfMatch;
    }
}
