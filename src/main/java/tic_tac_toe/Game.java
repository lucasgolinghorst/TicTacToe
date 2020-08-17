package tic_tac_toe;

public class Game {

    private Player player1;
    private Player player2;

    public int[] getMoves() {
        return new int[9];
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }
}
