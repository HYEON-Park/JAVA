import java.util.Arrays;

public class programmers_1015 {
    public static void main(String[] args) {
        String[] spell = { "z", "d", "x" };
        String[] v = { "def", "dww", "dzx", "loveaw" };
        int answer = 2; // 있으면 1 없으면 2;

        for (String string : v) {
            int cnt = 0;
            for (String abc : spell) {
                if (string.contains(abc) == true)
                    cnt++;
            }

            if (cnt == spell.length) {
                answer = 1;
            }
        }

        System.out.println(answer + "ans");

    }
}
