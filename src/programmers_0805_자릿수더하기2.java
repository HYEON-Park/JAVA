import java.util.Arrays;
import java.util.stream.Stream;

/**
 * programmers_0805_자릿수더하기2
 */
public class programmers_0805_자릿수더하기2 {
    public static void main(String[] args) {
        int n = 1234;
        int answer = 0;

        String[] split = String.valueOf(n).split("");

        // Stream<String> test = Arrays.stream(split);
        // test.sorted().forEach(System.out::println);

        // 2)
        // Arrays.stream(split).mapToInt(Integer::parseInt);
        // System.out.println(Arrays.stream(split).mapToInt(Integer::parseInt).sum());

        // 1)
        // for (int i = 0; i < split.length; i++) {
        // answer += Integer.parseInt(split[i]);
        // }

    }
}