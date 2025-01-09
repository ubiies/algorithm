package boj.stack;

import java.io.*;
import java.util.Stack;

public class Boj9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<String> stack = new Stack<>();

        int x = Integer.parseInt(br.readLine());

        for (int i = 0; i < x; i++) {
            String command = br.readLine();
            String[] str = command.split("");
            for (int j=0;j<str.length;j++) {
                if (str[j].equals("(")) {
                    stack.push(str[j]);
                } else {
                    if (!stack.empty() && stack.peek().equals("(")) {
                        stack.pop();
                    } else {
                        stack.push(str[j]);
                    }
                }
            }
            if (stack.empty()) {
                bw.write("YES" + "\n");
            } else {
                bw.write("NO" + "\n");
            }
            stack.clear();
        }
        bw.flush();
    }
}
