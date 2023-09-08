public class programmers_0907 {
    public static void main(String[] args) {
        String my_str = "abcdef123";
        int n = 3;

        int cnt = (my_str.length() + n - 1) / n;
        String[] answer = new String[cnt];

        for (int i = 0; i < cnt; i++) {
            int start = n * i;
            // System.out.println(start);
            int end = 0;
            if (start + n >= my_str.length()) {
                System.out.println(start + n);
                end = my_str.length();
                System.out.println(end);
            } else {
                end = start + n;
            }
            answer[i] = my_str.substring(start, end);
        }

        System.out.println(answer[0].toString());
        System.out.println(answer[1].toString());
        System.out.println(answer[2].toString());
    }

}
