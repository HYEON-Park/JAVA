public class programmers_1019 {
    /**
     * 연속된 수의 합
     */
    public static void main(String[] args) {
        int num = 3;
        int total = 12;

        int[] answer = new int[num];

        int st = (total / num) - (num - 1) / 2;
        System.out.println(st);

        for (int i = 0; i < answer.length; i++) {
            answer[i] = st;
            st++;
        }

        for (int i : answer) {
            System.out.println(i);
        }

    }
}
