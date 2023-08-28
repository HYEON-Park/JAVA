public class programmers_0828 {
    public static void main(String[] args) {
        int[] array = { 1, 4, 2, 1 };
        int n = 3; // 기댓값 = 2

        int[] test = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            test[i] = n - array[i];
            if (test[i] < 0)
                test[i] = test[i] * -1;
        }

        int ans = 0;
        int min = test[0];
        for (int j = 0; j < test.length - 1; j++) {
            if (min > test[j + 1]) {
                min = test[j + 1];
                ans = j + 1;
            } else if (min == test[j + 1]) { // 반례가 있어서 추가
                int ban = array[j];
                if (ban > array[j + 1]) {
                    min = test[j + 1];
                    ans = j + 1;
                }
            }
        }
        System.out.println(array[ans]);
    }
}