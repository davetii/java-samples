package com.greatwideweb.samples.streams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static com.greatwideweb.samples.streams.Player.*;
import static com.greatwideweb.samples.streams.PlayerPosition.*;
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
        players.add(buildPlayer("bob", GUARD, 2));
        players.add(buildPlayer("joe", GUARD, 4));
        players.add(buildPlayer("dean", GUARD, 7));
        players.add(buildPlayer("Dave", CENTER, 4));
        players.add(buildPlayer("Ray", CENTER, 10));
        players.add(buildPlayer("Mike", FORWARD, 4));
        players.add(buildPlayer("Tony", FORWARD, 1));
        return players;
    }
}
