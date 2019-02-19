package com.htnameh.hackerearth.multiDimenArray;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * @author hemanth
 * @since 28/12/18
 */
public class PriorityInterview {

    public static void main(String[] args) {
        try {
            Reader reader = new Reader();
            PrintWriter writer = new PrintWriter(System.out);

            int numOfStudents = reader.nextInt();

            int[] maleArray = new int[numOfStudents];
            int[] femaleArray = new int[numOfStudents];

            int numOfMales = 0;
            int numOfFemales = 0;

            for (int i = 0; i < numOfStudents; i++) {
                String[] input = reader.readLine().split(" ");
                if (input[0].equals("0")) {
                    femaleArray[numOfFemales++] = Integer.parseInt(input[1]);
                } else {
                    maleArray[numOfMales++] = Integer.parseInt(input[1]);
                }
            }

            Arrays.sort(femaleArray, 0, numOfFemales);
            Arrays.sort(maleArray, 0, numOfMales);

            for (int j = femaleArray.length - numOfMales - 1; j >= 0; j--) {
                if (femaleArray[j] != 0) {
                    writer.print(femaleArray[j]);
                    writer.print(" ");
                }
            }

            for (int j = maleArray.length - numOfFemales - 1; j >= 0; j--) {
                if (maleArray[j] != 0) {
                    writer.print(maleArray[j]);
                    writer.print(" ");
                }
            }

            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            byte[] buf = new byte[64]; // line length
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
}
