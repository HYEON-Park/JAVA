public class programmers_0801_hiddenNumSum {
    // 코딩테스트 입문 > 숨어있는 숫자의 덧셈 (1)

    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        int result = 0;

        String my_intstr = my_string.replaceAll("[^0-9]", "");

        for (int i = 0; i < my_intstr.length(); i++) {
            result += (int) (my_intstr.charAt(i) - 48);
        }
        System.out.println(result);
    }
}