package software.daveturner.samples.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionsUnitTest {

    @Test
    public void ensurePositionsHaveExepctedValues() {
        assertEnum(0, Position.PG);
        assertEnum(1, Position.CG);
        assertEnum(2, Position.BG);
        assertEnum(3, Position.WING);
        assertEnum(4, Position.SF);
        assertEnum(5, Position.F);
        assertEnum(6, Position.PF);
        assertEnum(7, Position.FC);
        assertEnum(8, Position.C);

    }

    @Test
    public void ensureAdjustedSpeedReturnsAsexpected() {
        assertAdjustedSpeed(5, 8, Position.PG);
        assertAdjustedSpeed(5, 7, Position.CG);
        assertAdjustedSpeed(5, 6, Position.BG);
        assertAdjustedSpeed(5, 5, Position.WING);
        assertAdjustedSpeed(5, 5, Position.SF);
        assertAdjustedSpeed(5, 5, Position.F);
        assertAdjustedSpeed(5, 5, Position.PF);
        assertAdjustedSpeed(5, 4, Position.FC);
        assertAdjustedSpeed(5, 3, Position.C);

    }

    private void assertEnum(int expectedId, Position position) {
        assertEquals(expectedId, position.getId());
    }

    private void assertAdjustedSpeed(int originalSpeed, int expectedSpeed, Position position) {
        assertEquals(expectedSpeed, position.getAdjustedSpeed(originalSpeed));
    }


}
