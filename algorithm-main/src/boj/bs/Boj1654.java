package boj.bs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 랜선 자르기
 */
public class Boj1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int k = Integer.parseInt(st.nextToken()); // 이미 가지고 있는 랜선의 갯수
        int n = Integer.parseInt(st.nextToken()); // 필요한 랜선 갯수

        int[] arr = new int[k];

        for (int i=0;i<k;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        long start = 1;
        long end = Arrays.stream(arr).max().getAsInt();
        long result = 0;

        while (start <= end) {
            long mid = (start + end) / 2;
            long cnt = 0;
            for (int length : arr) {
                cnt += length/mid;
            }
            if (cnt >= n) {
                result = mid;
                start = mid+1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(result);
    }
}
