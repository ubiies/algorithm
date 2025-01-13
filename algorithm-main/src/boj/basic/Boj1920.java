package boj.basic;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Boj1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        HashSet<Integer> nSet = new HashSet<>();

        StringTokenizer st = new StringTokenizer(str);
        for (int i=0;i<n;i++) {
            nSet.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        String str2 = br.readLine();
        int[] mArr = new int[m];

        StringTokenizer st2 = new StringTokenizer(str2);
        for (int i=0;i<m;i++) {
            mArr[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < mArr.length; i++) {
            if (nSet.contains(mArr[i])) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }
        bw.flush();
    }
}
