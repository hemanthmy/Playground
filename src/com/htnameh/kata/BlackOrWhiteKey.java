package com.htnameh.kata;

/**
 * @author hemanth
 * @since 11/12/18
 */
public class BlackOrWhiteKey {

    private static final String BLACK_KEY = "black";
    private static final String WHITE_KEY = "white";

    private static final String PIANO_KEYS = "wbwwbwbwwbwb";

    public static String blackOrWhiteKey(int keyPressCount) {
        return PIANO_KEYS.charAt((keyPressCount - 1) % 88 % 12) == 'w' ? WHITE_KEY : BLACK_KEY;
    }

}
