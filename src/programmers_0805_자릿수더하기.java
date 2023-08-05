public class programmers_0805_자릿수더하기 {
    public static void main(String[] args) {
        int n = 1234;
        int answer = 0;
        String str_n = Integer.toString(n);

        for (int i = 0; i < str_n.length(); i++) {
            // System.out.println(str_n.substring(i, i + 1));
            answer += Integer.parseInt(str_n.substring(i, i + 1));
        }
        System.out.println(answer);
    }
}
