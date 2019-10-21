package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class YatzyEvaluatorTest {


    @Test
    public void getRollSum() {
        assertTrue(false);
    }

    @Test
    public void isYatzy() {
        int[] roll = {1, 2, 3, 4, 5};
        boolean isYatzy = YatzyEvaluator.isYatzy(roll);
        assertFalse(isYatzy);

        int[] roll2 = {6, 6, 6, 6, 6};
        isYatzy = YatzyEvaluator.isYatzy(roll2);
        assertTrue(isYatzy);
    }

    @Test
    public void isBigStraight() {
        assertTrue(false);
    }

    @Test
    public void isSmallStraight() {
        assertTrue(false);
    }

    @Test
    public void isFullHouse() {
        assertTrue(false);
    }

    @Test
    public void isFourOfAKind() {
        int[] roll = {1, 2, 3, 4, 5};
        boolean result = YatzyEvaluator.isYatzy(roll);
        assertFalse(result);

        int[] roll2 = {1, 3, 3, 3, 3};
        result = YatzyEvaluator.isYatzy(roll2);
        assertTrue(result);
    }

    @Test
    public void isThreeOfAKind() {
        assertTrue(false);
    }

    @Test
    public void isTwoOfAKind() {
        assertTrue(false);
    }
}