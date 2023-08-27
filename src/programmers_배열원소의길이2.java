import java.util.Arrays;

/**
 * programmers_배열원소의길이2
 */
public class programmers_배열원소의길이2 {

    public static void main(String[] args) {
        String[] strList = { "We", "are", "the", "world!" };

        // Arrays.stream(strList).mapToInt(String::length);
        System.out.println(Arrays.stream(strList).mapToInt(String::length).toArray());
    }
}