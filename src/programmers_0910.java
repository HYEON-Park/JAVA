public class programmers_0910 {
    public static void main(String[] args) {
        /**
         * 주사위의 개수
         */
        int[] box = { 10, 8, 6 };
        int n = 3;
        int ans = 1;

        for (int i = 0; i < box.length; i++) {
            ans *= box[i] / n;
        }

        // System.out.println(ans); return ans;

    }
}
