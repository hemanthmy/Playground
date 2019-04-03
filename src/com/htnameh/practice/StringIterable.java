package com.htnameh.practice;

import java.util.Iterator;

/**
 * @author hemanth
 * @since 22/2/19
 */
public class StringIterable implements Iterable<Character> {

    private final String string;

    public StringIterable(String string) {
        this.string = string;
    }

    @Override
    public Iterator<Character> iterator() {
        return new StringIterator();
    }

    class StringIterator implements Iterator<Character> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < string.length();
        }

        @Override
        public Character next() {
            final char c = string.charAt(index);
            index++;
            return c;
        }

    }

}