package Sample;

import java.io.*;
import java.util.*;

class cu_1114 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer result = new StringTokenizer(br.readLine());
        long a = Long.parseLong(result.nextToken());
        long b = Long.parseLong(result.nextToken());
        System.out.println(a + b);
    }
}