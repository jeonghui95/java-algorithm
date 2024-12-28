package Algorithm.Java;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class cu_1283 {
    // static char[] charArray = {'a','b','c','d','e','f','g','h','i'}

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double money = Double.parseDouble(br.readLine());
        double won = money;
        int month = Integer.parseInt(br.readLine());
        String[] percentArray = br.readLine().split(" ");
        for (String ii : percentArray) {
            int percent = Integer.parseInt(ii);
            money = money * (100 + percent) / 100;
        }
        int dec = Integer.parseInt(String.format("%.0f", money - won));
        System.out.println(dec);
        if (dec < 0) {
            System.out.println("bad");
        } else if (dec == 0) {
            System.out.println("same");
        } else {
            System.out.println("good");
        }
    }

}
