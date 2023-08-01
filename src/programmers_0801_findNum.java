public class programmers_0731 {
    /**
     * 프로그래머스 > 입문 > 숫자 찾기
     * 
     * @param args
     */
    public static void main(String[] args) {
        int answer = 0;
        int num = 232443;
        int k = 7;

        // 형변환
        String str_num = Integer.toString(num);
        char ch_k = (char) (k + 48);

        for (int i = 0; i < Integer.toString(num).length(); i++) {
            if (Integer.toString(num).charAt(i) == ch_k) {
                answer = i + 1;
                break;
            } else {
                answer = -1;
            }
        }
        System.out.println(answer);

    }
}
