
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    public GameTest() {
    }

    @Test
    public void shouldTellAmountOfLosers() {
        int[] speed = new int[]{1, 2, 5, 7, 4, 0, 6, 0};
        int actual = Game.amountOfLosers(speed);
        byte expected;
        if (Game.isGreenLight) {
            expected = 2;
        } else {
            expected = 6;
        }

        Assertions.assertEquals(expected, actual, "Amount Of Losers Incorrect");
    }

    @Test
    public void shouldTellSpeedsOfLosers() {
        int[] speed = new int[]{1, 2, 5, 7, 4, 0, 6, 0};
        int[] actual = Game.speedsOfLosers(speed);
        int[] expected;
        if (Game.isGreenLight) {
            expected = new int[]{0, 0};
        } else {
            expected = new int[]{1, 2, 5, 7, 4, 6};
        }

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTellSpeedsOfWinners() {
        int[] speed = new int[]{1, 2, 5, 7, 4, 0, 6, 0};
        int[] actual = Game.speedsOfWinners(speed);
        int[] expected;
        if (Game.isGreenLight) {
            expected = new int[]{1, 2, 5, 7, 4, 6};
        } else {
            expected = new int[]{0, 0};
        }

        Assertions.assertArrayEquals(expected, actual);
    }
}

