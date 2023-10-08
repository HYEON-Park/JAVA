import java.util.Arrays;

public class programmers_1008 {
    /**
     * 삼각형의 완성조건 (2)
     */

    public static void main(String[] args) {
        int[] sides = { 1, 2 };

        Arrays.sort(sides);
        int answer = 0;

        int max = sides[1];
        int min = sides[0];

        int low_range = max - min;
        int high_range = max + min;

        answer = high_range - low_range - 1;

        // return answer;
        // System.out.println(answer);
    }

    // System.out.println(solution(sides));

}
