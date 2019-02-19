package com.htnameh.codechef;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author hemanth
 * @since 23/1/19
 */
public class XORNEY {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out), true);

            long numOfTests = Integer.parseInt(reader.readLine().trim());

            for (long i = 0; i < numOfTests; i++) {
                String[] input = reader.readLine().split(" ");

                long l = Long.parseLong(input[0]);
                long r = Long.parseLong(input[1]);
                long xored = computeXOR(l) ^ computeXOR(r - 1);

                if (xored % 2 == 0) {
                    writer.print("Even\n");
                } else {
                    writer.print("Odd\n");
                }

                writer.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static long computeXOR(long n) {
        // If n is a multiple of 4
        if (n % 4 == 0)
            return n;

        // If n%4 gives remainder 1
        if (n % 4 == 1)
            return 1;

        // If n%4 gives remainder 2
        if (n % 4 == 2)
            return n + 1;

        // If n%4 gives remainder 3
        return 0;
    }

    static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}