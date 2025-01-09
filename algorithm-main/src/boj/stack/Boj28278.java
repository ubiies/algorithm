package boj.stack;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int x = Integer.parseInt(br.readLine());

        for (int i=0;i<x;i++) {
            StringTokenizer st  = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            switch (command) {
                case 1:
                    int num = Integer.parseInt(st.nextToken());
                    stack.push(num);
                    break;
                case 2:
                    if (!stack.empty()) {
                        bw.write(stack.pop()+"\n");
                    } else {
                        bw.write("-1"+"\n");
                    }
                    break;
                case 3:
                    bw.write(stack.size()+"\n");
                    break;
                case 4:
                    if (stack.empty()) {
                        bw.write("1"+"\n");
                    } else {
                        bw.write("0"+"\n");
                    }
                    break;
                case 5:
                    if (!stack.empty()) {
                        bw.write(stack.peek()+"\n");
                    } else {
                        bw.write("-1"+"\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
