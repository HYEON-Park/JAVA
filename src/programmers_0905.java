public class programmers_0905 {
    public static void main(String[] args) {
        /**
         * 합성수찾기
         */

        int n = 10;
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            // System.out.println(cnt);
            if (cnt >= 3)
                answer++;
        }

    }
}