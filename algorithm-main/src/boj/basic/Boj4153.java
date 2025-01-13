package boj.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Boj4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            if (x == 0 && y == 0 && z == 0) {
                break;
            }

            if (Math.pow(x,2) == Math.pow(y,2) + Math.pow(z,2)) {
                bw.write("right\n");
            } else if (Math.pow(y,2) == Math.pow(x,2) + Math.pow(z, 2)) {
                bw.write("right\n");
            } else if (Math.pow(z,2) == Math.pow(x,2) + Math.pow(y,2)) {
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }
        }
        bw.flush();
    }
}
