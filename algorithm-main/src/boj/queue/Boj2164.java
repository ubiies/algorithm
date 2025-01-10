package boj.queue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Boj2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        for (int i=1;i<=num;i++) {
            q.add(i);
        }
        while (q.size() > 1) {
            q.poll();
            int current = q.poll();
            q.add(current);
        }
        bw.write(q.peek()+"\n");
        bw.flush();
    }
}
