package com.greatwideweb.samples.streams;

public class Player {

    private String name;
    private String position;
    private int points;
    private int games;
    private double ppg;
    private int seasons;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    private void calcPpg() {
        if (this.games == 0 ) { this.ppg = 0; }
        this.ppg = this.points / this.games;
    }

    public double getPpg() {
        calcPpg();
        return ppg;
    }

    public int getSeasons() { return seasons; }
    public void setSeasons(int seasons) { this.seasons = seasons; }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", points=" + points +
                ", games=" + games +
                ", ppg=" + ppg +
                ", seasons=" + seasons +
                '}';
    }
}
