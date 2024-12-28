package Algorithm.Java;
import java.io.*;
import java.util.*;

class cu_1150 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        ArrayList<Integer> intArray = new ArrayList<>(Arrays.asList(a, b, c));
        intArray.sort(Comparator.naturalOrder());
        System.out.println(intArray.get(0));
    }
}
