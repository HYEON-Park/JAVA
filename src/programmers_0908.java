/**
 * programmers_0908
 */
public class programmers_0908 {
    public static void main(String[] args) {
        int answer = 0;

        String my_str = "aAb1B2cC34oOp";
        String[] arr = my_str.split("[a-zA-Z]");

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].isEmpty()) {
                answer += Integer.parseInt(arr[i]);
            }
        }

    }
}