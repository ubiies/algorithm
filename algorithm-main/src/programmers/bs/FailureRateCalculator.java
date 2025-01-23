package programmers.bs;

import java.util.*;

public class FailureRateCalculator {
    public int[] solution(int N, int[] stages) {
        Arrays.sort(stages);

        int cnt = 0;
        Map<Integer, Double> map = new HashMap<>();

        for (int i=1;i<=N;i++) {
            int firstIndex = firstIndex(stages, i);
            int upperIndex = upperIndex(stages, i);
            // 스테이지에 머물러 있는 사람
            int x = upperIndex - firstIndex;
            // 실패율
            double ratings = 0;
            if (x != 0) {
                ratings = (double) x /(stages.length-cnt);
            }
            cnt += x;
            map.put(i, ratings);
        }

        return map.entrySet().stream().sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue())).mapToInt(Map.Entry::getKey).toArray();
    }

    public int firstIndex(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (left + right)/2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public int upperIndex(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (left + right)/2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
