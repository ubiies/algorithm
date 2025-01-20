package boj.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        int cnt = 0;

        for (int i=0;i<n;i++) {
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>();
        for (int j=0;j<m;j++) {
            String name = br.readLine();
            if (set.contains(name)) {
                cnt++;
                list.add(name);
            }
        }

        Collections.sort(list);
        sb.append(cnt).append("\n");

        for (int i=0;i<list.size();i++) {
            sb.append(list.get(i)).append("\n");
        }
        System.out.print(sb);
    }
}
