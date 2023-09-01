public class programmers_0901 {
    /**
     * 369게임
     * 
     * @param args
     */
    public static void main(String[] args) {
        int order = 99993;
        int answer = 0;

        String order_str = Integer.toString(order);

        for (int i = 0; i < order_str.length(); i++) {
            if (order_str.charAt(i) == '3')
                answer++;
            if (order_str.charAt(i) == '6')
                answer++;
            if (order_str.charAt(i) == '9')
                answer++;
        }
        System.out.println(answer);
    }
}
