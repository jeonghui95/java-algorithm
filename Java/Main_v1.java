package Algorithm.Java;

import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static boolean c[];
    static int a[];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> Lst = new ArrayList<>();
        Lst.add(2);
        Lst.add(2);
        Lst.add(2);
        System.out.println(Lst);
        System.out.println("01");
    }

    // public static void go(int index) {
    // // 인덱스가 마지막 위치에 도달하면 수열 출력
    // if (index == m) {
    // for (int i = 0; i < m; i++) {
    // sb.append(a[i]).append(" ");
    // }
    // sb.append('\n');
    // return;
    // }
    // // 1부터 ~ N개의 수를 선택
    // for (int i = 1; i <= n; i++) {
    // if (c[i])
    // continue; // 이미 선택한적이 있으면 다음으로
    // c[i] = true; // 수 i를 사용
    // a[index] = i; // 해당 위치에 i를 넣는다.
    // go(index + 1); // 위치를 1증가 시키고 재귀
    // c[i] = false; // index 뒤에 일어날 모든 경우를 했기때문에 수 i를 사용하지 않았다고 바꾼다.
    // }
    // }
}