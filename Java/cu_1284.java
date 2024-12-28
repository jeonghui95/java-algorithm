package Algorithm.Java;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class cu_1284 {
    static ArrayList<Integer> Lst = new ArrayList<>();

    static void numDivide(int num) {
        for (int ii = 2; ii <= num; ii++) {
            if (num % ii == 0) {
                // System.out.println(ii);
                Lst.add(ii);
                numDivide(num / ii);
                break;
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        numDivide(num);
        if (Lst.size() == 2) {
            int renum = Lst.get(0);
            System.out.printf("%s %s", renum, num / renum);
        } else {
            // System.out.println(Lst.size());
            // System.out.println(Lst);
            System.out.print("wrong number");
        }

    }
}