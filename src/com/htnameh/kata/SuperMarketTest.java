package com.htnameh.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuperMarketTest {

    @Test
    public void testNormalCondition() {
        assertEquals(8, SuperMarket.solveSuperMarketQueue(new int[]{2, 5, 4, 7, 2, 2, 2, 3, 2}, 5));
    }

    @Test
    public void testEmptyArray() {
        assertEquals(0, SuperMarket.solveSuperMarketQueue(new int[]{}, 1));
    }

    @Test
    public void testSingleTillManyCustomers() {
        assertEquals(15, SuperMarket.solveSuperMarketQueue(new int[]{1, 2, 3, 4, 5}, 1));
    }

}