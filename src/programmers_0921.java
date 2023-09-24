public class programmers_0921 {
    public static void main(String[] args) {
        String[] quiz = { "3 - 4 = -3", "5 + 6 = 11" };

        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] str = quiz[i].split(" ");

            int sum = Integer.parseInt(str[0]);
            for (int j = 0; j < str.length; j++) {
                if (str[j].equals("+")) {
                    sum += Integer.parseInt(str[j + 1]);
                } else if (str[j].equals("-")) {
                    sum -= Integer.parseInt(str[j + 1]);
                } else if (str[j].equals("=")) {
                    answer[i] = (sum == Integer.parseInt(str[j + 1])) ? "O" : "X";
                }
            }
        }

        // System.out.println(answer.toString());
        for (String string : answer) {
            System.out.println(string);
        }
    }
}
/**
 * 3
 * -
 * 4
 * =
 * -3
 */