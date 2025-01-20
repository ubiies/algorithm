package boj.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=20;i++) {
            list.add(i);
        }
        Set<Integer> set = new HashSet<>();

        for (int i=0;i<n;i++) {
             String str = br.readLine();
             StringTokenizer st = new StringTokenizer(str);
             String command = st.nextToken();
            int x;
             switch (command) {
                 case "add":
                     x = Integer.parseInt(st.nextToken());
                     set.add(x);
                     break;
                 case "remove":
                     x = Integer.parseInt(st.nextToken());
                     set.remove(x);
                     break;
                 case "check":
                     x = Integer.parseInt(st.nextToken());
                     sb.append(set.contains(x) ? "1":"0" ).append("\n");
                     break;
                 case "toggle":
                     x = Integer.parseInt(st.nextToken());
                     if (set.contains(x)) {
                         set.remove(x);
                     } else {
                         set.add(x);
                     }
                     break;
                 case "all":
                     set.clear();
                     set.addAll(list);
                     break;
                 case "empty":
                     set.clear();
                     break;
             }
        }
        System.out.println(sb);



    }
}
