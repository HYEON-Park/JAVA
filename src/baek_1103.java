import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * baek_1103
 */
public class baek_1103 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            ans += i;
        }

        System.out.println(ans);

        br.close();
        bw.flush();
        bw.close();

    }
}