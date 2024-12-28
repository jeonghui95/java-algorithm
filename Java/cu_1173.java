package Algorithm.Java;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class cu_1173 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        if (min < 30) {
            hour--;
            min = min + 30;
        } else {
            min -= 30;
        }
        if (hour < 0) {
            hour = 23;
        }
        System.out.printf("%s %s", hour, min);
    }
}