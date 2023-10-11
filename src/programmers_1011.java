public class programmers_1011 {
    public static void main(String[] args) {
        /**
         * 등수매기기
         */

        int[][] score = { { 80, 70 }, { 90, 50 }, { 40, 70 }, { 50, 80 } };
        int[] sum = new int[score.length];
        int[] result = new int[score.length];

        int tmp = 0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < 2; j++) {
                tmp += score[i][j];
                sum[i] = tmp;
            }
            tmp = 0;
        }

        int tmp2 = 0;
        for (int i = 0; i < sum.length; i++) {
            tmp2 = sum[i];
            int rank = 1;
            for (int j = 0; j < sum.length; j++) {
                if (tmp2 < sum[j]) {
                    rank++;
                }
            }
            result[i] = rank;
        }

        // for (int i : result) {
        // System.out.println(i);
        // }

    }
}
