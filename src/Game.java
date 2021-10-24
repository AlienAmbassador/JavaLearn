public class Game {

    public static boolean isGreenLight = true;

    public static boolean isLose(int speed) {
        if (isGreenLight) {
            if (speed == 0) return true;
            else return false;
        } else {
            if (speed == 0) return false;
            else return true;
        }
    }

    public static void main(String[] args) {
        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 4;

        if (isLose(speedOfPlayer1)) System.out.println("Player 1 loses");
        else System.out.println("Player 1 wins");
        if (isLose(speedOfPlayer2)) System.out.println("Player 2 loses");
        else System.out.println("Player 2 wins");
        if (isLose(speedOfPlayer3)) System.out.println("Player 3 loses");
        else System.out.println("Player 3 wins");
    }
}
