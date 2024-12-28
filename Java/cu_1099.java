package Algorithm.Java;
import java.io.*;
import java.util.*;

class cu_1099 {
    // static int a;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<int[]> antArray = new ArrayList<int[]>();
        for (int ii = 0; ii <= 9; ii++) {
            // int[] data = Arrays.asList(br.readLine().split(" ")).stream().map(a ->
            // Integer.parseInt(a)).toArray();
            int[] data = Arrays.stream(br.readLine().split(" ")) // 문자열 배열 스트림 생성
                    .mapToInt(Integer::parseInt) // 각 요소를 Integer로 변환 후 int로 매핑
                    .toArray(); // int[] 배열로 수집
            antArray.add(data);

        }
        int[] point = { 1, 1 };

        while (true) {
            if (antArray.get(point[0])[point[1]] == 2) {
                antArray.get(point[0])[point[1]] = 9;
                break;
            } else if (antArray.get(point[0])[point[1]] == 0) {
                antArray.get(point[0])[point[1]] = 9;
                break;
            }
            if (point[1] + 1 <= 9 && antArray.get(point[0])[point[1] + 1] != 1) {
                if (antArray.get(point[0])[point[1] + 1] == 0) {
                    point[1]++;
                    antArray.get(point[0])[point[1]] = 9;
                } else if (antArray.get(point[0])[point[1] + 1] == 2) {
                    point[1]++;
                    antArray.get(point[0])[point[1]] = 9;
                    break;
                }
            } else if (point[0] + 1 <= 9 && antArray.get(point[0] + 1)[point[1]] != 1) {
                if (antArray.get(point[0] + 1)[point[1]] == 0) {
                    point[0]++;
                    antArray.get(point[0])[point[1]] = 9;
                } else if (antArray.get(point[0] + 1)[point[1]] == 2) {
                    point[0]++;
                    antArray.get(point[0])[point[1]] = 9;
                    break;
                }
            } else {
                break; // 경계에 다다랐을 때 탈출
            }
        }

        for (int[] ii : antArray) {
            for (int jj : ii) {
                System.out.print(jj + " ");
            }
            System.out.println();
        }
    }

}