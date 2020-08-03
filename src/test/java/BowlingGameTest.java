import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    public void should_give_score_of_one_throw() {
        BowlingGame game = new BowlingGame();
        game.Bowling(2);
        assertEquals(2, game.getScore());
    }

    @Test
    public void should_give_score_of_entire_match(){
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 20; i++) {
            game.Bowling(2);
        }
        assertEquals(40, game.getScore());
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
        assertEquals(56, game.getScore());
    }

    @Test
    public void should_give_score_of_entire_match_when_has_spike_before_10th_frame(){
        BowlingGame game = new BowlingGame();
        game.Bowling(2);
        game.Bowling(8);
        for (int i = 0; i < 14; i++) {
            game.Bowling(2);
        }
        game.Bowling(10);
        game.Bowling(2);
        game.Bowling(2);
        assertEquals(58, game.getScore());
    }

    @Test
    public void should_give_score_of_entire_match_when_has_spike_at_10th_frame(){
        BowlingGame game = new BowlingGame();
        game.Bowling(2);
        game.Bowling(8);
        for (int i = 0; i < 16; i++) {
            game.Bowling(2);
        }
        game.Bowling(10);
        game.Bowling(2);
        game.Bowling(3);
        assertEquals(59, game.getScore());
    }

    @Test
    public void should_give_score_of_entire_match_when_has_spare_at_10th_frame(){
        BowlingGame game = new BowlingGame();
        game.Bowling(2);
        game.Bowling(8);
        for (int i = 0; i < 16; i++) {
            game.Bowling(2);
        }
        game.Bowling(2);
        game.Bowling(8);
        game.Bowling(3);
        assertEquals(57, game.getScore());
    }

    @Test
    public void should_give_score_of_entire_match_when_has_no_spare_or_spike_at_10th_frame(){
        BowlingGame game = new BowlingGame();
        game.Bowling(2);
        game.Bowling(8);
        for (int i = 0; i < 16; i++) {
            game.Bowling(2);
        }
        game.Bowling(2);
        game.Bowling(5);
        assertEquals(51, game.getScore());
    }
}
