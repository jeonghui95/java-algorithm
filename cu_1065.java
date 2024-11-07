package Algorithm;

import java.io.*;
import java.util.*;

class cu_1065 {
    static ArrayList<Integer> AL = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        String[] stArrays = br.readLine().split(" ");
        for (String ii : stArrays) {
            // int b = ;
            // System.out.println(ii);
            if (Integer.parseInt(ii) % 2 == 0) {
                AL.add(Integer.parseInt(ii));
            }
        }
        // AL.sort(Comparator.naturalOrder());
        for (int ii : AL) {
            System.out.println(ii);
        }

    }
}
