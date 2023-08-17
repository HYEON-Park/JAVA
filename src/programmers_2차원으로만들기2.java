/**
 * programmers_2차원으로만들기2
 */
public class programmers_2차원으로만들기2 {
    public static void main(String[] args) {
        int[] num_list = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = 2;
        // System.out.println(num_list.length / n);
        int[][] result = new int[num_list.length / n][n];

        for (int i = 0; i < num_list.length; i++) {
            System.out.println(i / n);
            System.out.println(i % n);
            System.out.println();
        }
    }

}
