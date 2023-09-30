/**
 * pro0930_loginSuccess
 */
public class pro0930_loginSuccess {

    public static void main(String[] args) {
        String[] id_pw = { "meosseugi", "1234" };
        String[][] db = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };
        // login wrong pw fail

        String answer = "fail";
        for (String[] strings : db) {
            if (strings[0].equals(id_pw[0])) {
                answer = "wrong pw";
                if (strings[1].equals(id_pw[1])) {
                    answer = "login";
                }
            }
        }
        System.out.println(answer);
    }
}