package tic_tac_toe;

public class Game {

    private String[] moves;
    private Player player1;
    private Player player2;


    public Game(String player1Name, String player2Name) {
        player1 = new Player(player1Name);
        player2 = new Player(player2Name);
        moves = new String[10];
    }

    public String[] getMoves() {
        return moves;
    }

    public String getPlayer1Name() {
        return player1.getName();
    }

    public String getPlayer2Name() {
        return player2.getName();
    }

    public void makeMove(Player player, int index) {
        moves[index] = player.getName();
    }
}
