package Algorithm;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class cu_1090 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long num1 = Long.parseLong(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());
        for (int ii = 1; ii <= num3 - 1; ii++) {
            num1 = num1 * num2;
        }
        System.out.print(num1);
    }
}