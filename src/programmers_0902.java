import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * programmers_0902
 */
public class programmers_0902 {

    public static void main(String[] args) {

        // StringBuffer sb = new StringBuffer(before); //바꾸기
        // String reversed_sb = sb.reverse().toString();
        // int answer = (reversed_sb.equals(after)) ? 1 : 0;

        String before = "olleh";
        String after = "hello";
        char[] b_char = before.toCharArray();
        char[] a_char = after.toCharArray();
        Arrays.sort(b_char);
        Arrays.sort(a_char);

        String b_string = new String(b_char);
        String a_string = new String(a_char);

        int ans = (b_string.equals(a_string)) ? 1 : 0;

    }
}