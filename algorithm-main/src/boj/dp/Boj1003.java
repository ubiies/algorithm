package boj.dp;

import java.io.*;

public class Boj1003 {
    static int cnt0 = 0;
    static int cnt1 = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[][] dp = new int[41][2];
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        for (int i=2;i<=40;i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }

        for (int i=0;i<n;i++) {
            int result = Integer.parseInt(br.readLine());
            sb.append(dp[result][0]).append(" ").append(dp[n][1]).append("\n");
        }
        System.out.println(sb);
    }

    public static void fibonacci (int n) {
        if (n == 0) {
            cnt0++;
        } else if (n==1) {
            cnt1++;
        } else {
            fibonacci(n-1);
            fibonacci(n-2);
        }
    }
}
