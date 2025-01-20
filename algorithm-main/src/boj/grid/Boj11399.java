package boj.grid;

import java.io.*;
import java.util.*;

/**
 * 그리디 알고리즘
 */
public class Boj11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        Integer[] arr = new Integer[n];

        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 1. 가장 큰 값부터 선택
        Arrays.sort(arr);

        int prev = 0;
        int sum = 0;

        for (int i=0;i<n;i++) {
            sum += prev + arr[i];
            prev += arr[i];
        }

        bw.write(sum + "\n");
        bw.flush();
    }
}
