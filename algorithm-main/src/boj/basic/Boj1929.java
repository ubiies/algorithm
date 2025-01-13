package boj.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Boj1929 {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i=2;i*i<=num;i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        for (int i=x;i<=y;i++) {
            if (isPrime(i)) {
                bw.write(i+"\n");
            }
        }
        bw.flush();
    }
}
