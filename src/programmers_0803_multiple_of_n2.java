import java.util.ArrayList;
import java.util.Arrays;

/**
 * programmers_0803_multiple_of_n
 * 프로그래머스 > 코딩테스트 > n의 배수
 */
class programmers_0803_multiple_of_n2 {
    public ArrayList solution(int n, int[] numList) {

        ArrayList<Integer> answer = new ArrayList<>();

        for (Integer i : numList) {
            if (i % n == 0) {
                answer.add(i);
            }
        }
        return answer;
    }

}
