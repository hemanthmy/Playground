package com.htnameh.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * @author hemanth
 * @since 23/1/19
 */
public class MinimumTimeDifference {

    public static void main(String[] args) {
//        System.out.println(findMinDifference(Arrays.asList("23:59", "00:00")));
//        System.out.println(findMinDifference(Arrays.asList("01:01", "02:01", "03:00")));
        System.out.println(findMinDifference(Arrays.asList("12:12", "00:13")));
    }

    private static int findMinDifference(List<String> timePoints) {
        int minimumTime = Integer.MAX_VALUE;

        for (int i = 0; i < timePoints.size(); i++) {
            for (int j = i + 1; j < timePoints.size(); j++) {
                int hour1;
                int hour2;
                int minute1;
                int minute2;

                if ((Integer.parseInt(timePoints.get(i).split(":")[0]) == 0)) {
                    hour1 = 86400;
                } else {
                    hour1 = Integer.parseInt(timePoints.get(i).split(":")[0]) * 3600;
                }

                if ((Integer.parseInt(timePoints.get(j).split(":")[0]) == 0)) {
                    hour2 = 86400;
                } else {
                    hour2 = Integer.parseInt(timePoints.get(j).split(":")[0]) * 3600;
                }

                if (hour1 == 86400 && (Integer.parseInt(timePoints.get(i).split(":")[1]) == 0)) {
                    minute1 = 0;
                } else if (hour1 != 86400 && Integer.parseInt(timePoints.get(i).split(":")[1]) == 0) {
                    minute1 = 0;
                } else {
                    minute1 = Integer.parseInt(timePoints.get(i).split(":")[1]) * 60;
                }

                if (hour2 == 86400 && (Integer.parseInt(timePoints.get(j).split(":")[1]) == 0)) {
                    minute2 = 0;
                } else if (hour2 != 86400 && Integer.parseInt(timePoints.get(j).split(":")[1]) == 0) {
                    minute2 = 0;
                } else {
                    minute2 = Integer.parseInt(timePoints.get(j).split(":")[1]) * 60;
                }

                int diff = Math.abs((hour1 + minute1) - (hour2 + minute2));

                if (diff < minimumTime) {
                    minimumTime = diff;
                }
            }
        }

        return minimumTime / 60;
    }

}
