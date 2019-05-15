package com.greatwideweb.samples.methodreference;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.greatwideweb.samples.methodreference.PlayerMethodReferenceSample.buildDetailList;

public class PlayerMethodReferenceSampleUnitTest {

    @Test
    public void ensurePlayerMethodReferenceReturnsExpected() {
        List<PlayerMethodReferenceSample> players = new ArrayList<>();
        players.add(new PlayerMethodReferenceSample("Reggie", "Jackson", "Point Guard"));
        players.add(new PlayerMethodReferenceSample("Avery", "Bradley", "Big Guard"));
        players.add(new PlayerMethodReferenceSample("Tobias", "Harris", "Combo Forward"));
        players.add(new PlayerMethodReferenceSample("Andre", "Drummond", "Center"));

        List<String> list = buildDetailList(players);
        Assert.assertEquals(list.get(0), "Point Guard: Reggie Jackson");
        Assert.assertEquals(list.get(1), "Big Guard: Avery Bradley");
        Assert.assertEquals(list.get(2), "Combo Forward: Tobias Harris");
        Assert.assertEquals(list.get(3), "Center: Andre Drummond");

    }
}
