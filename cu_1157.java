package Algorithm;

import java.io.*;
import java.util.*;

class cu_1157 {
    static ArrayList<Integer> AL = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double score = Double.parseDouble(br.readLine());
        if (score >= 50.0 && score <= 60.0) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }
    }
}
