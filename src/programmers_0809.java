import java.util.Arrays;
import java.util.Collections;

public class programmers_0809 {
    /**
     * 진료 순서 정하기
     * 
     */
    public static void main(String[] args) {
        int[] emergency = { 3, 76, 24 };

        int[] ans = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] <= emergency[j]) {
                    ans[i] += 1;
                }
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
