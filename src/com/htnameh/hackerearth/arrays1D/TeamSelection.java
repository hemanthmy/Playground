package com.htnameh.hackerearth.arrays1D;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hemanth
 * @since 26/12/18
 */
public class TeamSelection {

    public static void main(String[] args) {
        try {
            Reader reader = new Reader();
            PrintWriter writer = new PrintWriter(System.out);

            int arrSize = reader.nextInt();

            int[] team1 = new int[arrSize];
            int[] team2 = new int[arrSize];

            Map<Integer, Long> teamMap = new HashMap<>();

            long numOfTeams = 0;

            for (int i = 0; i < arrSize; i++) {
                team1[i] = reader.nextInt();
                long count = 0;

                if (teamMap.isEmpty()) {
                    teamMap.put(team1[i], 0L);
                } else {
                    for (Integer key : teamMap.keySet()) {
                        if (team1[i] > key) {
                            count++;
                        }
                    }

                    teamMap.put(team1[i], teamMap.getOrDefault(team1[i], 0L) + count);
                }

            }

            for (int i = 0; i < arrSize; i++) {
                team2[i] = reader.nextInt();
                for (Integer key : teamMap.keySet()) {
                    if (team2[i] > key) {
                        numOfTeams = numOfTeams + teamMap.get(key);
                    }
                }
            }

            writer.print(numOfTeams);
            writer.print("\n");

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
