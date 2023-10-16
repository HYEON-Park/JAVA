/**
 * programmers_1016
 */
public class programmers_1016 {
    public static void main(String[] args) {
        String bin1 = "10";
        String bin2 = "11";

        int int1 = Integer.parseInt(bin1, 2);
        int int2 = Integer.parseInt(bin2, 2);

        String answer = Integer.toBinaryString(int1 + int2); // 2진수 string 변환

        System.out.println(answer);
    }
}