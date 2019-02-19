package com.htnameh.kata;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hemanth
 * @since 21/1/19
 */
public class Tour {

    public static void main(String[] args) {
        String[] friends = new String[]{"A1", "A2", "A3", "A5", "A4"};
        String[][] fTowns = {new String[]{"A1", "X1"}, new String[]{"A2", "X2"}, new String[]{"A3", "X3"},
                new String[]{"A4", "X4"}};
        Map<String, Double> distTable = new HashMap<>();
        distTable.put("X1", 100.0);
        distTable.put("X2", 200.0);
        distTable.put("X3", 250.0);
        distTable.put("X4", 300.0);

        System.out.println(tour(friends, fTowns, distTable));
    }

    private static int tour(String[] friends, String[][] friendsTowns, Map<String, Double> distanceTable) {
        Map<String, String> friendsTownMap = new HashMap<>();

        for (String[] friendsTown : friendsTowns) {
            friendsTownMap.put(friendsTown[0], friendsTown[1]);
        }

        double totalDistance = 0;
        String lastFriend = "";

        for (int i = 0; i < friends.length; i++) {
            if (friendsTownMap.containsKey(friends[i])) {
                if (totalDistance == 0) {
                    totalDistance += distanceTable.get(friendsTownMap.get(friends[i]));
                } else {
                    String previousFriend = "";

                    for (int j = i - 1; j >= 0; j--) {
                        if (friendsTownMap.containsKey(friends[j])) {
                            previousFriend = friends[j];
                            break;
                        }
                    }

                    totalDistance += Math.sqrt(Math.abs(Math.pow(distanceTable.get(friendsTownMap.get(previousFriend)), 2)
                            - Math.pow(distanceTable.get(friendsTownMap.get(friends[i])), 2)));
                }
                lastFriend = friends[i];
            }
        }

        totalDistance += distanceTable.get(friendsTownMap.get(lastFriend));

        return (int) totalDistance;
    }

}