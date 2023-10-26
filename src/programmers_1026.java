public class programmers_1026 {
    public static void main(String[] args) {
        /*
         * 직사각형 넓이 구하기
         */
        int[][] dots = { { -1, -1 }, { 1, 1 }, { 1, -1 }, { -1, 1 } };

        int w = 0;
        int h = 0;
        int x = dots[0][0];
        int y = dots[0][1];
        for (int i = 1; i < dots.length; i++) {
            if (x != dots[i][0])
                w = Math.abs(x - dots[i][0]); // 넓이를 구할 변의 절대값을 구해준다.
            if (y != dots[i][1])
                h = Math.abs(y - dots[i][1]);
        }
        // return w * h;
        System.out.println(w * h);
    }
}
