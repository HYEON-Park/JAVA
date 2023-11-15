import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class baek_1115 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i < args.length; i++) {
            System.out.println(Integer.parseInt(br.readLine()) % 42);
            h.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.println(h.size());

        br.close();
        bw.flush();
        bw.close();
    }
}
