package boj.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> sites = new HashMap<>();

        for (int i=0;i<n;i++) {
           String site = br.readLine();
           st = new StringTokenizer(site);
           sites.put(st.nextToken(), st.nextToken());
        }

        for (int i=0;i<m;i++) {
            String find = br.readLine();
            sb.append(sites.get(find)).append("\n");
        }
        System.out.println(sb);
    }
}
