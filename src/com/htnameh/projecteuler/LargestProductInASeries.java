package com.htnameh.projecteuler;

/**
 * @author hemanth
 * @since 4/1/19
 */
public class LargestProductInASeries {

    public static void main(String[] args) {
        String input = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";

        long temp = getAsInteger(input.charAt(0));

        for (int j = 1; j < 13; j++) {
            temp *= getAsInteger(input.charAt(j));
        }

        long max = temp;

        System.out.println(temp);

        for (int i = 1; i < input.length() - 12; i++) {
            int prev = getAsInteger(input.charAt(i - 1));
            int index = i + 12;
            int next = getAsInteger(input.charAt(index));

            if (next == 0) {
                i = i + 24;
            } else {
                if (prev == 0) {
                    for (int j = i; j <= next; j++) {
                        temp *= getAsInteger(input.charAt(j));
                    }

                    if (temp >= max) {
                        max = temp;
                    }
                } else {
                    temp = temp / prev;
                    temp = temp * next;

                    if (temp >= max) {
                        max = temp;
                    }
                }
            }

            temp = 1;
        }

        temp = 1;

        for (int i = 1; i < input.length() - 12; i++) {
            for (int j = i; j <= i + 12; j++) {
                temp *= getAsInteger(input.charAt(j));
            }

            if (temp >= max) {
                max = temp;
            }

            temp = 1;
        }

        System.out.println(max);
    }

    private static int getAsInteger(char string) {
        return Character.getNumericValue(string);
    }
}