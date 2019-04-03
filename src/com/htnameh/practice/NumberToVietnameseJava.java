package com.htnameh.practice;

import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @author hemanth
 * @since 26/3/19
 */
public class NumberToVietnameseJava {

    private static final String[] zeroLeftPadding;
    private static final String[] digits;
    private static final String[] multipleThousand;
    private static final NumberToVietnameseJava INSTANCE;

    static {
        INSTANCE = new NumberToVietnameseJava();
        zeroLeftPadding = new String[]{"", "00", "0"};
        digits = new String[]{"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        multipleThousand = new String[]{"", "nghìn", "triệu", "tỷ", "nghìn tỷ", "triệu tỷ", "tỷ tỷ"};
    }

    private NumberToVietnameseJava() {
    }

    private String readTriple(String triple, boolean showZeroHundred) {
        List<Integer> integerList = new ArrayList<>(triple.length());

        for (int i = 0; i < triple.length(); i++) {
            integerList.add(triple.charAt(i) - 48);
        }

        int a = ((Number) integerList.get(0)).intValue();
        int b = ((Number) integerList.get(1)).intValue();
        int c = ((Number) integerList.get(2)).intValue();
        return a == 0 && b == 0 && c == 0 ? ""
                : a == 0 && showZeroHundred ? "không trăm " + this.readPair(b, c)
                : a == 0 && b == 0 ? digits[c] : a == 0 ? this.readPair(b, c) : digits[a] + " trăm " + this.readPair(b, c);
    }

    private String readPair(int b, int c) {
        StringBuilder stringBuilder;
        String var10001;
        String var3;
        switch (b) {
            case 0:
                if (c == 0) {
                    var3 = "";
                    return var3;
                }
                var3 = " lẻ " + digits[c];
                return var3;
            case 1:
                stringBuilder = (new StringBuilder()).append("mười ");
                switch (c) {
                    case 0:
                        var10001 = "";
                        break;
                    case 5:
                        var10001 = "lăm";
                        break;
                    default:
                        var10001 = digits[c];
                }

                var3 = stringBuilder.append(var10001).toString();
                break;
            default:
                stringBuilder = (new StringBuilder()).append(digits[b]).append(" mươi ");
                switch (c) {
                    case 0:
                        var10001 = "";
                        break;
                    case 1:
                        var10001 = "mốt";
                        break;
                    case 2:
                    case 3:
                    default:
                        var10001 = digits[c];
                        break;
                    case 4:
                        var10001 = "tư";
                        break;
                    case 5:
                        var10001 = "lăm";
                }

                var3 = stringBuilder.append(var10001).toString();
        }

        return var3;
    }

    private static String convert(long n) {
        String str;
        String var10000;
        if (n == 0L) {
            var10000 = "Không";
        } else if (n < 0L) {
            var10000 = "Âm " + convert(-n);
        } else {
            str = String.valueOf(n);

            String str2 = zeroLeftPadding[str.length() % 3] + str;

            final AtomicInteger counter = new AtomicInteger(0);
            Collection<String> strings = str2.chars()
                    .mapToObj(i -> String.valueOf((char) i))
                    .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / 3
                            , Collectors.joining()))
                    .values();

            List groups = StringsKt.chunked((zeroLeftPadding[str.length() % 3] + str), 3);

            List var31;

            if (groups.isEmpty()) {
                var31 = new ArrayList<>();
            } else {
                ListIterator listIterator = groups.listIterator(groups.size());

                while (true) {
                    if (!listIterator.hasPrevious()) {
                        var31 = CollectionsKt.toList(groups);
                        break;
                    }

                    String it = (String) listIterator.previous();

                    if (!Intrinsics.areEqual(it, "000")) {
                        listIterator.next();
                        int expectedSize = groups.size() - listIterator.nextIndex();
                        if (expectedSize == 0) {
                            var31 = new ArrayList<>();
                            break;
                        }

                        ArrayList var10 = new ArrayList(expectedSize);
                        ArrayList receiver = var10;

                        while (listIterator.hasNext()) {
                            receiver.add(listIterator.next());
                        }

                        var31 = var10;
                        break;
                    }
                }
            }

            boolean showZeroHundred = var31.size() < groups.size() - 1;
            Object initial$iv = "";
            int index$iv = 0;
            Object accumulator$iv = initial$iv;

            String var10001;
            StringBuilder var34;
            for (Iterator var28 = ((Iterable) groups).iterator(); var28.hasNext(); accumulator$iv = var34.append(var10001).append(' ').toString()) {
                Object element$iv = var28.next();
                int var30 = index$iv++;
                if (var30 < 0) {
                    throw new ArithmeticException("Index overflow has happened.");
                }

                String e = (String) element$iv;
                String readTriple = INSTANCE.readTriple(e, showZeroHundred && var30 > 0);
                var34 = (new StringBuilder()).append(accumulator$iv).append(' ').append(readTriple).append(' ');
                StringBuilder var18 = var34;
                boolean var19 = !StringsKt.isBlank(readTriple);
                var34 = var18;
                if (var19) {
                    String var32 = ArraysKt.getOrNull(multipleThousand, groups.size() - 1 - var30);
                    var10000 = var32;
                    if (var32 == null) {
                        var10000 = "";
                    }

                    String var35 = var10000;
                    var34 = var18;
                    var10001 = var35;
                } else {
                    var10001 = "";
                }
            }

            var10000 = (String) accumulator$iv;
        }

        CharSequence var22 = var10000;
        String var23 = "\\s+";
        Regex var24 = new Regex(var23);
        String var25 = " ";
        str = var24.replace(var22, var25);
        str = StringsKt.trim(str).toString();
        var10000 = str.toLowerCase();
        Intrinsics.checkExpressionValueIsNotNull(var10000, "(this as java.lang.String).toLowerCase()");
        return StringsKt.capitalize(var10000);
    }

    public static void main(String[] args) {
        String convert = convert(1025641);
        System.out.println(convert);
        System.out.println("Một triệu không trăm hai mươi lăm nghìn sáu trăm bốn mươi mốt".equals(convert));
    }

}