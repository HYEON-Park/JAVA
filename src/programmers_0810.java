import java.util.Arrays;

public class programmers_0810 {
    /**
     * 문자열 정렬하기 (1)
     */
    public static void main(String[] args) {
        String my_string = "hi12392";

        my_string = my_string.replaceAll("([a-z])", "");

        String[] arr = my_string.split("");
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(answer);
        // return answer;

    }
}
