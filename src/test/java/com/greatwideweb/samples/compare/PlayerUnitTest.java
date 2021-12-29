package com.greatwideweb.samples.compare;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.greatwideweb.samples.enums.Position.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerUnitTest {

    @Test
    public void ensureSortingWorksAsExpected() {
        List<SortedPlayer> players = new ArrayList();
        players.add(new SortedPlayer("Center1", C));
        players.add(new SortedPlayer("Wing1", WING));
        players.add(new SortedPlayer("PointGuard1", PG));
        players.add(new SortedPlayer("Wing2", WING));
        players.add(new SortedPlayer("ComboGuard", CG));
        players.add(new SortedPlayer("Center2", C));
        players.add(new SortedPlayer("PowerForward", PF));
        players.add(new SortedPlayer("PointGuard2", PG));
        Collections.sort(players);
        assertEquals(players.get(0).getName(), "PointGuard1");
        assertEquals(players.get(1).getName(), "PointGuard2");
        assertEquals(players.get(2).getName(), "ComboGuard");
        assertEquals(players.get(3).getName(), "Wing1");
        assertEquals(players.get(4).getName(), "Wing2");
        assertEquals(players.get(5).getName(), "PowerForward");
        assertEquals(players.get(6).getName(), "Center1");
        assertEquals(players.get(7).getName(), "Center2");
    }

    @Test
    public void ensureComparatorWorksAsExpected() {
        List<Player> players = new ArrayList();
        players.add(new Player("Center1", C));
        players.add(new Player("Wing1", WING));
        players.add(new Player("PointGuard1", PG));
        players.add(new Player("Wing2", WING));
        players.add(new Player("ComboGuard", CG));
        players.add(new Player("Center2", C));
        players.add(new Player("PowerForward", PF));
        players.add(new Player("PointGuard2", PG));
        players.sort(new PlayerSorter());
        assertEquals(players.get(0).getName(), "PointGuard1");
        assertEquals(players.get(1).getName(), "PointGuard2");
        assertEquals(players.get(2).getName(), "ComboGuard");
        assertEquals(players.get(3).getName(), "Wing1");
        assertEquals(players.get(4).getName(), "Wing2");
        assertEquals(players.get(5).getName(), "PowerForward");
        assertEquals(players.get(6).getName(), "Center1");
        assertEquals(players.get(7).getName(), "Center2");
    }


}
