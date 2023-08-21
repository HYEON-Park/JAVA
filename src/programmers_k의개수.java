public class programmers_k의개수 {
    public static void main(String[] args) {
        // https://school.programmers.co.kr/learn/courses/30/lessons/120887
        int i = 1;
        int j = 13;
        int k = 1;
        String str_num = Integer.toString(k);
        int result = 0;

        for (int l = i; l <= j; l++) {
            String str = Integer.toString(l);
            for (int m = 0; m < str.length(); m++) {
                if (str.charAt(m) == Integer.toString(k).charAt(0)) {
                    System.out.println(str);
                    result++;

                }
            }
        }

        System.out.println(result);

    }
}
