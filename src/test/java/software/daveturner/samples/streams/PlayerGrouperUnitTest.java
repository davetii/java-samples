package software.daveturner.samples.streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerGrouperUnitTest {

    List<Player> players;
    PlayerGrouper playerGrouper;

    @BeforeEach
    public void setup() {
        players = buildPlayers();
        playerGrouper = new PlayerGrouper(players);
    }

    @Test
    public void ensureGetPositionsReturnsExpected() {
        assertEquals(3, playerGrouper.getGuards().size());
    }

    @Test
    public void ensureGetVeteransReturnsExpected() {
        assertEquals(2, playerGrouper.getVeterans().size());
    }

    @Test
    public void ensureGetRookiesReturnsExpected() {
        assertEquals(1, playerGrouper.getRookies().size());
    }

    private List<Player> buildPlayers() {
        List<Player>  players = new ArrayList<>();
        players.add(Player.buildPlayer("bob", PlayerPosition.GUARD, 2));
        players.add(Player.buildPlayer("joe", PlayerPosition.GUARD, 4));
        players.add(Player.buildPlayer("dean", PlayerPosition.GUARD, 7));
        players.add(Player.buildPlayer("Dave", PlayerPosition.CENTER, 4));
        players.add(Player.buildPlayer("Ray", PlayerPosition.CENTER, 10));
        players.add(Player.buildPlayer("Mike", PlayerPosition.FORWARD, 4));
        players.add(Player.buildPlayer("Tony", PlayerPosition.FORWARD, 1));
        return players;
    }
}
