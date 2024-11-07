package Algorithm;

// import java.util.Arrays;
import java.io.*;

class sample {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine(); // bufferedwriter 의 기본형은 String

        int i = Integer.parseInt(s) + 10; // String 을 int로 형변환 후 +10 !!

        br.close(); // bufferedreader 도 입력을 마쳤다면 닫아주자

        bw.write("입력받은 값 : " + s); // 출력
        bw.newLine(); // 개행 메소드
        bw.write("입력받은 값 +10 : " + i + "\n"); // 이렇게 하니까 제대로 출력됨

        bw.flush(); // 남은 값 출력 && 버퍼 초기화
        bw.close(); // bufferedwriter 닫기
    }
}