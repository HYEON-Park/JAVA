public class programmers_0822_약수구하기 {
    public static void main(String[] args) {
        int n = 24;

        int arr_cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr_cnt++;
            }
        }
        int[] answer = new int[arr_cnt];
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[cnt] = i;
                cnt++;
            }
        }

        // answer
    }
}
