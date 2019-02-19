package com.htnameh.kata;

/**
 * @author hemanth
 * @since 4/12/18
 */
public class ToCamelCase {

    public static void main(String[] args) {
        System.out.println(toCamelCase("the"));
        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("The_Stealth_Warrior"));
    }

    private static String toCamelCase(String str){
        String[] input = str.split("[-_]");

        StringBuilder builder = new StringBuilder();

        builder.append(input[0]);

        for (int i = 1; i < input.length; i++) {
            builder.append(input[i].substring(0, 1).toUpperCase()).append(input[i].substring(1));
        }

        return builder.toString();
    }
}
