public class pro_0925_ox {
    public static void main(String[] args) {
        String[] quiz = { "19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2" };

        for (int i = 0; i < quiz.length; i++) {
            String[] text = quiz[i].split(" ");
            int result = Integer.parseInt(text[0]) + (Integer.parseInt(text[2])) * (text[1].equals("+") ? 1:-1));
            quiz[i] = result == Integer.parseInt(text[4])? "O": "X";
        }

        //retrn quiz;
    }
}
