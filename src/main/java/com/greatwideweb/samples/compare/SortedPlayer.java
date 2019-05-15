package com.greatwideweb.samples.compare;

import com.greatwideweb.samples.enums.Position;

public class SortedPlayer extends Player implements Comparable<Player> {

    public SortedPlayer(String newName, Position newPosition) {
        super(newName, newPosition);
    }

    @Override
    public int compareTo(Player o) {
        return (this.getPosition().getId() < o.getPosition().getId()) ? -1 : 1;
    }

}
