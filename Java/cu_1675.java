package Algorithm.Java;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

class cu_1675 {
    // static char[] charArray = {'a','b','c','d','e','f','g','h','i'}

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sentenceArray = br.readLine().split(" ");
        for (String jj : sentenceArray) {
            for (int ii = 0; ii < jj.length(); ii++) {
                int ascii = (int) jj.charAt(ii);
                if (ascii < 100) {
                    ascii = ascii + 23;
                    System.out.print((char) ascii);
                } else {
                    System.out.print(Character.toChars((ascii - 3)));
                }
            }
            System.out.print(" ");
        }

    }
}
