/**
 * programmers_7의개수
 */
public class programmers_7의개수 {

    public static void main(String[] args) {
        int[] array = { 7, 77, 17 };

        int answer = 0;
        String str = "";

        for (int i = 0; i < array.length; i++) {
            str = String.valueOf(array[i]);
            System.out.println(str);
            char[] cha = str.toCharArray();

            for (int j = 0; j < cha.length; j++) {
                if (cha[j] == '7') {
                    answer++;
                }
            }
        }
        // System.out.println(answer);
    }
}