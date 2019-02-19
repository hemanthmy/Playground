package com.htnameh.kata;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author hemanth
 * @since 11/12/18
 */
public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        Pattern pattern = Pattern.compile("[:;][-~]?[)D]");
        Matcher matcher;

        int count = 0;

        for (String s : arr) {
            matcher = pattern.matcher(s);

            if (matcher.matches()) {
                count++;
            }
        }

        return count;
    }

    public static int countSmileysWithStream(List<String> arr) {
        return (int)arr.stream().filter( x -> x.matches("[:;][-~]?[)D]")).count();
    }

}
