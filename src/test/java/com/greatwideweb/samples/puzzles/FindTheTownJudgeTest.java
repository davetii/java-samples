package com.greatwideweb.samples.puzzles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FindTheTownJudgeTest {

    FindTheTownJudge o;

    @BeforeEach
    public void setup() {
        o = new FindTheTownJudge();
    }

    @Test
    public void ensureHappyPath() {
        int[][] trust = {{1,2}};
        Assertions.assertEquals(2, o.findJudge(2, trust));
    }

    @Test
    public void ensureHappyPathWith2() {
        int[][] trust = {{1,3},{2,3}};
        Assertions.assertEquals(3, o.findJudge(3, trust));
    }

    @Test
    public void ensureNoMatchReturnsExpected() {
        int[][] trust = {{1,3},{2,3}, {3,1}};
        Assertions.assertEquals(-1, o.findJudge(3, trust));
    }

    @Test
    public void wrongAnswerFix() {
        int[][] trust = {{1,3},{1,4}, {2,3}, {2,4}, {4,3}};
        Assertions.assertEquals(3, o.findJudge(4, trust));
    }

    @Test
    public void emptyTest() {
        int[][] trust = {{}};
        Assertions.assertEquals(-1, o.findJudge(1, trust));
    }

    @Test
    public void emptyWith1() {
        int[][] trust = {};
        Assertions.assertEquals(1, o.findJudge(1, trust));
    }

    @Test
    public void emptyWith2() {
        int[][] trust = {};
        Assertions.assertEquals(-1, o.findJudge(2, trust));
    }

    @Test
    public void defect2() {
        int[][] trust = {{1,2},{1,3},{2,1},{2,3},{1,4},{4,3},{4,1}};
        Assertions.assertEquals(3, o.findJudge(2, trust));
    }

    @Test
    public void defect3() {
        int[][] trust = {{1,3},{1,4},{2,3}};
        Assertions.assertEquals(-1, o.findJudge(2, trust));
    }
}
