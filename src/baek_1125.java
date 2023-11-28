import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_1125 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        str = str.trim();

        String[] arr = str.split(" ");

        if (arr.length == 1 && arr[0].equals("")) { // 공백입력의 경우 예외처리도 필요하다
            System.out.println(0);
        } else {
            System.out.println(arr.length);
        }
    }
}
