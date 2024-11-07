package Algorithm;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

// class cu_1167 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         // StringTokenizer result = new StringTokenizer(br.readLine());
//         List<String> SampleList = Arrays.asList(br.readLine().split(" "));
//         List<Integer> numbers = SampleList.stream().map(n -> Integer.parseInt(n)).collect(Collectors.toList());
//         numbers.sort(Comparator.naturalOrder());
//         System.out.println(numbers.get(1));
//     }
// }

class cu_1167 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());
        int[] numArray = { num1, num2, num3 };
        for (int ii : numArray) {
            int cnt = 0;
            for (int jj : numArray) {
                if (ii != jj && ii > jj) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                System.out.println(ii);
            }
        }
    }
}