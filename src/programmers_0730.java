public class programmers_0730 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 3, 3, 4 }; // 3
        // int[] array = { 1, 1, 2, 2 }; //-1
        // int[] array = { 1 }; //1
        // int[] array = { 1, 2, 3, 1, 2, 3 }; // -1
        // int[] array = { 0, 0, 1 }; // 0

        int answer = 0;
        int one = 0;
        int two = 0;
        for (int i = 0; i < array.length; i++) {
            if (two == one) {
                System.out.println("-1 end " + two);
                answer = -1;
            }
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    two++;
                }

                if (one < two) {
                    answer = array[j];
                    one = two;
                }
            }

        }

        System.out.println("CHECK : " + answer);
    }
}
