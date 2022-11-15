import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {
    @Test
    void endGame(){
        Game game = Game.getInstance();
        int res = game.run(0);
        assertEquals(0, res);
    }
}
