package boj.basic;

import java.io.*;
import java.sql.Array;
import java.util.*;

public class Boj18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int x = (int) Math.round(n*0.15);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        int sum = 0;

        for (int i=x;i<n-x;i++) {
            sum += list.get(i);
        }

        int size = n - 2 * x;

        int avg = Math.round((float) sum / size);
        bw.write(avg+"\n");
        bw.flush();
    }
}
