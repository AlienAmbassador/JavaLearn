import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void shouldTellIfPlayerLoses(){
        int playerSpeed = 10;

        boolean actual = Game.isLose(playerSpeed);

        if(Game.isGreenLight) {
            Assertions.assertFalse(actual);
        }else Assertions.assertTrue(actual);
    }

    @Test
    public void shouldTellNegativeSpeed(){
        int playerSpeed = -1;

        boolean actual = Game.isLose(playerSpeed);

        if(Game.isGreenLight) {
            Assertions.assertFalse(actual);
        }else Assertions.assertTrue(actual);
    }
}
