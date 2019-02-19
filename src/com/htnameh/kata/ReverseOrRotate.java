package com.htnameh.kata;

/**
 * @author hemanth
 * @since 12/12/18
 */
public class ReverseOrRotate {

    public static String revRot(String string, int chunkSize) {
        StringBuilder result = new StringBuilder();

        if (string.isEmpty() || chunkSize > string.length() || chunkSize <= 0) {
            return result.toString();
        }

        string = string.substring(0, (string.length() - string.length() % chunkSize));

        for (int i = 0; i < string.length(); i = i + chunkSize) {
            long cubeSum = 0;
            String convertedString;
            String subString = string.substring(i, i + chunkSize);
            for (int j = 0; j < subString.length(); j++) {
                cubeSum += Math.pow(Character.getNumericValue(subString.charAt(j)), 3);
            }

            if (cubeSum % 2 == 0) {
                convertedString = new StringBuilder(subString).reverse().toString();
            } else {
                convertedString = subString.substring(1) + subString.charAt(0);
            }

            result.append(convertedString);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(revRot("123456987653", 6));
    }

}