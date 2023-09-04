public class programmers_0904 {
    public static void main(String[] args) {
        /**
         * 삼각형의 완성조건 (1)
         * 
         * 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다
         */
        int[] sides = { 3, 6, 2 };
        int max = sides[0];
        int other = 0;
        for (int i = 0; i < sides.length; i++) {
            if (max < sides[i]) {
                max = sides[i];
            } else {
                other += sides[i];
            }
        }

        // System.out.println(max);
        // System.out.println(other);
        int answer = (max < other) ? 1 : 2;
    }
}
