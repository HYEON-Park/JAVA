import java.util.ArrayList;
import java.util.List;

public class hub_1 {
    public static void main(String[] args) {

        List<test> test = new ArrayList<>();
        test.add(new test(1, 5));
        test.add(new test(3, 3));
        test.add(new test(2, 4));
        // 번호,점수
        int[][] arrtest = { { 1, 5 }, { 5, 5 }, { 2, 4 } };

        int a = 0;
        int b = 0;
        int c = 0;
        for (int[] is : arrtest) {
            if (is[0] == 1)
                a += is[1];
            if (is[0] == 3)
                b += is[1];
            if (is[0] == 5)
                c += is[1];
        }

        int max = Math.max(a, Math.max(b, c));
        System.out.println(
                ((a == max) ? " a:" + max : "") + ((b == max) ? " b:" + max : "") + ((c == max) ? " c:" + max : ""));

    }

}
