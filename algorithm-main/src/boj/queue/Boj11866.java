package boj.queue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();

        for (int i=1;i<=n;i++) {
            q.add(i);
        }

        bw.write("<");
        for (int i=0;i<n;i++) {
           for (int j=0;j<k-1;j++) {
               if (!q.isEmpty()) {
                   int a = q.poll();
                   q.add(a);
               }
           }
           int b = q.poll();
           if (i == n-1) {
               bw.write(b+"");
               break;
           }
           bw.write(b+", ");
        }
        bw.write(">");
        bw.flush();
    }
}
