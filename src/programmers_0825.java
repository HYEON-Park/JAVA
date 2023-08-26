import java.util.Arrays;
import java.util.List;

/**
 * programmers_0825
 * 중복된 문자 제거
 * 
 */
public class programmers_0825 {

    public static void main(String[] args) {
        String my_string = "people";
        String answer = "";

        String[] arr = my_string.split("");
        String[] resultArr = Arrays.stream(arr).distinct().toArray(String[]::new); // 순서 보장이 된다.
        System.out.println(Arrays.toString(resultArr));
    }
}