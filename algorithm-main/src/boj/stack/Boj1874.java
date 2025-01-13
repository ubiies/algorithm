package boj.stack;

import java.io.*;
import java.util.Stack;

public class Boj1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        Stack<Integer> stack = new Stack();
        int check = 1;

        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i=0;i<n;i++) {
            while (check <= arr[i]) {
                sb.append("+\n");
                stack.push(check);
                check++;
            }
            if (!stack.empty() && stack.peek().equals(arr[i])) {
                sb.append("-\n");
                stack.pop();
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println(sb);
    }
}
