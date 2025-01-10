package boj.stack;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Boj4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<String> stack = new Stack<>();

        String str = "";
        List<String> sentenceList = new ArrayList<>();

        while (true) {
            str = br.readLine();
            if (str.equals(".")) break;
            sentenceList.add(str);
        }

        for (String string : sentenceList) {
            String[] strArr = string.split("");
            for (String s : strArr) {
                if (s.equals("(") || s.equals("[")) {
                    stack.push(s);
                } else {
                    if (!stack.empty()) {
                        if (s.equals(")") && stack.peek().equals("(")) {
                            stack.pop();
                        } else if (s.equals("]") && stack.peek().equals("[")) {
                            stack.pop();
                        } else if (s.equals("]") || s.equals((")"))) {
                            stack.push(s);
                        }
                    } else if (s.equals("]") || s.equals(")")) {
                        stack.push(s);
                    }
                }
            }
            if (stack.empty()) {
                bw.write("yes" + "\n");
            } else {
                bw.write("no" + "\n");
            }
            stack.clear();
            bw.flush();
        }
    }
}
