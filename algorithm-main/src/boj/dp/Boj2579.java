package boj.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 계단 오르기
 */
public class Boj2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] stairs = new int[n];
        int sum = 0;

        for (int i=0;i<n;i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }


    }
}
