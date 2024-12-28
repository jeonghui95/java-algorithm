package Algorithm.Java;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class cu_1205 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        double maxnum = 0.0;
        double[] numArray = { num1 + num2, num1 - num2, num2 - num1, num1 * num2, num1 / num2, num2 / num1,
                Math.pow(num2, num1), Math.pow(num1, num2) };
        for (double d : numArray) {
            if (d > maxnum) {
                maxnum = d;
            }

        }
        System.out.printf("%.6f", maxnum);

    }
}