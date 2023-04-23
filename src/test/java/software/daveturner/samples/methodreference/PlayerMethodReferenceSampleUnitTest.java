package software.daveturner.samples.methodreference;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerMethodReferenceSampleUnitTest {

    @Test
    public void ensurePlayerMethodReferenceReturnsExpected() {
        List<PlayerMethodReferenceSample> players = new ArrayList<>();
        players.add(new PlayerMethodReferenceSample("Reggie", "Jackson", "Point Guard"));
        players.add(new PlayerMethodReferenceSample("Avery", "Bradley", "Big Guard"));
        players.add(new PlayerMethodReferenceSample("Tobias", "Harris", "Combo Forward"));
        players.add(new PlayerMethodReferenceSample("Andre", "Drummond", "Center"));

        List<String> list = PlayerMethodReferenceSample.buildDetailList(players);
        assertEquals(list.get(0), "Point Guard: Reggie Jackson");
        assertEquals(list.get(1), "Big Guard: Avery Bradley");
        assertEquals(list.get(2), "Combo Forward: Tobias Harris");
        assertEquals(list.get(3), "Center: Andre Drummond");

    }
}
