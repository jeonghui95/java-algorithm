package Algorithm;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class cu_1253 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        if (a <= b) {
            for (int ii = a; ii <= b; ii++) {
                System.out.printf("%s ", ii);
            }
        } else {
            for (int ii = b; ii <= a; ii++) {
                System.out.printf("%s ", ii);
            }
        }
    }

}
