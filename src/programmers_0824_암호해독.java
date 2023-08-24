public class programmers_0824_암호해독 {
    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;

        String ans = "";
        for (int i = code - 1; i < cipher.length(); i += code) {
            ans += cipher.charAt(i);
        }
    }
}
