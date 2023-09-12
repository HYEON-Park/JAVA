public class programmers_0911 {
    /**
     * factorial
     * 
     * @param args
     */
    public static void main(String[] args) {
        int n = 3628800;
        String str = String.valueOf(n);
        String[] arr = str.split("");

        int answer = 0;

        for (String string : arr) {
            answer *= Integer.parseInt(string);
        }

        System.out.println(answer);

    }
}
