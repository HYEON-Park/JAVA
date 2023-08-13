/**
 * programmers_잘라서배열로저장하기
 */
public class programmers_잘라서배열로저장하기 {

    public static void main(String[] args) {
        String my_str = "abc1Addfggg4556b";
        // abc1Ad dfggg4 556b
        int n = 6;

        String[][] result = new String[my_str.length() / n][my_str.length() % n];
        String[] arr = my_str.split("");

        int tmp = 0;
        String input = "";
        for (int i = 0; i < arr.length; i++) {
            if (tmp < n) {
                input + arr[i];
                break;
            }
            tmp = (tmp == n) ? 0 : tmp++;
        }

    }
}