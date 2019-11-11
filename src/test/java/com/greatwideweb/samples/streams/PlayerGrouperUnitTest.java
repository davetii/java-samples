package com.greatwideweb.samples.streams;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.greatwideweb.samples.streams.Player.*;
import static com.greatwideweb.samples.streams.PlayerPosition.*;

public class PlayerGrouperUnitTest {

    List<Player> players;
    PlayerGrouper playerGrouper;

    @Before
    public void setup() {
        players = buildPlayers();
        playerGrouper = new PlayerGrouper(players);
    }

    @Test
    public void ensureGetPositionsReturnsExpected() {
        Assert.assertEquals(3, playerGrouper.getGuards().size());
    }

    @Test
    public void ensureGetVeteransReturnsExpected() {
        Assert.assertEquals(2, playerGrouper.getVeterans().size());
    }

    @Test
    public void ensureGetRookiesReturnsExpected() {
        Assert.assertEquals(1, playerGrouper.getRookies().size());
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
