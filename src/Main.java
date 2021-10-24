class Main {
    public static void main(String[] args) {
        boolean isGreenLight = false;

        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 4;
        int cnt = 0;

        if (isGreenLight) {
            if (speedOfPlayer1 == 0) cnt++;
            if (speedOfPlayer2 == 0) cnt++;
            if (speedOfPlayer3 == 0) cnt++;
        } else {
            if (speedOfPlayer1 != 0) cnt++;
            if (speedOfPlayer2 != 0) cnt++;
            if (speedOfPlayer3 != 0) cnt++;
        }

        System.out.println(cnt);

    }
}
