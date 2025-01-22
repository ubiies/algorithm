package boj.bs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 숫자 카드2
 */
public class Boj10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] cards = new int[n];
        for (int i=0;i<n;i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        st= new StringTokenizer(br.readLine());
        int[] findCards = new int[m];
        for(int i=0;i<m;i++) {
            findCards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);

        for (int i=0;i<m;i++) {
            // 1. 첫번째 위치 찾기
            int targetFirstIndex = findFirstIndex(cards, findCards[i]);
            // 2. 찾는 값보다 큰 값이 처음 나오는 위치
            int upperTargetFirstIndex = findUpperIndex(cards, findCards[i]);

            int result = upperTargetFirstIndex - targetFirstIndex;
            sb.append(result).append(" ");
        }
        System.out.println(sb);
    }
    public static int findFirstIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        while (start < end) {
            int mid = (start+end)/2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
    public static int findUpperIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        while (start < end) {
            int mid = (start+end)/2;
            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
