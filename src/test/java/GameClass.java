import org.junit.Before;
import org.junit.Test;
import tic_tac_toe.Game;
import tic_tac_toe.Player;

import static org.junit.Assert.*;

public class GameClass {

    private Game ticTacToe;

    @Before
    public void setup() {
        ticTacToe = new Game("Anna", "Marcie");
    }

    @Test
    public void moves() {
        String[] moves = ticTacToe.getMoves();
        assertNotNull(moves);
    }

    @Test
    public void makePlayerNames() {
        Player player1 = new Player("Anna");
        assertEquals("Anna", player1.getName());
        Player player2 = new Player("Marcie");
        assertEquals("Marcie", player2.getName());
    }

    @Test
    public void makeGameWithPlayers() {
        assertEquals("Anna", ticTacToe.getPlayer1Name());
        assertEquals("Marcie", ticTacToe.getPlayer2Name());
    }

    @Test
    public void makeMoves() {
        Player player = new Player("Dan");
        ticTacToe.makeMove(player, 1);
        assertEquals("Dan", ticTacToe.getMoves()[1]);
    }
}
