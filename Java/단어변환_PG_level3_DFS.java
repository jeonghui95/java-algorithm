package Algorithm.Java;

import java.io.*;
import java.util.*;


public class Main {

    static ArrayList<String> wordsArray;
    static String target;
//    static int depth = 0;
    static int minimum ;

    public static void main(String[] args) throws IOException {
        target = "cog";
        String begin = "hit";
        wordsArray = new ArrayList<>(Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
        minimum = wordsArray.toArray().length;
        convertWord(begin,0);
        System.out.printf(String.valueOf(minimum));
    }

    public static void convertWord(String currentword, int depth){
        for (String word : wordsArray.toArray(new String[0])) {
            int cnt = 0;
            for (int i = 0; i<word.length(); i++ ) {
                if (word.charAt(i) == currentword.charAt(i)) {
                    cnt += 1;
                }
            }
            if (cnt ==  word.length()-1){
                if (word.equals(target)){
                    if (minimum>depth+1) {
                        minimum = depth+1;
                    }
                }
                else {
                    wordsArray.remove(word);
                    convertWord(word,depth+1);
                    wordsArray.addFirst(word);
                }
                }
            }


        }

    }





class ConvertWord {
    public int convertWord(){


            return 0;
}
        }

