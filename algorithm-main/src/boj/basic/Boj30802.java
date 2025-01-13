package boj.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Boj30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2);

        int t = Integer.parseInt(st2.nextToken());
        int p = Integer.parseInt(st2.nextToken());
        int cnt = 0;

        for (int i=0;i<6;i++) {
            int x = Integer.parseInt(st.nextToken());
            if (x > t) {
                int result = (int) Math.ceil((double) x/t);
                cnt = cnt + result;
            } else if (x > 0) {
                cnt++;
            }
        }

        int x = num/p;
        int y = num%p;

        bw.write(cnt+"\n");
        bw.write(x +" "+y+"\n");
        bw.flush();
    }
}
