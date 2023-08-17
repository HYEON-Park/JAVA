/**
 * programmers_2차원으로만들기
 */
public class programmers_2차원으로만들기 {

    public static void main(String[] args) {
        int[] num_list = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = 2;
        // System.out.println(num_list.length / n);
        int[][] result = new int[num_list.length / n][n];

        int tmp = 0;
        for (int i = 0; i < num_list.length / 4; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = num_list[tmp];
                tmp++;
            }
        }
    }
}