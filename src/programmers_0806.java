public class programmers_0806 {
    /**
     * 문자열 안에 문자열
     */
    public static void main(String[] args) {
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        int answer = 0;

        if (str1.contains(str2))
            answer = 1;
        else
            answer = 2;

        System.out.println(answer);
    }
}
