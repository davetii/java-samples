package com.greatwideweb.samples.streams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;
import static java.lang.Double.doubleToLongBits;

public class PlayerSearchUnitTest {

    private PlayerSearch ps;
    private final List<Player> EMPTY_LIST = new ArrayList<>();

    @BeforeEach
    public void setup() { ps = new PlayerSearch(); }

    @Test
    public void ensureRookieTestReturnsExpected() {
        assertRookieTest(false, ps.hasRookie(null));
        assertRookieTest(false, ps.hasRookie(EMPTY_LIST));
        assertRookieTest(false, ps.hasRookie(createPlayerListWithSeasons(4,3,2,8)));
        assertRookieTest(true, ps.hasRookie(createPlayerListWithSeasons(4,1,2,8)));
        assertRookieTest(true, ps.hasRookie(createPlayerListWithSeasons(1,1,1,1)));
    }

    @Test
    public void ensureAllRookieTestReturnsExpected() {
        assertRookieTest(false, ps.isAllRookies(null));
        assertRookieTest(false, ps.isAllRookies(EMPTY_LIST));
        assertRookieTest(false, ps.isAllRookies(createPlayerListWithSeasons(4,3,2,8)));
        assertRookieTest(false, ps.isAllRookies(createPlayerListWithSeasons(4,1,2,8)));
        assertRookieTest(true, ps.isAllRookies(createPlayerListWithSeasons(1,1,1,1)));
    }

    @Test
    public void ensureMaxScorerReturnsExpected() {
        Assertions.assertEquals(null, ps.getTopScorer(null));
        Assertions.assertEquals(null, ps.getTopScorer(EMPTY_LIST));
        List<Player> list = new ArrayList<>();
        list.add(createPlayerWithPoints(12, 2));
        list.add(createPlayerWithPoints(14, 2));
        list.add(createPlayerWithPoints(16, 2));
        Assertions.assertEquals(doubleToLongBits(8.0), doubleToLongBits(ps.getTopScorer(list).getPpg()));
        Assertions.assertEquals(doubleToLongBits(6.0), doubleToLongBits(ps.getLowScorer(list).getPpg()));
    }

    private void assertRookieTest(boolean expected, boolean actual) {
        Assertions.assertEquals(expected, actual);
    }

    private List<Player> createPlayerListWithSeasons(int... seasons) {
        List<Player> list = new ArrayList<>();
        for(int i : seasons) {
            list.add(createPlayerWithSeason(i));
        }
        return list;
    }

    private Player createPlayerWithSeason(int i) {
        Player p = new Player();
        p.setSeasons(i);
        return p;
    }

    private Player createPlayerWithPoints(int points, int games) {
        Player p = new Player();
        p.setPoints(points);
        p.setGames(games);
        return p;
    }
}

