import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    public void should_give_score_of_one_throw() {
        BowlingGame game = new BowlingGame();
        game.Bowling(2);
        assertEquals(game.getScore(), 2);
    }

}
