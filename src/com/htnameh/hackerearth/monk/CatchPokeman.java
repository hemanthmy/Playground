package com.htnameh.hackerearth.monk;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * @author hemanth
 * @since 7/1/19
 */
public class CatchPokeman {

    private static PrintWriter writer;

    public static void main(String[] args) {
        writer = new PrintWriter(System.out);

        try {
            Reader reader = new Reader();

            int numOfPokeman = reader.nextInt();

            int[] input = new int[numOfPokeman];

            for (int i = 0; i < numOfPokeman; i++) {
                input[i] = reader.nextInt();
            }

            int n = input.length;

            Arrays.sort(input);

            printArray(input);

            int temp = input[input.length - 1] + 1;
            int totalDays = temp;

            for (int i = input.length - 1; i >= 0; i--) {
                --temp;

                if (input[i] == temp) {
                    temp += 1;
                    totalDays += 1;
                } else if (input[i] > temp) {
                    temp += input[i] - temp;
                    totalDays += input[i] - temp;
                }
            }

            writer.print(totalDays);
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

        writer.flush();
    }

    private static void sort(int[] input, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(input, low, high);

            sort(input, low, pivotIndex - 1);
            sort(input, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] input, int low, int high) {
        int pivot = input[high];

        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (input[j] >= pivot) {
                i++;
                if (i != j) {
                    swap(input, i, j);
                }
            }
        }

        swap(input, i + 1, high);

        return i + 1;
    }

    private static void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    static class Reader {

        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {
            byte[] buf = new byte[65536]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }
    }

    private static void printArray(int[] arr) {
        for (int input : arr) writer.print(input + " ");
        writer.print("\n");
    }
}
