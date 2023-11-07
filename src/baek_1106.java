import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baek_1106 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            arr[i] = str.substring(0, 1) + str.substring(str.length() - 1, str.length());
        }
        br.close();

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        // br.close();
        bw.flush();
        bw.close();
    }
}
