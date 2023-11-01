import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * baek_1031
 */
public class baek_1031 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[30];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 29; i++) {
            int n = Integer.parseInt(st.nextToken());
            arr[i] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                System.out.println(i);
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}