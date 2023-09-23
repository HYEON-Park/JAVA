import java.util.ArrayList;
import java.util.Arrays;

public class programmers_0923 {
    public static void main(String[] args) {
        // int[] numbers = { 0, -31, 24, 10, 1, 9 };
        int[] numbers = { 1, 2, -3, 4, -5 };

        int answer = numbers[0] * numbers[1];

        // System.out.println(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] != numbers[j]) {
                    answer = (answer < numbers[i] * numbers[j]) ? answer = numbers[i] * numbers[j] : answer;
                }
            }
        }

        System.out.println(answer);
    }
}
