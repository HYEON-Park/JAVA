import java.util.ArrayList;
import java.util.List;

public class programmers_약수구하기2 {
    public static void main(String[] args) {
        int n = 24;

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (n % i == 0) {
                answer.add(i);
            }
        }

        int[] ans_arr = answer.stream().mapToInt(x -> x).toArray();
    }
}
