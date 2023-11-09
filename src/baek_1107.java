import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_1107 {
    public static void main(String[] args) throws IOException {
        /**
         * 백준 아스키코드
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // int answer = Integer.parseInt());
        String s = br.readLine();
        int n = s.charAt(0);
        System.out.println(n);
    }
}
