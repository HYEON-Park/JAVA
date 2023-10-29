import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class programmers_1029 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        /**
         * 백준 개수세기
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int w = Integer.parseInt(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            if (w == arr[i]) {
                cnt++;
            }
        }

        System.out.println(cnt);

        br.close();
        bw.flush();
        bw.close();

    }
}
