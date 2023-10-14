/**
 * programmers_1014
 * 
 * 등차수열 , 등비수열 다음 수 구하기
 */
public class programmers_1014 {

    public static void main(String[] args) {
        int[] common = { 1, 2, 4 };
        int answer = 0;

        if ((common[1] - common[0]) == (common[2] - common[1])) {
            answer = common[common.length - 1] + (common[1] - common[0]);
        } else {
            answer = common[common.length - 1] * (common[2] - common[1]);
        }
        System.out.println(answer);
    }
}