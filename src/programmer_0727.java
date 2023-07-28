public class programmer_0727 {
    /**
     * Programmers > 입문 > 가장 큰 수 찾기
     */
    public static void main(String[] args) {
        int[] array = { 9, 10, 11, 8 };

        int[] answer = new int[2];

        int temp = 0;
        int tmp_i = 0;
        for (int i = 0; i < array.length; i++) {
            if (temp < array[i]) {
                temp = array[i];
                tmp_i = i;
            }
        }
        answer[0] = temp;
        answer[1] = tmp_i;

        // return answer;
    }
}
