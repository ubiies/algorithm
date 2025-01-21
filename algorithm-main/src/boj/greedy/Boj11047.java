package boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int n = Integer.parseInt(st.nextToken()); // 사용할 동전 갯수
        int k = Integer.parseInt(st.nextToken()); // 맞춰야 하는 돈
        int cnt = 0;

        // 동전 리스트
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        list.sort(Collections.reverseOrder());

        for (int i=0;i<list.size();i++) {
            if (list.get(i) <= k) {
                cnt = cnt +  k/list.get(i);
                k = k % list.get(i);
            }
        }

        System.out.println(cnt);
    }
}
