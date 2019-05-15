package com.greatwideweb.samples.streams;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class TeamStatsCalculator {

    private final List<Player> players;

    public TeamStatsCalculator(List<Player> players) {
        this.players = players;
    }

    public double calcPointPerGame() {
        if (this.players == null || this.players.size() ==0) { return 0; }
        double games = this.players.stream().mapToDouble(Player::getGames).sum();
        if(games < 1) { return 0; }
        return round(this.players.stream().mapToDouble(Player::getPoints).sum()/games);
    }

    private double round(double value) {
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(1, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}
