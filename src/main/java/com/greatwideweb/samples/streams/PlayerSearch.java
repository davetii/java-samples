package com.greatwideweb.samples.streams;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class PlayerSearch {

    private final Predicate<Player> testForRookie =  p -> p.getSeasons() == 1;
    private Comparator<Player> ppgCompare = Comparator.comparingDouble(Player::getPpg);


    public boolean hasRookie(List<Player> list) {
        return list != null && list.stream().anyMatch(testForRookie);
    }

    public boolean isAllRookies(List<Player> list) {
        return list != null && list.size()!= 0 && list.stream().allMatch(testForRookie);
    }

    public Player getTopScorer(List<Player> list) {

        if (list == null ) { return null; }
        return list.stream().max(ppgCompare).orElse(null);
    }

    public Player getLowScorer(List<Player> list) {
        if (list == null ) { return null; }
        return list.stream().min(ppgCompare).orElse(null);
    }
}
