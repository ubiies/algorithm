package boj.bs;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 5, 8, 7, 6, 10, 9, 11, 16, 15, 19, 12, 43, 21, 57, 34};
        int target = 15;

        // 1, 배열 정렬
        Arrays.sort(arr);

        System.out.println(binarySearch(arr, target));
    }

    // 2. 이분 탐색
    public static int binarySearch(int arr[], int target) {
        int start = 0; // 시작 인덱스
        int end = arr.length - 1; // 끝 인덱스

        while (start <= end) {
            int mid = (start+end)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1; // 왼쪽 탐색
            } else {
                end = mid - 1; // 오른쪽 탐색
            }
        }
        return 0; // 값 없음
    }
}
