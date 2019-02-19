package com.htnameh.kata;

import java.util.Arrays;

/**
 * @author hemanth
 * @since 13/12/18
 */
public class AthleticAssociationStats {

    public static String stat(String string) {
        if (string.isEmpty()) {
            return "";
        }

        int largestIndex = 0;
        int smallestIndex = 0;

        String[] inputArray = string.split(",");
        int[] medianSortedArray = new int[inputArray.length];

        int hoursSum = Integer.parseInt(inputArray[0].trim().split("\\|")[0]);
        int minutesSum = Integer.parseInt(inputArray[0].trim().split("\\|")[1]);
        int secondsSum = Integer.parseInt(inputArray[0].trim().split("\\|")[2]);

        medianSortedArray[0] = ((hoursSum * 3600) + (minutesSum * 60) + secondsSum);

        for (int i = 1; i < inputArray.length; i++) {
            String[] largestTime = inputArray[largestIndex].trim().split("\\|");
            String[] smallestTime = inputArray[smallestIndex].trim().split("\\|");
            String[] time = inputArray[i].trim().split("\\|");

            if (Integer.parseInt(time[0]) > Integer.parseInt(largestTime[0])) {
                largestIndex = i;
            } else if (Integer.parseInt(time[0]) == Integer.parseInt(largestTime[0])) {
                if (Integer.parseInt(time[1]) > Integer.parseInt(largestTime[1])) {
                    largestIndex = i;
                } else if (Integer.parseInt(time[1]) == Integer.parseInt(largestTime[1])) {
                    if (Integer.parseInt(time[2]) > Integer.parseInt(largestTime[2])) {
                        largestIndex = i;
                    }
                }
            }

            if (Integer.parseInt(time[0]) < Integer.parseInt(smallestTime[0])) {
                smallestIndex = i;
            } else if (Integer.parseInt(time[0]) == Integer.parseInt(smallestTime[0])) {
                if (Integer.parseInt(time[1]) < Integer.parseInt(smallestTime[1])) {
                    smallestIndex = i;
                } else if (Integer.parseInt(time[1]) == Integer.parseInt(smallestTime[1])) {
                    if (Integer.parseInt(time[2]) < Integer.parseInt(smallestTime[2])) {
                        smallestIndex = i;
                    }
                }
            }

            hoursSum += Integer.parseInt(inputArray[i].trim().split("\\|")[0]);
            minutesSum += Integer.parseInt(inputArray[i].trim().split("\\|")[1]);
            secondsSum += Integer.parseInt(inputArray[i].trim().split("\\|")[2]);

            medianSortedArray[i] = Integer.parseInt(inputArray[i].trim().split("\\|")[0]) * 3600
                    + Integer.parseInt(inputArray[i].trim().split("\\|")[1]) * 60
                    + Integer.parseInt(inputArray[i].trim().split("\\|")[2]);
        }

        int averageTimeInSeconds = ((hoursSum * 3600) + (minutesSum * 60) + secondsSum) / inputArray.length;

        String averageTimeResult = String.format("%02d", (averageTimeInSeconds / 3600)) + "|"
                + String.format("%02d", ((averageTimeInSeconds / 60) % 60)) + "|"
                + String.format("%02d", (averageTimeInSeconds % 60));

        Arrays.sort(medianSortedArray);

        String medianTimeResult;
        int medianTimeInSeconds;
        hoursSum = 0;
        minutesSum = 0;
        secondsSum = 0;

        if (inputArray.length % 2 == 0) {
            int medianIndex = inputArray.length / 2;
            hoursSum += Integer.parseInt(inputArray[medianIndex].trim().split("\\|")[0]);
            minutesSum += Integer.parseInt(inputArray[medianIndex].trim().split("\\|")[1]);
            secondsSum += Integer.parseInt(inputArray[medianIndex].trim().split("\\|")[2]);

            System.out.println(hoursSum);
            System.out.println(minutesSum);
            System.out.println(secondsSum);

            hoursSum += Integer.parseInt(inputArray[medianIndex - 1].trim().split("\\|")[0]);
            minutesSum += Integer.parseInt(inputArray[medianIndex - 1].trim().split("\\|")[1]);
            secondsSum += Integer.parseInt(inputArray[medianIndex - 1].trim().split("\\|")[2]);

            System.out.println(hoursSum);
            System.out.println(minutesSum);
            System.out.println(secondsSum);

            medianTimeInSeconds = ((hoursSum * 3600) + (minutesSum * 60) + secondsSum) / 2;
        } else {
            medianTimeInSeconds = medianSortedArray[medianSortedArray.length / 2];
        }

        medianTimeResult = String.format("%02d", (medianTimeInSeconds / 3600)) + "|"
                + String.format("%02d", ((medianTimeInSeconds / 60) % 60)) + "|"
                + String.format("%02d", (medianTimeInSeconds % 60));

        String[] splitLargest = inputArray[largestIndex].trim().split("\\|");
        String[] splitSmallest = inputArray[smallestIndex].trim().split("\\|");

        int largestTimeInSec = ((Integer.parseInt(splitLargest[0]) * 3600)
                + (Integer.parseInt(splitLargest[1]) * 60)
                + Integer.parseInt(splitLargest[2]));
        int smallestTimeInSec = ((Integer.parseInt(splitSmallest[0]) * 3600)
                + (Integer.parseInt(splitSmallest[1]) * 60)
                + Integer.parseInt(splitSmallest[2]));

        int rangeTimeInSec = largestTimeInSec - smallestTimeInSec;

        String rangeTimeResult = String.format("%02d", (rangeTimeInSec / 3600)) + "|"
                + String.format("%02d", ((rangeTimeInSec / 60) % 60)) + "|"
                + String.format("%02d", (rangeTimeInSec % 60));

        System.out.println(rangeTimeResult);
        System.out.println(averageTimeResult);
        System.out.println(medianTimeResult);

        return "Range: " + rangeTimeResult +
                " Average: " + averageTimeResult +
                " Median: " + medianTimeResult;
    }

}