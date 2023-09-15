public class programmers_factorial {
    public static void main(String[] args) {
        int n = 7;
        int answer = 0;
        int num = 1;
        int hab = 1;

        while (hab < n) {

            hab = hab * ++num;

            if (hab > n) {
                --num;
                break;
            }

        }

    }

}
