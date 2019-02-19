package com.htnameh.hackerearth.linkedlist;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Stack;

/**
 * @author hemanth
 * @since 27/12/18
 */
public class RemoveFriends {

    public static void main(String[] args) {
        try {
            Reader reader = new Reader();
            PrintWriter writer = new PrintWriter(System.out);

            int numOfTests = reader.nextInt();

            for (int i = 0; i < numOfTests; i++) {
                int totalFriends = reader.nextInt();
                int numOfFriendsToDelete = reader.nextInt();

                ArrayDeque<Integer> queue = new ArrayDeque<>();
                Stack<Integer> stack = new Stack<>();

                for (int j = 0; j < totalFriends; j++) {
                    int input = reader.nextInt();
                    queue.add(input);
                }

                while (numOfFriendsToDelete > 0 && !queue.isEmpty()) {
                    int item = queue.pop();
                    boolean a = true;
                    if (a && (item == 66 || item == 67)) {
                        a = false;
                    }
                    if (queue.peek() != null && item >= queue.peek()) {
                        if (stack.isEmpty()) {
                            stack.push(item);
                        } else {
                            boolean isChecking = true;
                            while (isChecking) {
                                if (numOfFriendsToDelete > 0 && !stack.isEmpty() && item > stack.peek()) {
                                    stack.pop();
                                    numOfFriendsToDelete--;
                                } else {
                                    isChecking = false;
                                    stack.push(item);
                                }
                            }
                        }
                    } else {
                        numOfFriendsToDelete--;
                    }
                }

                Stack<Integer> stack2 = new Stack<>();

                if (stack.isEmpty()) {
                    while (!queue.isEmpty()) {
                        writer.print(queue.pop());
                        writer.print(" ");
                    }
                } else {
                    while (!stack.isEmpty()) {
                        stack2.add(stack.pop());
                    }

                    while (!stack2.isEmpty()) {
                        writer.print(stack2.pop());
                        writer.print(" ");
                    }

                    while (!queue.isEmpty()) {
                        writer.print(queue.pop());
                        writer.print(" ");
                    }
                }

                writer.print("\n");
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
