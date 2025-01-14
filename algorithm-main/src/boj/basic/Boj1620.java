package boj.basic;

import java.io.*;
import java.util.*;

public class Boj1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<Integer, String> pokemonMap = new HashMap<>();
        Map<String, Integer> reverseMap = new HashMap<>();

        for (int i=1;i<=n;i++) {
            String pokemon = br.readLine();
            pokemonMap.put(i, pokemon);
        }

        for (Map.Entry<Integer, String> entry : pokemonMap.entrySet()) {
            reverseMap.put(entry.getValue(), entry.getKey());
        }

        String[] strArr = new String[m];

       for (int i=0;i<m;i++) {
            strArr[i] = br.readLine();
       }

       for (int i=0;i<m;i++) {
           try {
               int x = Integer.parseInt(strArr[i]);
               if (pokemonMap.containsKey(x)) {
                   bw.write(pokemonMap.get(x)+"\n");
               }
           } catch (NumberFormatException e) {
               if (reverseMap.containsKey(strArr[i])) {
                   bw.write(reverseMap.get(strArr[i])+"\n");
               }
           }
       }

       bw.flush();
    }
}
