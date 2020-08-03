import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    public void should_give_score_of_one_throw() {
        BowlingGame game = new BowlingGame();
        game.Bowling(2);
        assertEquals(game.getScore(), 2);
    }

    @Test
    public void should_give_score_of_entire_match(){
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 20; i++) {
            game.Bowling(2);
        }
        assertEquals(game.getScore(), 40);
    }

    @Test
    public void should_give_score_of_entire_match_when_has_spare_before_10th_frame(){
        BowlingGame game = new BowlingGame();
        game.Bowling(2);
        game.Bowling(8);
        for (int i = 0; i < 14; i++) {
            game.Bowling(2);
        }
        game.Bowling(6);
        game.Bowling(4);
        game.Bowling(2);
        game.Bowling(2);
        assertEquals(game.getScore(), 56);
    }
}
