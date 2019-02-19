package com.htnameh.kata;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmileFacesTest {

    long start = 0;

    @Before
    public void start() {
        start = System.currentTimeMillis();
    }

    @Test
    public void testRegex1() {
        List<String> a = new ArrayList<>();
        a.add(":)");
        a.add(":D");
        a.add(":-}");
        a.add(":-()");
        assertEquals(2, SmileFaces.countSmileys(a));
    }

    @Test
    public void testRegex2() {
        List<String> a = new ArrayList<>();
        a.add(":)");
        a.add("XD");
        a.add(":0}");
        a.add("x:-");
        a.add("):-");
        a.add("D:");
        assertEquals(1, SmileFaces.countSmileys(a));
    }

    @Test
    public void testRegex4() {
        List<String> a = new ArrayList<>();
        a.add(":)");
        a.add(":D");
        a.add("X-}");
        a.add("xo)");
        a.add(":X");
        a.add(":-3");
        a.add(":3");
        assertEquals(2, SmileFaces.countSmileys(a));
    }

    @Test
    public void testRegex5() {
        List<String> a = new ArrayList<>();
        a.add(":)");
        a.add(":)");
        a.add("x-]");
        a.add(":ox");
        a.add(";-(");
        a.add(";-)");
        a.add(";~(");
        a.add(":~D");
        assertEquals(4, SmileFaces.countSmileys(a));
    }

    @Test
    public void testRegexWithStream1() {
        List<String> a = new ArrayList<>();
        a.add(":)");
        a.add(":D");
        a.add(":-}");
        a.add(":-()");
        assertEquals(2, SmileFaces.countSmileysWithStream(a));
    }

    @Test
    public void testRegexWithStream2() {
        List<String> a = new ArrayList<>();
        a.add(":)");
        a.add("XD");
        a.add(":0}");
        a.add("x:-");
        a.add("):-");
        a.add("D:");
        assertEquals(1, SmileFaces.countSmileysWithStream(a));
    }

    @Test
    public void testRegexWithStream4() {
        List<String> a = new ArrayList<>();
        a.add(":)");
        a.add(":D");
        a.add("X-}");
        a.add("xo)");
        a.add(":X");
        a.add(":-3");
        a.add(":3");
        assertEquals(2, SmileFaces.countSmileysWithStream(a));
    }

    @Test
    public void testRegexWithStream5() {
        List<String> a = new ArrayList<>();
        a.add(":)");
        a.add(":)");
        a.add("x-]");
        a.add(":ox");
        a.add(";-(");
        a.add(";-)");
        a.add(";~(");
        a.add(":~D");
        assertEquals(4, SmileFaces.countSmileysWithStream(a));
    }

    @After
    public void end() {
        System.out.println(System.currentTimeMillis() - start);
    }
}