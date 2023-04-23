package software.daveturner.samples.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static software.daveturner.samples.streams.PlayerPosition.*;

public class PlayerGrouper {

    private final Map<String, List<Player>> positions;
    private final Map<Boolean, List<Player>> veterans;
    private final Map<Boolean, List<Player>> rookies;


    public PlayerGrouper(List<Player> players) {
        positions = players.stream().collect(Collectors.groupingBy(Player::getPosition));
        veterans = players.stream().collect(Collectors.partitioningBy(p -> p.getSeasons() > 4));
        rookies = players.stream().collect(Collectors.partitioningBy(p -> p.getSeasons() < 2));
    }

    public List<Player> getGuards() {
        return positions.get(GUARD.toString());
    }

    public List<Player> getForwards() {
        return positions.get(FORWARD.toString());
    }

    public List<Player> getCenters() {
        return positions.get(CENTER.toString());
    }

    public List<Player> getVeterans() {
        return veterans.get(Boolean.TRUE);
    }

    public List<Player> getRookies() {
        return rookies.get(Boolean.TRUE);
    }
}
