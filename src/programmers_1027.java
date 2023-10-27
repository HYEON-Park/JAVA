import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class programmers_1027 {
    /**
     * BufferedReader / StringTokenizer
     * 
     * BufferedReader
     * Scanner 보다 속도가 빠르다 , scanner는 다양한 기능을 지원해서 무겁기 때문
     * 
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        // StringTokenizer st = new StringTokenizer(br.readLine());

        String test = "i@@get@@up@@at@@7am";
        StringTokenizer st = new StringTokenizer(test, "@@");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());

        }
    }
}
