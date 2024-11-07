package Algorithm;

import java.io.*;
import java.util.*;

class cu_1165 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer result = new StringTokenizer(br.readLine());
        int time = Integer.parseInt(result.nextToken());
        int score = Integer.parseInt(result.nextToken());
        while (time < 90) {
            score += 1;
            time += 5;
        }
        System.out.println(score);
    }
}