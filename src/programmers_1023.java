public class programmers_1023 {
    /**
     * 다항식더하기
     */
    public static void main(String[] args) {
        String polynomial = "7x + 4 + 9 + 5x";
        // String polynomial = "x + x + x";

        int xnum = 0;
        int num = 0;

        for (String string : polynomial.split(" ")) {
            // System.out.println(string);
            if (string.contains("x")) {
                xnum += string.equals("x") ? 1 : Integer.parseInt(string.replace("x", ""));
            } else if (!string.equals("+")) {
                num += Integer.parseInt(string);
            }

        }

        String result = (xnum != 0 ? xnum > 1 ? xnum + "x" : "x" : "") + (num != 0 ? (xnum != 0 ? " + " : "")
                + num : xnum == 0 ? "0" : "");
        // return result;
        System.out.println(xnum);
        System.out.println(num);
    }
}
