package com.greatwideweb.samples.enums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.greatwideweb.samples.enums.Position.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionsUnitTest {

    @Test
    public void ensurePositionsHaveExepctedValues() {
        assertEnum(0, PG);
        assertEnum(1, CG);
        assertEnum(2, BG);
        assertEnum(3, WING);
        assertEnum(4, SF);
        assertEnum(5, F);
        assertEnum(6, PF);
        assertEnum(7, FC);
        assertEnum(8, C);

    }

    @Test
    public void ensureAdjustedSpeedReturnsAsexpected() {
        assertAdjustedSpeed(5, 8, PG);
        assertAdjustedSpeed(5, 7, CG);
        assertAdjustedSpeed(5, 6, BG);
        assertAdjustedSpeed(5, 5, WING);
        assertAdjustedSpeed(5, 5, SF);
        assertAdjustedSpeed(5, 5, F);
        assertAdjustedSpeed(5, 5, PF);
        assertAdjustedSpeed(5, 4, FC);
        assertAdjustedSpeed(5, 3, C);

    }

    private void assertEnum(int expectedId, Position position) {
        assertEquals(expectedId, position.getId());
    }

    private void assertAdjustedSpeed(int originalSpeed, int expectedSpeed, Position position) {
        assertEquals(expectedSpeed, position.getAdjustedSpeed(originalSpeed));
    }


}
