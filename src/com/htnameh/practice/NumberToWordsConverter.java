package com.htnameh.practice;

/**
 * @author hemanth
 * @since 15/2/19
 */
public class NumberToWordsConverter {

    private static final String[] SPECIAL_NAMES = {"", " thousand", " million", " billion", " trillion", " quadrillion",
            " quintillion"};

    private static final String[] TENS_NAMES = {"", " ten", " twenty", " thirty", " forty", " fifty", " sixty",
            " seventy", " eighty", " ninety"};

    private static final String[] NUMBER_NAMES = {"", " one", " two", " three", " four", " five", " six", " seven",
            " eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
            " seventeen", " eighteen", " nineteen"};

    private static String convertLessThanOneThousand(int number) {
        String current;

        if (number % 100 < 20) {
            current = NUMBER_NAMES[number % 100];
            number /= 100;
        } else {
            current = NUMBER_NAMES[number % 10];
            number /= 10;

            current = TENS_NAMES[number % 10] + current;
            number /= 10;
        }
        if (number == 0)
            return current;
        return NUMBER_NAMES[number] + " hundred" + current;
    }

    private static String convert(int number) {
        if (number == 0) {
            return "zero";
        }

        String prefix = "";

        if (number < 0) {
            number = -number;
            prefix = "-";
        }

        StringBuilder current = new StringBuilder();
        int place = 0;

        do {
            int n = number % 1000;
            if (n != 0) {
                String s = convertLessThanOneThousand(n);
                current.insert(0, s + SPECIAL_NAMES[place]);
            }
            place++;
            number /= 1000;
        } while (number > 0);

        return (prefix + current).trim();
    }

    public static void main(String[] args) {
        System.out.println("Number in word   : " + convert(1819));
        System.out.println("Number in word   : " + convert(1392819));
    }

}