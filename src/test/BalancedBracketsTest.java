package test;

import main.BalancedBrackets;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void balancedBrackets_emptyString_returnsTrue() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void balancedBrackets_leftBracket_returnsFalse() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void balancedBrackets_rightBracket_returnsFalse() {
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void balancedBrackets_rightThenLeftBracket_returnsTrue() {
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void balancedBrackets_rightWordLeftBracket_returnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Domonique]"));
    }

    @Test
    public void balancedBrackets_leftRightLeftRightBracket_returnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void balancedBrackets_leftRightRightLeftBracket_returnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }

    //Test signaled that I needed to edit code in BalancedBrackets

    @Test
    public void balancedBrackets_rightThenLeftBracket_returnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void balancedBrackets_rightLeftRightLeftBracket_returnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]["));
    }

    @Test
    public void balancedBrackets_leftRightLeftBrackets_returnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]"));
    }

    @Test
    public void balancedBrackets_leftRightWordLeftBrackets_returnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][Domonique]"));
    }

    @Test
    public void balancedBrackets_leftBracketThenWord_returnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Domonique"));
    }

    @Test
    public void balancedBrackets_wordThenRightBracket_returnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Domonique"));
    }
}
