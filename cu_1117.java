package Algorithm;

import java.io.*;
import java.util.*;

class cu_1117 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer result = new StringTokenizer(br.readLine());
        Double a = Double.parseDouble(result.nextToken());
        Double b = Double.parseDouble(result.nextToken());
        System.out.println(String.format("%.2f", a * b));
    }
}