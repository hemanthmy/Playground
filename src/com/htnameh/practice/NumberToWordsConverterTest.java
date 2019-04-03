package com.htnameh.practice;

import org.junit.jupiter.api.Test;

import static com.htnameh.practice.NumberToWordsConverter.convert;
import static org.junit.Assert.assertEquals;

class NumberToWordsConverterTest {

    @Test
    void englishTests() {
        assertEquals("one", convert(1, true));
        assertEquals("ten", convert(10, true));
        assertEquals("eleven", convert(11, true));
        assertEquals("ninety seven", convert(97, true));
        assertEquals("one hundred", convert(100, true));
        assertEquals("one hundred one", convert(101, true));
        assertEquals("nine hundred eighty seven", convert(987, true));
        assertEquals("one thousand", convert(1000, true));
        assertEquals("one thousand one", convert(1001, true));
        assertEquals("one thousand one hundred one", convert(1101, true));
        assertEquals("ten thousand four hundred", convert(10400, true));
        assertEquals("four hundred eight thousand three hundred", convert(408300, true));
        assertEquals("four million eight thousand three hundred", convert(4008300, true));
        assertEquals("four million two hundred eight thousand three hundred", convert(4208300, true));
    }

}