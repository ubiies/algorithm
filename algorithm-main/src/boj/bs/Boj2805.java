package boj.bs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 나무 자르기
 */
public class Boj2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] trees = new int[n];

        for (int i=0;i<n;i++) {
            trees[i] = Integer.parseInt(st.nextToken());
        }

        long start = 1;
        long maxLength = Arrays.stream(trees).max().getAsInt();
        long result = 0;

        while (start<=maxLength) {
            long mid = (start+ maxLength)/2;
            long cnt = 0;

            for (int length : trees) {
                cnt += length/mid;
            }
            if (cnt >= n) {
                result = mid;
                start = mid + 1;
            } else {
                maxLength = mid - 1;
            }
        }

        System.out.println(result);
    }
}
