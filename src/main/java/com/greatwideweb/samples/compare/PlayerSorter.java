package com.greatwideweb.samples.compare;

import java.util.Comparator;

public class PlayerSorter implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getPosition().getId() == o2.getPosition().getId()) { return 0; }
        return (o1.getPosition().getId() < o2.getPosition().getId()) ? -1 : 1;
    }
}
