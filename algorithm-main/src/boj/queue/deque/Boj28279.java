package boj.queue.deque;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Boj28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deq = new LinkedList<>();

        for (int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            switch (command) {
                case 1:
                    int input1 = Integer.parseInt(st.nextToken());
                    deq.addFirst(input1);
                    break;
                case 2:
                    int input2 = Integer.parseInt(st.nextToken());
                    deq.addLast(input2);
                    break;
                case 3:
                    if (deq.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deq.poll() + "\n");
                    }
                    break;
                case 4:
                    if (deq.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deq.pollLast() + "\n");
                    }
                    break;
                case 5:
                    bw.write(deq.size() + "\n");
                    break;
                case 6:
                    if (deq.isEmpty()) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                case 7:
                    if (deq.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deq.getFirst() + "\n");
                    }
                    break;
                case 8:
                    if (deq.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deq.getLast() + "\n");
                    }
                    break;
            }
        }
        bw.flush();
    }
}
