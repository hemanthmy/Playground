package com.htnameh.hackerearth.arrays1D;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author hemanth
 * @since 20/12/18
 */
public class BeautifulDay {

    public static void main(String[] args) {
        try {
            Reader reader = new Reader();
            PrintWriter writer = new PrintWriter(System.out);

            int numOfCheckPoints = reader.nextInt();
            int[] checkPoints = new int[numOfCheckPoints];
            long totalBeautySum = 0;

            for (int i = 0; i < numOfCheckPoints; i++) {
                int beautyValue = reader.nextInt();
                totalBeautySum = totalBeautySum + beautyValue;
                checkPoints[i] = beautyValue;
            }

            long midValue = totalBeautySum / 2;

            long sumOfSubArray1 = 0;
            long sumOfSubArray2 = 0;

            for (int i = 0; i < checkPoints.length; i++) {
                sumOfSubArray1 += checkPoints[i];

                if (sumOfSubArray1 >= midValue) {
                    break;
                }
            }

            for (int i = 0; i < checkPoints.length; i++) {
                sumOfSubArray2 += checkPoints[i];

                if (sumOfSubArray2 == midValue) {
                    break;
                } else if (sumOfSubArray2 > midValue) {
                    sumOfSubArray2 = sumOfSubArray2 - checkPoints[i];
                    break;
                }
            }

            long result1 = sumOfSubArray1 * (totalBeautySum - sumOfSubArray1);
            long result2 = sumOfSubArray2 * (totalBeautySum - sumOfSubArray2);

            writer.print(result1 > result2 ? result1 : result2);
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
