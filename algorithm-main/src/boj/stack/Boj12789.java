package boj.stack;

import java.io.*;
import java.util.*;

public class Boj12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String student = br.readLine();
        String[] strArr = student.split(" ");
        Stack<Integer> stack = new Stack<>();
        int ticket = 1;
        String result = "Nice";

        for (int i=0;i<num;i++) {
            int current = Integer.parseInt(strArr[i]);
            if (ticket != current) {
                if (!stack.empty() && ticket == stack.peek()) {
                    ticket++;
                    i--;
                    stack.pop();
                } else {
                    stack.push(current);
                }
            } else {
                ticket++;
            }
        }

        while (!stack.empty()) {
            if (stack.peek() == ticket) {
                stack.pop();
                ticket++;
            } else {
                result = "Sad";
                break;
            }
        }

        System.out.println(result);

    }
}
