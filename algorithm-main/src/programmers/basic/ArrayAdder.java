package programmers.basic;

import java.util.Collections;
import java.util.HashSet;

public class ArrayAdder {
    public static int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();

        for (int i=0;i<numbers.length;i++) {
            for (int j=i+1;j<numbers.length;j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }

        int[] result = set.stream().sorted().mapToInt(Integer::intValue).toArray();

        return result;
    }
}
