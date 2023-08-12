import java.util.Arrays;

public class programmers_0811 {

    /**
     * 문자열 정렬하기 2
     * 
     */
    public static void main(String[] args) {
        String my_string = "BdfsHabCD";

        my_string = my_string.toLowerCase();
        char[] answer = my_string.toCharArray();
        Arrays.sort(answer);
        // return String.valueOf(answer);
    }
}
