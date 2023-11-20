import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hub_3 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int sum = solution(n);
        System.out.println("RESULT: " + sum);

    }

    public static int solution(int n) {
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            sum += primeN(i);
        }

        return sum;
    }

    private static int primeN(int num) {
        if (num < 2) {
            return num;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return num;
    }
}
