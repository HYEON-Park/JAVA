/**
 * programmers_0803_multiple_of_n
 * 프로그래머스 > 코딩테스트 > n의 배수
 */
public class programmers_0803_multiple_of_n {

    public static void main(String[] args) {
        int[] numlist = { 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int n = 3;

        int cnt = 0;
        int cnt_num = 0;
        for (int i : numlist) {
            if (i % n == 0) {
                cnt++;
            }
        }

        int[] answer = new int[cnt];
        for (int i : numlist) {
            if (i % n == 0) {
                answer[cnt_num] = i;
                System.out.println(cnt_num + " / " + i);
                cnt_num++;
            }
        }

    }
}