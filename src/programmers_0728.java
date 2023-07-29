public class programmers_0728 {
    /**
     * programmers_0728
     * 코딩테스트 연습 > 코딩테스트 입문 > 문자열 계산하기
     * 
     * @param args
     */
    public static void main(String[] args) {
        String my_string = "3 + 4 - 5";
        int answer = 0;

        String[] arr_my = my_string.split(" ");
        for (int i = 0; i < arr_my.length; i++) {
            if (i == 0) {
                answer += Integer.parseInt(arr_my[0]);
            } else if (arr_my[i].equals("+")) {
                answer += Integer.parseInt(arr_my[i + 1]);
            } else if (arr_my[i].equals("-")) {
                answer -= Integer.parseInt(arr_my[i + 1]);
            }

        }
        System.out.println(answer);

    }
}
