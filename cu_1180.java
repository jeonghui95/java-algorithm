package Algorithm;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class cu_1180 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int ten = (num1 / 10);
        int one = num1 % 10;
        int renew = ((one * 10 + ten) * 2) % 100;
        System.out.println(renew);
        if (renew <= 50) {
            System.out.println("GOOD");
        } else {
            System.out.println("OH MY GOD");
        }
    }
}