import org.junit.Before;
import org.junit.Test;
import tic_tac_toe.Game;
import tic_tac_toe.Player;

public class GameClass {

    private Game ticTac;

    @Before
    public void setup() {
        ticTac = new Game();
    }

    @Test
    public void moves() {
        int[] moves = ticTac.getMoves();
    }

    @Test
    public void makePlayer1() {
        Player player1 = ticTac.getPlayer1();
    }
}
