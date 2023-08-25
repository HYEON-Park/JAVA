public class programmers_공던지기 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6 };
        int k = 5;

        System.out.println(numbers[numbers[2 * (k - 1) % numbers.length]]);

    }
}
