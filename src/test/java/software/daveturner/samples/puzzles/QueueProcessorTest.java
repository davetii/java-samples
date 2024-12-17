package software.daveturner.samples.puzzles;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static software.daveturner.samples.puzzles.QueueProcessor.*;

class QueueProcessorTest {

    private QueueProcessor queueProcessor;

    @BeforeEach
    public void setup() {
        queueProcessor = new QueueProcessor();
    }

    @Test
    public void ensureQueueHandlesLessThan5() {
        String[] strings = {"a", "b", "c"};
        assertEquals(WAITING, queueProcessor.handleQueue(strings));
        assertEquals(WAITING, queueProcessor.handleQueue("d"));
        assertNotEquals(WAITING, queueProcessor.handleQueue("e"));
    }

    @Test
    public void ensureQueueProcessesAsExpected() {
        String[] strings = {"a", "b", "c", "d", "e", "f", "g", "h" };
        assertEquals("d", queueProcessor.handleQueue(strings));
    }

    @Test
    public void ensureQueueProcessesAsExpected2() {
        String[] strings = {"a", "b", "c"};
        assertEquals(WAITING, queueProcessor.handleQueue(strings));
        String[] strings2 = {"d", "e", "f", "g", "h"};
        assertEquals("d", queueProcessor.handleQueue(strings2));
        assertEquals("e", queueProcessor.handleQueue("j"));
    }
}