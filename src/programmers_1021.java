public class programmers_1021 {
    public static void main(String[] args) {
        /**
         * 다항식 더하기
         */
        String polynomial = "7x + 4 + 9 + 5x";
        // String polynomial = "x + x + x";
        polynomial = polynomial.replaceAll(" ", "");
        String[] arr = polynomial.split("");

        int x = 0;
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("x")) {
                x += 1;

            } else if (Character.isDigit(arr[i].charAt(0)) == true) {
                if (arr[i + 1] != null && arr[i + 1].contains("x")) {
                    x += Integer.parseInt(arr[i]);
                } else if (arr[i + 1] != null && !arr[i + 1].contains("x")) {
                    answer += " + " + arr[i];
                }
                i += 1;
            }

        }

        String result = String.valueOf(x) + "x" + answer;
        System.out.println(result);

    }
}
