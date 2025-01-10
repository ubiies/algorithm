package boj.queue;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Boj18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int commandNum = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();

        for (int i=0;i<commandNum;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    queue.add(num);
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        bw.write("-1"+"\n");
                    } else {
                        bw.write(queue.poll()+"\n");
                    }
                    break;
                case "size":
                    bw.write(queue.size()+"\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        bw.write("1"+"\n");
                    } else {
                        bw.write("0"+"\n");
                    }
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        bw.write("-1"+"\n");
                    } else {
                        bw.write(queue.peek()+"\n");
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        bw.write("-1"+"\n");
                    } else {
//                        Integer lastNum = null;
//                        for (Integer element : queue) {
//                            lastNum = element;
//                        }
//                        bw.write(lastNum+"\n");
                        bw.write(queue.getLast()+"\n");
                    }
                    break;
            }
        }
        bw.flush();
    }
}
