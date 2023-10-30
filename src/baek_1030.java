import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baek_1030 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        /**
         * 백준 배열 최대값
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0; // 최대값 변수
        int loc = 0; // 입력순서 변수

        for (int i = 0; i < 9; i++) {

            int num = Integer.parseInt(br.readLine());
            if (max < num) {
                max = num;
                loc = (i + 1);
            }
        }

        System.out.println(max + "\n" + loc);

        br.close();
        bw.flush();
        bw.close();
    }
}
