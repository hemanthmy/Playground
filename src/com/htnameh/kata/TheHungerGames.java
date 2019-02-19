package com.htnameh.kata;

import java.util.*;

/**
 * @author hemanth
 * @since 17/1/19
 */
public class TheHungerGames {

    private static Map<String, List<String>> foodChain = new HashMap<>();

    static {
        foodChain.put("grass", null);
        foodChain.put("little-fish", null);
        foodChain.put("leaves", null);
        foodChain.put("antelope", Collections.singletonList("grass"));
        foodChain.put("big-fish", Collections.singletonList("little-fish"));
        foodChain.put("bug", Collections.singletonList("leaves"));
        foodChain.put("chicken", Collections.singletonList("bug"));
        foodChain.put("cow", Collections.singletonList("grass"));
        foodChain.put("sheep", Collections.singletonList("grass"));
        foodChain.put("giraffe", Collections.singletonList("leaves"));
        foodChain.put("panda", Collections.singletonList("leaves"));
        foodChain.put("fox", Arrays.asList("chicken", "sheep"));
        foodChain.put("lion", Arrays.asList("antelope", "cow"));
        foodChain.put("bear", Arrays.asList("bug", "leaves", "sheep", "cow", "chicken", "big-fish"));
    }

    public static void main(String[] args) {
//        String[] foodChainList = whoEatsWho("fox,bug,chicken,grass,sheep");
        String[] foodChainList = whoEatsWho("fox,chicken,sheep");

        for (String s : foodChainList) {
            System.out.println(s);
        }
    }

    private static String[] whoEatsWho(final String zoo) {
        List<String> stringList = new ArrayList<>();

        String[] zooAnimals = zoo.split(",");

        int length = zooAnimals.length;
        int currentIndex = 0;
        int prevIndex = -2;

        for (int i = 0; i < length; i++) {
            String animal = zooAnimals[i];
            if (foodChain.containsKey(animal)) {
                List<String> eatableAnimals = foodChain.get(animal);

                if (eatableAnimals != null) {
                    if (i == 0) {
                        boolean stillEatingRight = true;

                        while (stillEatingRight && currentIndex < length - 1) {
                            String rightAnimal = zooAnimals[currentIndex + 1];

                            if (eatableAnimals.contains(rightAnimal)) {
                                stringList.add(animal + " eats " + rightAnimal);
                                zooAnimals[currentIndex + 1] = "";
                                length--;
                            } else {
                                stillEatingRight = false;
                            }
                        }
                    } else if (i == length - 1) {

                    } else {

                    }
                }
            }
        }

        boolean stillEatingLeft = true;


        String[] result = new String[stringList.size()];

        for (int i = 0; i < stringList.size(); i++) {
            result[i] = stringList.get(i);
        }

        return result;
    }
}
