package com.htnameh.leetcode;

import java.text.DecimalFormat;

/**
 * @author hemanth
 * @since 15/3/19
 */
public class HappyNumber {

    private static final String[] tensNamesEnglish = {"", " ten", " twenty", " thirty", " forty", " fifty", " sixty",
            " seventy", " eighty", " ninety"};

    private static final String[] tensNamesVietnamese = {"", " mười", " hai mươi", " ba mươi", " bốn mươi",
            " năm mươi", " sáu mươi", " bảy mươi", " tám mươi", " chín mươi"};

    private static final String[] numNamesEnglish = {"", " one", " two", " three", " four", " five", " six", " seven",
            " eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
            " seventeen", " eighteen", " nineteen"};

    private static final String[] numNamesVietnamese = {"", " một", " hai", " số ba", " bốn", " số năm", " sáu",
            " bảy", " tám", " chín", " mười", " mười một", " mười hai", " mười ba", " mười bốn", " mười lăm",
            " mười sáu", " mười bảy", " mười tám", " mười chín"};

    private static final String[] otherNamesVietnamese = {" trăm", " ngàn ", " triệu ", " tỷ "};
    private static final String[] otherNamesEnglish = {" hundred", " thousand ", " million ", " billion "};

    private static String[] tensNames = tensNamesVietnamese;
    private static String[] numNames = numNamesVietnamese;
    private static String[] otherNames = otherNamesVietnamese;

    private static String convertLessThanOneThousand(int number) {
        String soFar;

        if (number % 100 < 20) {
            soFar = numNames[number % 100];
            number /= 100;
        } else {
            soFar = numNames[number % 10];
            number /= 10;

            soFar = tensNames[number % 10] + soFar;
            number /= 10;
        }
        if (number == 0)
            return soFar;
        return numNames[number] + otherNames[0] + soFar;
    }

    public static String getAmountInWords(long number, boolean isEnglish) {

        if (isEnglish) {
            numNames = numNamesEnglish;
            tensNames = tensNamesEnglish;
            otherNames = otherNamesEnglish;
        }

        // 0 to 999 999 999 999
        if (number == 0) {
            return "zero";
        }

        String snumber = Long.toString(number);

        // pad with "0"
        String mask = "000000000000";
        DecimalFormat df = new DecimalFormat(mask);
        snumber = df.format(number);

        // XXXnnnnnnnnn
        int billions = Integer.parseInt(snumber.substring(0, 3));
        // nnnXXXnnnnnn
        int millions = Integer.parseInt(snumber.substring(3, 6));
        // nnnnnnXXXnnn
        int hundredThousands = Integer.parseInt(snumber.substring(6, 9));
        // nnnnnnnnnXXX
        int thousands = Integer.parseInt(snumber.substring(9, 12));

        String tradBillions;
        switch (billions) {
            case 0:
                tradBillions = "";
                break;
            case 1:
                tradBillions = convertLessThanOneThousand(billions) + otherNames[3];
                break;
            default:
                tradBillions = convertLessThanOneThousand(billions) + otherNames[3];
        }
        String result = tradBillions;

        String tradMillions;
        switch (millions) {
            case 0:
                tradMillions = "";
                break;
            case 1:
                tradMillions = convertLessThanOneThousand(millions) + otherNames[2];
                break;
            default:
                tradMillions = convertLessThanOneThousand(millions) + otherNames[2];
        }
        result = result + tradMillions;

        String tradHundredThousands;
        switch (hundredThousands) {
            case 0:
                tradHundredThousands = "";
                break;
            case 1:
                tradHundredThousands = numNames[1] + otherNames[1];
                break;
            default:
                tradHundredThousands = convertLessThanOneThousand(hundredThousands) + otherNames[1];
        }
        result = result + tradHundredThousands;

        String tradThousand;
        tradThousand = convertLessThanOneThousand(thousands);
        result = result + tradThousand;

        // remove extra spaces!
        result = result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");

        String currency = isEnglish ? " dong" : " đồng";

        result = result + currency;

        // Capitalize the first character
        result = captitalizeFirstChar(result);

        return result;
    }

    /**
     * Capitalizes the first character of the input text
     *
     * @param str Text to be capitalized
     * @return Input text with first character capitalized
     */
    private static String captitalizeFirstChar(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
