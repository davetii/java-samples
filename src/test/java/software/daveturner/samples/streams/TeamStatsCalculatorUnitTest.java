package software.daveturner.samples.streams;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


import java.util.ArrayList;
import java.util.List;

public class TeamStatsCalculatorUnitTest {

    @Test
    public void ensureNullListIsHandled() {
        TeamStatsCalculator calculator = new TeamStatsCalculator(null);
        assertTrue(calculator.calcPointPerGame() == 0);
    }

    @Test
    public void ensureEmptyListIsHandled() {
        TeamStatsCalculator calculator = new TeamStatsCalculator(new ArrayList<>());
        assertTrue(calculator.calcPointPerGame() == 0);
    }

    @Test
    public void ensureTeamStatsCalculcatorReturnsExpectedForPOintsPerGame() {
        TeamStatsCalculator calculator = new TeamStatsCalculator(buildTeam());
        assertTrue(calculator.calcPointPerGame() == 5.5);
    }

    @Test
    public void ensureDivideByZeroIsHanledAsExpected() {
        List<Player> players = new ArrayList<>();
        players.add(createPlayer("Reggie Jackson", 0, 8));
        TeamStatsCalculator calculator = new TeamStatsCalculator(players);
        assertTrue(calculator.calcPointPerGame() == 0);
    }

    private List<Player> buildTeam() {
        List<Player> players = new ArrayList<>();
        players.add(createPlayer("Reggie Jackson", 2, 8));
        players.add(createPlayer("Avery Bradley", 1, 4));
        players.add(createPlayer("Tobias Harris", 1, 10));
        return players;
    }

    private Player createPlayer(String name, int games, int points) {
        Player p = new Player();
        p.setGames(games);
        p.setName(name);
        p.setPoints(points);
        return p;
    }
}
