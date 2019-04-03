package com.htnameh.practice;

/**
 * @author hemanth
 * @since 15/2/19
 */
class NumberToWordsConverter {

    // region ENGLISH constants

    private static final String[] ENG_SPECIALS = {"", " thousand", " million", " billion", " trillion", " quadrillion",
            " quintillion"};

    private static final String[] ENG_TENS = {"", " ten", " twenty", " thirty", " forty", " fifty", " sixty",
            " seventy", " eighty", " ninety"};

    private static final String[] ENG_NUMBERS = {"", " one", " two", " three", " four", " five", " six", " seven",
            " eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
            " seventeen", " eighteen", " nineteen"};

    // endregion

    // region VIETNAMESE constants

    private static final String[] VIETNAMESE_SPECIALS = {"", " ngàn", " triệu", " tỷ", " nghìn tỷ", " một phần tư triệu",
            " một triệu"};

    private static final String[] VIETNAMESE_TENS = {"", " mười", " hai mươi", " ba mươi", " bốn mươi", " năm mươi", " sáu mươi",
            " bảy mươi", " tám mươi", " chín mươi"};

    private static final String[] VIETNAMESE_NUMBERS = {"", " một", " hai", " số ba", " bốn", " số năm", " sáu", " bảy",
            " tám", " chín", " mười", " mười một", " mười hai", " mười ba", " mười bốn", " mười lăm", " mười sáu",
            " mười bảy", " mười tám", " mười chín"};

    // endregion

    static String convert(int number, boolean isEnglish) {
        if (number == 0) {
            return isEnglish ? "zero" : "";
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
                String s = convertLessThanOneThousand(n, isEnglish);
                current.insert(0, s + getSpecialsAsWord(place, isEnglish));
            }
            place++;
            number /= 1000;
        } while (number > 0);

        return (prefix + current).trim();
    }

    private static String convertLessThanOneThousand(int number, boolean isEnglish) {
        String current;

        if (number % 100 < 20) {
            current = getNumberAsWord(number % 100, isEnglish);
            number /= 100;
        } else {
            current = getNumberAsWord(number % 10, isEnglish);
            number /= 10;

            current = getTensAsWord(number % 10, isEnglish) + current;
            number /= 10;
        }
        if (number == 0)
            return current;
        return getNumberAsWord(number, isEnglish) + " hundred" + current;
    }

    private static String getNumberAsWord(int number, boolean isEnglish) {
        return isEnglish ? ENG_NUMBERS[number] : VIETNAMESE_NUMBERS[number];
    }

    private static String getTensAsWord(int number, boolean isEnglish) {
        return isEnglish ? ENG_TENS[number] : VIETNAMESE_TENS[number];
    }

    private static String getSpecialsAsWord(int number, boolean isEnglish) {
        return isEnglish ? ENG_SPECIALS[number] : VIETNAMESE_SPECIALS[number];
    }

}