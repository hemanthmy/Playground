package com.htnameh.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SockMerchantTest {

    @Test
    void solution() {
        assertEquals(3, SockMerchant.solution(10, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }
}