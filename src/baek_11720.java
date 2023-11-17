import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * baek_11720
 */
public class baek_11720 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            ans += i;
        }

        System.out.println(ans);
    }
}