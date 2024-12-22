package software.daveturner.samples.puzzles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotMoveTrackerTest {
    RobotMoveTracker tracker;

    @BeforeEach
    public void setup() {
        tracker = new RobotMoveTracker();
    }

    @Test
    public void ensureNoMNovementReturnsExpected() {
        assertTrue(tracker.isWhereWeStarted());
    }
    @Test
    public void ensureLinearMovementReturnsExpected() {
        tracker.move("U");
        assertFalse(tracker.isWhereWeStarted());
    }

    @Test
    public void ensureUpAndDownReturnsExpected() {
        tracker.move("U");
        tracker.move("U");
        tracker.move("D");
        tracker.move("D");
        assertTrue(tracker.isWhereWeStarted());
    }
    @Test
    public void ensureMovingRightOnlyReturnsExpected() {
        tracker.move("R");
        tracker.move("R");
        assertFalse(tracker.isWhereWeStarted());
    }

    @Test
    public void ensureMovingRightTheBackLeftReturnsExpected() {
        tracker.move("R");
        tracker.move("R");
        tracker.move("L");
        tracker.move("L");
        assertTrue(tracker.isWhereWeStarted());
    }

    @Test
    public void ensureCombinationOfMovementsReturnsExpected() {
        tracker.move("R");
        tracker.move("R");
        tracker.move("U");
        tracker.move("U");
        tracker.move("L");
        tracker.move("D");
        tracker.move("L");
        tracker.move("D");
        assertTrue(tracker.isWhereWeStarted());
    }

}