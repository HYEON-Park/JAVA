public class programmers_0907 {
    public static void main(String[] args) {
        String my_str = "abcdef123";
        int n = 3;

        int cnt = (my_str.length() + n - 1) / n;
        String[] answer = new String[cnt];

        for (int i = 0; i < cnt; i++) {
            int s = n * i;
            int e = 0;
            if (s + n >= my_str.length()) {
                System.out.println(s + n);
                e = my_str.length();
                System.out.println(e);
            } else {
                e = s + n;
            }
            answer[i] = my_str.substring(s, e);
        }

        System.out.println(answer[0].toString());
        System.out.println(answer[1].toString());
        System.out.println(answer[2].toString());
    }

}
