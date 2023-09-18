import java.util.ArrayList;
import java.util.Arrays;

public class 한번만등장한문자0918 {
    public static void main(String[] args) {
        String s = "abdc";
        String answer = "";

        String[] arr = new String[s.length()];
        arr = s.split("");

        ArrayList<String> arrayList = new ArrayList<>();

        for (String string : arr) {
            if (!arrayList.contains(string)) {
                arrayList.add(string);
            }
        }

        // helo
        for (String string : arrayList) {
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                if (string.equals(arr[i])) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                answer += string;
            }
        }

        char[] answerArr = answer.toCharArray();
        Arrays.sort(answerArr);
        String str = new String(answerArr);

    }
}
